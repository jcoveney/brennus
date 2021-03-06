package brennus.model;

import static brennus.model.ExceptionHandlingVisitor.wrap;

public class LiteralExpression extends Expression {

  private final Object value;
  private final ExistingType type;

  public LiteralExpression(int value) {
    this.value = value;
    this.type = ExistingType.INT;
  }

  public LiteralExpression(String value) {
    this.value = value;
    this.type = ExistingType.STRING;
  }

  @Override
  public void accept(ExpressionVisitor expressionVisitor) {
    wrap(expressionVisitor).visit(this);
  }

  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "[" + getClass().getSimpleName() + " " + value + "]";
  }

  public ExistingType getType() {
    return type;
  }
}
