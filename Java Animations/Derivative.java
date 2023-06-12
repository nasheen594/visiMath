import java.awt.Font;

public class Derivative extends Animations {

   String[] categories = {"Calculus"};

   @Override
   public void visual(){

      StdDraw.setCanvasSize(800, 800);
      StdDraw.setXscale(0, 2 * Math.PI);
      StdDraw.setYscale(-2,4);

      double increment = 0.01;
      // x - axis
      StdDraw.line(0,0,2 * Math.PI, 0);
      StdDraw.setPenRadius(0.01);

      // Top text
      StdDraw.setFont(new Font("Arial", Font.BOLD, 24));
      StdDraw.text(Math.PI, 3.7, "The Derivative");

      // resetting font java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=16]
      StdDraw.setFont(new Font("SansSerif", 0, 20));
      StdDraw.text(Math.PI, 3.5, "The Derivative tells us the behavior of f(x). Notice when");
      StdDraw.text(Math.PI, 3.3, "f(x) is decreasing, f'(x) is negetive,");
      StdDraw.text(Math.PI, 3.1, "and when f(x) is increasing, f'(x) positive");


      StdDraw.text(Math.PI / 2, 2.7, "d/dx [sin(\u03B8)] = cos(\u03B8)");


      // drawing f(x) = sin(x) f'(x) = cos(x)
      StdDraw.setPenColor(StdDraw.RED);
      for (double x = 0; x <= 2 * Math.PI; x += increment) {
         final double y = Math.sin(x);
         StdDraw.point(x,y);

         StdDraw.setPenColor(StdDraw.BLUE);
         final double z = Math.cos(x);
         StdDraw.point(x,z);
         StdDraw.setPenColor(StdDraw.RED);

      }

      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.setFont(new Font("SansSerif", 0, 20));
      StdDraw.text(Math.PI, 2.2, "The Derivative also tells us the rate of change");
      StdDraw.text(Math.PI, 2.0, "at any point, opposed to over an interval.");
      StdDraw.text(Math.PI, 1.8, "So, cos(\u03C0/3) and/or cos(60\u00B0) = 1/2 means our");
      StdDraw.text(Math.PI, 1.6, "sin function is incresing at 1/2 units when x = \u03C0/2");


   }
}
