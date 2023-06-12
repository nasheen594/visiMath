/*
Use this to run the animations
The individual classes have no .main() and cannot be run directly

After the animation has displayed, there will be a prompt
in the console asking what you want to do
r == replay, n == next, p == previous, e == end

Also, I am using StdDraw from princeton,
I will attatch a copy, it may be called Stdlib.jar
You will have to set your IDE dependencies for
the commands to be recognized
 */

import java.util.Scanner;

public class Sampler {
   public static void main (String[] args) {

      Scanner sc = new Scanner(System.in);

      // Creating instances of the Animations
      Pythag myPy = new Pythag();
      Animations1Helper wave = new Animations1Helper();
      Derivative derivative = new Derivative();

      Animations[] visuals = {myPy, wave, derivative};

      // using a string to get the .equals method
      String option = ""; // used to select what to do next
      int i = 2; // starting animation index
      while (true) {

         // e for end
         if (option.equals('e')) break;

         // visual options
         visuals[i].visual();

         System.out.println("What do you want to do?");
         option = sc.next();

         // r == replay, n == next, p == prev, e will auto end
         if (option.equals("r")) continue;
         else if (option.equals("n")) i++;
         else if (option.equals("p")) i--;
         else if (option.equals("e")) break;

         if (i == visuals.length) i = 0;
         else if (i < 0) i = visuals.length - 1;

         StdDraw.pause(10);

      }

      //  Force exit because my machine wouldn't stop running for some reason
      System.exit(0);


   }

}
