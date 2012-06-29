package brennus.model;


abstract public class Type {

  abstract public void accept(TypeVisitor typeVisitor);

  abstract public String getName();

  abstract public String getClassIdentifier();

  abstract public String getSignature();

  abstract public boolean isPrimitive();

  abstract public Method getMethod(String methodName);

  abstract public boolean isAssignableFrom(Type type);

  @Override
  public String toString() {
    return "["+getClass().getSimpleName()+" "+getName()+"]";
  }

}
