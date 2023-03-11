package KeThua;

/**
 *
 * @author VQ
 */
public class Shape {
   public String color ="red";
   public boolean filled = true;

    public Shape() {
    }
    public Shape(boolean filled , String color)
    {
    this.color = color;
    this.filled =filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
class Circle extends Shape
{
    double pi = Math.PI;
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color ,boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled =filled;
    }
    public double getArea()
    {
    return pi*Math.pow(radius, 2);
    }
    public double getPerimeter()
    {
     return pi*2*radius;
    }

}
class Rectangle extends Shape
{
public double width=1.0;
public double length=1.0;
public Rectangle(){}
public Rectangle(double width,double length)
{
    this.width = width;
    this.length =length;
}
public Rectangle (double width,double length,String color,boolean filled)
{
    this.width = width;
    this.length =length;
    this.color = color;
     this.filled =filled;
}
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*(length+width);
    }
}
class Square extends Rectangle
{
   public double side;
 public Square(){}
 public Square(double side)
 {
 super(side,side);
 }
 public Square(double side ,String color ,boolean filled)
 {
 this.side = side;
 this.color=color;
 this.filled=filled;
 }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

public static void main(String[] args) {
    // Tạo đối tượng Circle
    Circle circle = new Circle(5, "blue", true);
    System.out.println("Circle radius: " + circle.getRadius());
    System.out.println("Circle color: " + circle.getColor());
    System.out.println("Circle is filled: " + circle.isFilled());
    System.out.println("Circle area: " + circle.getArea());
    System.out.println("Circle perimeter: " + circle.getPerimeter());

    // Tạo đối tượng Rectangle
    Rectangle rectangle = new Rectangle(4, 6, "green", false);
    System.out.println("Rectangle width: " + rectangle.getWidth());
    System.out.println("Rectangle length: " + rectangle.getLength());
    System.out.println("Rectangle color: " + rectangle.getColor());
    System.out.println("Rectangle is filled: " + rectangle.isFilled());
    System.out.println("Rectangle area: " + rectangle.getArea());
    System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

    // Tạo đối tượng Square
    Square square = new Square(3, "yellow", true);
    System.out.println("Square side: " + square.getSide());
    System.out.println("Square color: " + square.getColor());
    System.out.println("Square is filled: " + square.isFilled());
    System.out.println("Square area: " + square.getArea());
    System.out.println("Square perimeter: " + square.getPerimeter());
}
}

