public class FirstDerivativeTest extends Animations{

   String[] categories = {"Calculus"};
   public static void main(String[] args) {
      StdDraw.setCanvasSize(800, 800);
      StdDraw.setXscale(0,10);
      StdDraw.setYscale(0,10);

      double inc = 0.01;
      double y = 2;
      double x;

      // boolean keys to draw grid lines
      // brings down overhead cost
      boolean key2 = true; // key 2 bc x == 2
      boolean key3 = true;
      boolean key4 = true;
      boolean key5 = true;
      boolean key6 = true;
      boolean key7 = true;
      boolean key8 = true;


      for (x = 1; x <= 9; x+= inc) {
         // draws horizontal line
         StdDraw.point(x,y);

         // front arrow head
         if (x == 1) {
            StdDraw.line(1,2,1.25,2.25);
            StdDraw.line(1,2,1.25,1.75);
         } else if (key2 && x > 2) {
            StdDraw.line(2,1.875,2,2.125);
            key2 = false;
         } else if (key3 && x > 3) {
            StdDraw.line(3,1.875,3,2.125);
            key3 = false;
         } else if (key4 && x > 4) {
            StdDraw.line(4,1.875,4,2.125);
            key4 = false;
         } else if (key5 && x > 5) {
            StdDraw.line(5,1.875,5,2.125);
            key5 = false;
         } else if (key6 && x > 6) {
            StdDraw.line(6,1.875,6,2.125);
            key6 = false;
         } else if (key7 && x > 7) {
            StdDraw.line(7,1.875,7,2.125);
            key7 = false;
         } else if (key8 && x > 8) {
            StdDraw.line(8,1.875,8,2.125);
            key8 = false;
         }

      }

      StdDraw.line(9,2,8.75,2.25);
      StdDraw.line(9,2,8.75,1.75);

   }

   public static boolean isInt(double number) {
      return number == (int) number;
   }
}
