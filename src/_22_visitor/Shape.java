package _22_visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
