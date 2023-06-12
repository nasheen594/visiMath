// Pythagorean Theorem Visual

import java.awt.Font;

public class Pythag extends Animations {
   // These are the categories that this animation can be found in on the front end
   String[] categories = { "Pre-Calc", "Geometry", "Trigonometry", "Algrebr I", "Algrbra II" };

   // set a global variable list
   // will have all the categories this
   // animation should be included in
   @Override
   public void visual() {
      // Setting the scale
      StdDraw.setCanvasSize(width, height); // inhereited variables
      StdDraw.setXscale(0,16 );
      StdDraw.setYscale(0,16 );

      double increment = 0.02; // step for drawing
      // Draw Triangle
      StdDraw.setPenColor(StdDraw.BLACK);
      // Draw Vertical line first
      // StdDraw.line(6,6,6,9);

      double y = 9;
      double x = 6;
      while(y >= 6 ){
         StdDraw.point(x,y);
         y -= increment;
      }

      // Draw Horizontal Line
      y = 6;
      while(x <= 10) {
         StdDraw.point(x, y);
         x+= increment;
      }
      // Draw Hypotenuse

      x = 10.0;
      y = 6.0;
      increment = 0.01;

      while (x >= 6.0 && y <= 9.0) {
         StdDraw.point(x, y);
         x -= increment;
         y += increment * (3.0 / 4.0);
      }

      StdDraw.show();

      // Right angle sign

      StdDraw.line(6,6.5,6.5,6.5);
      StdDraw.line(6.5,6,6.5,6.5);

      // Drawing first square
      StdDraw.setPenColor(StdDraw.BLUE);

      x =6; y = 6;

      while(y <= 9) {
         StdDraw.point(x,y);
         y += increment;
      }

      while (x >= 3) {
         StdDraw.point(x,y);
         x -= increment;
      }

      StdDraw.text(4.5,9.3,"a = 3");


      while(y >= 6) {
         StdDraw.point(x,y);
         y -= increment;
      }

      while (x <= 6) {
         StdDraw.point(x,y);
         x += increment;
      }

      StdDraw.text(4.5,7.5,"a\u00B2 = 9");

      // Base Square

      StdDraw.setPenColor(StdDraw.RED);

      while(x <= 10) {
         StdDraw.point(x,y);
         x += increment;
      }
      StdDraw.text(8,6.3,"b = 4");

      while (y >= 2) {
         StdDraw.point(x,y);
         y -= increment;
      }


      while(x >= 6) {
         StdDraw.point(x,y);
         x -= increment;
      }

      while (y <= 6) {
         StdDraw.point(x,y);
         y += increment;
      }

      StdDraw.text(8,4,"b\u00B2 = 16");


      // HYPOTENUSE SQUARE

      // first line is hypotenuse

      StdDraw.setPenColor(StdDraw.GREEN);
      x = 10; y = 6;
      while(x >= 6 && y <= 9) {
         StdDraw.point(x,y);
         x -= increment;
         y += increment * (3.0 / 4.0);
      }

      StdDraw.text(8.3,7.8,"c = 5");

      while(x <= 9 && y <= 13) {
         StdDraw.point(x,y);
         x += increment * (3.0 / 4.0);
         y += increment ;
      }

      while(x <= 13 && y >= 10) {
         StdDraw.point(x,y);
         x += increment;
         y -= increment * (3.0 / 4.0);
      }

      while(x >= 10 && y >= 6) {
         StdDraw.point(x,y);
         x -= increment * (3.0 / 4.0);
         y -= increment;
      }

      StdDraw.text(10,9,"c\u00B2 = 25");

      Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 40);
      StdDraw.setFont(font);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.text(5,12,"\u2234 a\u00B2 + b\u00B2 = c\u00B2 ");

      StdDraw.show();
   }
}
