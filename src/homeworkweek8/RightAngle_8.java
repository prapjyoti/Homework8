package homeworkweek8;
/*
Display right angle triangle of @ using nested for loops
      @
     @@
    @@@
   @@@@
  @@@@@
 */

public class RightAngle_8 {
    public static void angle() {
        for (int x = 1; x <= 5; x++) {
            System.out.println(" ");
            for (int y = 1; y <= x; x++) {
                System.out.print("@");}
                System.out.println();
            }
        }

    public static void main(String[] args) {
        RightAngle_8.angle();

    }
}