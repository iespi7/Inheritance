import java.awt.Color;

public class Football extends Ball {

  public Football() {
    super(Color.GREEN);
  }

  @Override
  public void roll() {
    System.out.println("Does not roll so much as bounce erratically");
  }
}
