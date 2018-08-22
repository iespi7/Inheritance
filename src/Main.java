public class Main {

  public static void main(String[] args) {
    Ball b1 = new BowlingBall();
    Ball b2 = new BowlingBall();
    Ball b3 = new BowlingBall();
    b1.diameter = 25;
    b3 = b1;
    b3.diameter = 26;
    System.out.println(b1.diameter);
//    b1.roll();
//    ((BowlingBall) b2).reset();
//    System.out.println(b3.getCount());
//    System.out.println(((BowlingBall) b3).getCount());
//    Ball[] balls = {new BowlingBall(), new Football(), new BowlingBall()};
//    for (Ball b : balls) {
//      b.roll();
//      b.bounce();
//      System.out.println(b.getColor());
//    }
//    System.out.println(Ball.getCount());
//    System.out.println(BowlingBall.getCount());
//    balls[0].weight = 14;
//    balls[2].weight = 16;
//    System.out.println(balls[1].weight);
  }
}
