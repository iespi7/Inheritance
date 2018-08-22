import java.awt.Color;

public abstract class Ball {

  public static int weight;

  public int diameter;

  private static int count;

  private Color color;

  protected Ball() {
   this(Color.BLACK);
  }

  protected Ball(Color color) {
    this.color = color;
    count ++;
  }

  public abstract void roll();

  void bounce () {
    System.out.println("I hope you know what you're doing");
  }

  public static int getCount() {
    return count;
  }

  public Color getColor() {
    return color;
  }

}
