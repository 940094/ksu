public class NineOneThis
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(4, 40);
    Rectangle r2 = new Rectangle(3.5, 35.9);
    System.out.println("Rectangle 1:");
    System.out.println("height:\t" + r1.height);
    System.out.println("width:\t" + r1.width);
    System.out.println("area:\t" + r1.getArea());
    System.out.println("perim:\t" + r1.getPerimeter());
    System.out.println("\nRectangle 2:");
    System.out.println("height:\t" + r2.height);
    System.out.println("width:\t" + r2.width);
    System.out.println("area:\t" + r2.getArea());
    System.out.println("perim:\t" + r2.getPerimeter());
  }
}

class Rectangle
{
  double height;
  double width;

  Rectangle()
  {
    this.height = 1;
    this.width = 1;
  }

  Rectangle(double newWidth, double newHeight)
  {
    this.width = newWidth;
    this.height = newHeight;
  }

  double getArea()
  {
    return height * width;
  }

  double getPerimeter()
  {
    return height * 2 + width * 2;
  }
}
