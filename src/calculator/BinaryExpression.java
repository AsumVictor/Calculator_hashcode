package calculator;

public abstract class BinaryExpression implements Expression {

    private final Expression lft;
    private final Expression rht;
    private final String operator;

    public BinaryExpression(final Expression lft, final Expression rht, final String operator) {
        this.lft = lft;
        this.rht = rht;
        this.operator = operator;
    }

    @Override
    public double evaluate(final Bindings bindings) {
        double lftV = lft.evaluate(bindings);
        double rhtV = rht.evaluate(bindings);
        return _applyOperator(lftV, rhtV);
    }

    protected abstract double _applyOperator(double lftV, double rhtV);

    @Override
    public String toString()
    {
        return "(" + lft + " " + operator + " " + rht + ")";
    }
}
