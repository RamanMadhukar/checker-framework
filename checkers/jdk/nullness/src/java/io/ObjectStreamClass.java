package java.io;

import dataflow.quals.Pure;
import dataflow.quals.SideEffectFree;
import checkers.nullness.quals.Nullable;


public class ObjectStreamClass implements Serializable {
  private static final long serialVersionUID = 0;
  protected ObjectStreamClass() {}
  public final static ObjectStreamField[] NO_FIELDS = {};
  public static @Nullable ObjectStreamClass lookup(Class<?> a1) { throw new RuntimeException("skeleton method"); }
  public static ObjectStreamClass lookupAny(Class<?> a1) { throw new RuntimeException("skeleton method"); }
  public String getName() { throw new RuntimeException("skeleton method"); }
  public long getSerialVersionUID() { throw new RuntimeException("skeleton method"); }
  public @Nullable Class<?> forClass() { throw new RuntimeException("skeleton method"); }
  public ObjectStreamField[] getFields() { throw new RuntimeException("skeleton method"); }
  public @Nullable ObjectStreamField getField(String a1) { throw new RuntimeException("skeleton method"); }
  @SideEffectFree public String toString() { throw new RuntimeException("skeleton method"); }
}
