package cap1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Writing a class with a main() PAGE 17

        System.out.println("I Rule!");
        System.out.println("The world");
        IO.println();

// What can you say in the main method? PAGE 50
        int x = 50;
        /*Scanner nameless = new Scanner(System.in);
        IO.print("qual o nome");
        String name = nameless.nextLine();*/
        String name = "Dirk";
        x = x * 17;
        System.out.println("X is: " + x);
        double d = Math.random();
        //this is a comment
        while (x > 10) {
            x = x - 1;
            if (x <= 20) {
                System.out.println(x);
            }
        }
        for (int i = 0; i <= 20; i = i + 1) {
            System.out.println("i is now " + i);
        }
        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
        IO.println();
    /*
      Notice the difference between the assignment operator
      (a single equals sign) and the operator (two equals sign).
      Lot of programmers accidentally type = when they want == (but´nt u)
    */
        int y = 4;
        while (y > 3) {
            //loop code will run because y is greater than 3
            y = y - 1;
        } //or we'd  loop forever
        int z = 27;
        while (z == 17) {
            //loop code will not run becouse z isn't equal to 17
            z = z - 1;
        }
    /*
    The only variable you can direction test
    (without using a comparison operator) is a boolean
     */
        boolean isHot = true;
        while (isHot) {
            IO.println("It's hot 🔥");
            isHot = false;
        }
        IO.println();

        //Do the DOBEDOBEDO
        int Do = 1;
        while (Do < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            Do = Do + 1;
        }
        if (Do == 3) {
            System.out.println("Do");
        }
        IO.println();

        //Green bottle song
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println(bottlesNum + " green " + word + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall, ");
            bottlesNum = bottlesNum - 1;
            IO.println();
            if (bottlesNum == 1) {
                word = "bottle";
            }
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word +
                        ", handing on the wall ");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }

        //let’s write a program

        String[] wordListOne = {"agostic", "opnionated", "voice activated", "haptically diven",
                "extesible", "reactive", "agent based", "fuctional", "AI enabled",
                "strongly type"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service orient", "containerized",
                "severless", "microservices", "distributed ledger"};
        String[] wordListThree = {"flamework", "library", "DSL", "REST API", "repository", "pipeline",
                "sevice mesh", "architecture", "perspective", "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " +
                wordListThree[rand3];
        IO.println();
        System.out.println("What we need is a" + phrase);
        IO.println();
   //Exemple 1 Page 20
    int eX = 3;
    while(eX > 0)

    {
        if (eX > 2) {
            System.out.print("a");
        }
        eX = eX - 1;
        System.out.print("-");
        if (eX == 2) {
            System.out.print("b c");
            }
        if (eX == 1) {
            System.out.print("d");
            eX = eX - 1;
        }}
    IO.println();
    IO.println();
    //Exemple 3 Page 23
        int t1 = 0;
        int t2= 0;
        while(t1 < 5){
            //t2 =t1 - t2;

            //t2 =t1 + t2;

            /*t2 = t2 + 2;
            if(t2>4){t2 = t2 - 1;}*/

            /*t1 = t1+1;
            t2 = t2 + t1;*/

            if(t2<5){
                t1++;
                if(t2<3){t1--;}}
            t2 = t2 + 2;

            System.out.print(t1 +"" + t2 + " ");

            t1 = t1 + 1;
            IO.println();
        }

        int t3 = 0;
        while(t3 < 4){
                System.out.print("a");
            if(t3 < 1){
                System.out.print(" ");
            }
                System.out.print("n");
            if(t3 > 1){
                System.out.print(" oyster");
                t3 = t3 + 2;
            }
            if(t3==1){
                System.out.print("noys");
            }
            if(t3<1){
                System.out.print("oise");
            }
                System.out.println();
            t3++;
            }

}}
