public class BowlingBall extends Ball {

  private static int count;

  public BowlingBall() {
    count += 2;
  }

  @Override
  public void roll() {
    System.out.println("Rolling down the lane");
  }

  public void reset() {
    System.out.println("Return the ball to the bowler");
  }

  public static int getCount() {
    return count;
  }

  void bounce() {
    System.out.println("You've been kicked out of the bowling alley for bouncing a bowling ball");
  }
}
