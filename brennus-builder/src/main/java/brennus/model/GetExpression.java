package brennus.model;

public class GetExpression extends Expression {

  private final String fieldName;

  public GetExpression(String fieldName) {
    this.fieldName = fieldName;
  }

  @Override
  public void accept(ExpressionVisitor expressionVisitor) {
    expressionVisitor.visit(this);
  }

  public String getFieldName() {
    return fieldName;
  }

  @Override
  public String toString() {
    return getClass().getName()+" "+fieldName;
  }
}