import java.util.Stack;

public class UnitCircle extends Animations {
   static Stack<String> valuePairs = new Stack<>();
   String[] categories = {"Algebra II", "Pre-calc", "Trigonometry", "Calculus"};

   static String[] points = {"1, 0", "√3/2, 1/2", "√2/2, √2/2", "1/2, √3/2", "0, 1", "-1/2, √3/2",
                        "-√2/2, √2/2", "-√3/2, 1/2", "-1, 0" ,"-√3/2, -1/2", "-√2/2, -√2/2",
                        "-1/2, -√3/2", "0, -1", "1/2, -√3/2", "√2/2, -√2/2", "√3/2, -1/2", "1, 0"};

   public static void main(String[] args) {
      StdDraw.setCanvasSize(800,800);
      StdDraw.setXscale(-6,6);
      StdDraw.setYscale(-6,6);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.text(0,5.5,"The Unit Circle");

      for (int i = points.length - 1; i >= 0; i--) {
         valuePairs.push(points[i]);
      }

      // draw top half of circle
      double y = 0;
      double inc = 0.005;
      for (double x = -1; x <= 1; x += inc) {

         y =  Math.sqrt(1 - (x * x));
         StdDraw.point(x,y);
      }

      // Drawing tip bottom circle
      for (double x = -1; x <= 1; x += inc) {

         y =  - Math.sqrt(1 - (x * x));
         StdDraw.point(x,y);
      }
      

      // Quadrant 1
      StdDraw.line(0,0,1,0);
      StdDraw.text(1 + 0.5,0, "(1, 0)");
      StdDraw.pause(500);

      StdDraw.line(0,0,Math.sqrt(3) / 2,0.5);
      StdDraw.text(0.75 + (Math.sqrt(3) / 2),0.5, "(\u221A3/2, 1/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,Math.sqrt(2) / 2,Math.sqrt(2) / 2);
      StdDraw.text(0.75 + Math.sqrt(2) / 2,(Math.sqrt(2) / 2) + 0.125, "(\u221A2/2, \u221A2/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,0.5,Math.sqrt(3) / 2);
      StdDraw.text(0.5 + 0.5,(Math.sqrt(3) / 2) + 0.25, "(1/2, \u221A3/2)");
      StdDraw.pause(500);

      // Quadrant 2
      StdDraw.line(0,0,0,1);
      StdDraw.text(0,1  + 0.25, "(0, 1)");
      StdDraw.pause(500);

      StdDraw.line(0,0,-0.5,Math.sqrt(3) / 2);
      StdDraw.text(-0.75 - 0.5,(Math.sqrt(3) / 2) + 0.25, "(-1/2, \u221A3/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,- Math.sqrt(2) / 2,Math.sqrt(2) / 2);
      StdDraw.text(-0.75 - Math.sqrt(2) / 2,(Math.sqrt(2) / 2) + 0.125, "(-\u221A2/2, \u221A2/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,- Math.sqrt(3) / 2,0.5);
      StdDraw.text(-0.75 - Math.sqrt(3) / 2,0.5, "(-\u221A3/2, 1/2)");
      StdDraw.pause(500);

      // Quadrant 3
      StdDraw.line(0,0,-1,0);
      StdDraw.text(-0.5 -1,0, "(-1,0)");
      StdDraw.pause(500);

      StdDraw.line(0,0,-Math.sqrt(3) / 2,-0.5);
      StdDraw.text(-0.75 - (Math.sqrt(3) / 2),-0.5, "(-\u221A3/2, -1/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,-Math.sqrt(2) / 2,-Math.sqrt(2) / 2);
      StdDraw.text(-0.75 - Math.sqrt(2) / 2,(-Math.sqrt(2) / 2) -0.125, "(-\u221A2/2, -\u221A2/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,-0.5,-Math.sqrt(3) / 2);
      StdDraw.text(-0.75 - 0.5,(-Math.sqrt(3) / 2) -0.25, "(-1/2, -\u221A3/2)");
      StdDraw.pause(500);

      // Quadrant 4
      StdDraw.line(0,0,0,-1);
      StdDraw.text(0,-1 -0.25, "(0, -1)");
      StdDraw.pause(500);

      StdDraw.line(0,0,0.5,-Math.sqrt(3) / 2);
      StdDraw.text(0.75 + 0.5,(-Math.sqrt(3) / 2) - 0.25, "(1/2, -\u221A3/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0,Math.sqrt(2) / 2,-Math.sqrt(2) / 2);
      StdDraw.text(0.75 + Math.sqrt(2) / 2,(-Math.sqrt(2) / 2) -0.125, "(\u221A2/2, -\u221A2/2)");
      StdDraw.pause(500);

      StdDraw.line(0,0, Math.sqrt(3) / 2,-0.5);
      StdDraw.text(0.75 + Math.sqrt(3) / 2,-0.5, "(\u221A3/2, -1/2)");
      StdDraw.pause(500);


      // END OF CIRCLE

      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.line(-6,3.5,6,3.5);

      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.line(-6,-3.5,6,-3.5);

      double[] x_values = {1.0, Math.sqrt(3) / 2.0, Math.sqrt(2) / 2.0, 0.5, 0.0, -0.5, -Math.sqrt(2) / 2.0, -Math.sqrt(3) / 2, -1.0,
                           -Math.sqrt(3) / 2.0, -Math.sqrt(2) / 2.0, -0.5, 0, 0.5, Math.sqrt(2) / 2.0, Math.sqrt(3) / 2.0, 1.0};

      double[] y_values = {0.0, 0.5, Math.sqrt(2) / 2.0, Math.sqrt(3.0) / 2.0, 1.0, Math.sqrt(3.0) / 2.0, Math.sqrt(2.0) / 2.0, 0.5, 0.0,
                           -0.5, -Math.sqrt(2.0) / 2.0, -Math.sqrt(3.0) / 2.0, -1.0, -Math.sqrt(3.0) / 2.0, -Math.sqrt(2.0) / 2.0, -0.5, 0.0};
      double offSet = -2.0;


      for (int i = 0; i < x_values.length; i++) {
         test(x_values[i], y_values[i], offSet);
         offSet += 0.25;
         StdDraw.setPenColor(StdDraw.BLACK);
         if( offSet <= -1 || offSet > 1) {
            StdDraw.line(0, 0, 1, 0);
         } else {
            StdDraw.line(0,0,-1,0);
         }
      }

      StdDraw.show();
   }

   public static void test(double x, double y, double offSet) {

      double inc = 0.01;

      double tempx = 0.0;
      double tempy = 0.0;
      StdDraw.setPenColor(StdDraw.BLUE);
      if (offSet <= -1) {
         while(tempx <= x) {
            StdDraw.point(tempx, tempy);
            tempx += inc;
         }
         StdDraw.setPenColor(StdDraw.RED);
         while (tempy <= y) {
            StdDraw.point(tempx,tempy);
            tempy += inc;
         }
      } else if (offSet <= 0) {
         while(tempx >= x) {
            StdDraw.point(tempx, tempy);
            tempx -= inc;
         }
         StdDraw.setPenColor(StdDraw.RED);
         while (tempy <= y) {
            StdDraw.point(tempx,tempy);
            tempy += inc;
         }
      } else if (offSet <= 1) {
         while(tempx >= x) {
            StdDraw.point(tempx, tempy);
            tempx -= inc;
         }
         StdDraw.setPenColor(StdDraw.RED);
         while (tempy >= y) {
            StdDraw.point(tempx,tempy);
            tempy -= inc;
         }
      } else {
         while(tempx <= x) {
            StdDraw.point(tempx, tempy);
            tempx += inc;
         }
         StdDraw.setPenColor(StdDraw.RED);
         while (tempy >= y) {
            StdDraw.point(tempx,tempy);
            tempy -= inc;
         }
      }
      StdDraw.pause(500);

      String temp = valuePairs.peek();
      System.out.println(temp);
      StringBuilder sbx = new StringBuilder();
      StringBuilder sby = new StringBuilder();
//      for (int i = 0; temp.charAt(i) != ','; i++){
//         sbx.append(temp.charAt(i));
//      }
      for (int i = 0; i < temp.length() && temp.charAt(i) != ',' && temp.charAt(i) != ' '; i++) {
         sbx.append(temp.charAt(i));
      }


      for (int i = temp.length() - 1; i >= 0 && temp.charAt(i) != ' '; i--) {
         sby.append(temp.charAt(i));
      }
      sby.reverse();


      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.line(offSet, -3.5, offSet, -3.5 + x);

      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.line(offSet, 3.5, offSet, 3.5 + y);
      if (y + 3.5 >= 3.5) {
         StdDraw.text(offSet, 3.75 + y, String.valueOf(sby));
         valuePairs.pop();
      } else {
         StdDraw.text(offSet, 3.5 + y - 0.25, String.valueOf(sby));
         valuePairs.pop();
      }


   }
}
