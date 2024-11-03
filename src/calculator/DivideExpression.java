package calculator;

class DivideExpression
   extends BinaryExpression
{
   public DivideExpression(final Expression lft, final Expression rht)
   {
       super(lft, rht, "/");
   }

   @Override
   protected double _applyOperator(double lftV, double rhtV) {
      return lftV / rhtV;
   }

}

