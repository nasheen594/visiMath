// Sin^2 + cos^2 = 1 Visual

import java.awt.Font;

public class Animations1Helper extends Animations {
   @Override
   public void visual() {
      // Set up the drawing window
//      final int width = 800;
//      final int height = 800;
      StdDraw.setCanvasSize(width, height); // inherited variables
      StdDraw.setXscale(0, Math.PI * 2);
      StdDraw.setYscale(-1, 2);

      // Fill the background with a color
      StdDraw.clear(StdDraw.WHITE);

      // Draw the x-axis
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.line(0, 0, Math.PI * 2, 0);

      // Draw and fill the cosine wave

      final double amplitude = 1;
      final double frequency = 1.0;
      final double phase = 0.0;
      final double stepSize = 0.01;

      StdDraw.setPenColor(StdDraw.BLACK);
      for (double x = 0; x <= Math.PI * 2; x += stepSize) {

         StdDraw.point(x, 1);

      }
      StdDraw.line(Math.PI, 1, 3*Math.PI/2, 1.5);
      StdDraw.text(3*Math.PI/2, 1.6, "y = 1");

      StdDraw.setFont(new Font("Arial", Font.BOLD, 20));

      // Unicode escape for pi is \u03C0

      // 0
      StdDraw.line(0, 0, Math.PI/4, -0.5);
      StdDraw.text(Math.PI/4, -0.6, "0");

      // pi/2
      StdDraw.line(Math.PI/2, -0.5, Math.PI/2, 1);
      StdDraw.text(Math.PI/2,-0.6, "\u03C0/2");

      // pi
      StdDraw.line(Math.PI, -0.5, Math.PI, 1);
      StdDraw.text(Math.PI,-0.6, "\u03C0");

      // 3 pi/2
      StdDraw.line(3 * Math.PI/2, -0.5, 3*Math.PI/2, 1);
      StdDraw.text(3*Math.PI/2,-0.6, "3\u03C0/2");

      // 2 pi
      StdDraw.line(2 * Math.PI, 0, 7*Math.PI/4, -0.5);
      StdDraw.text(7 * Math.PI/4, -0.6,"2\u03C0");


      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.text(0.5,1.75, "cos\u00B2(\u03B8)");

      for (double x = 0; x <= Math.PI * 2; x += stepSize) {
         final double y = amplitude * Math.cos(frequency * x + phase) * Math.cos(frequency * x + phase);
         StdDraw.point(x, y);
         StdDraw.line(x, 0, x, y);
      }

      // final display
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.text(0.5,1.25, "sin\u00B2(\u03B8)");

      for (double x = 0; x <= Math.PI * 2; x += stepSize) {
         final double y = ((amplitude * Math.sin(frequency * x + phase) * Math.sin(frequency * x + phase) ) / -1) + 1;
         StdDraw.point(x, y);
         StdDraw.line(x,1,x,y );
      }

      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.line(Math.PI/2, 0, Math.PI/2, 1);
      StdDraw.line(Math.PI, 0, Math.PI, 1);
      StdDraw.line(3 * Math.PI/2, 0, 3*Math.PI/2, 1);

      StdDraw.text( Math.PI, 1.5, "cos\u00B2(\u03B8) + sin\u00B2(\u03B8) = 1");


      // Display the drawing
      StdDraw.show();
   }
}
