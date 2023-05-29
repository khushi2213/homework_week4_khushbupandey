package homework_week4;
/**8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@*/
import java.util.Scanner;

public class Program8_RightTriangle {
    public static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        rightTriangle();
    }



    public static void rightTriangle(){
        System.out.println("Enter rows:  ");
        int rows= sc.nextInt();

        int a ,b;
        for(a=0; a <rows; a++) {
            for(b=0; b<=a; b++) {
                System.out.println("@");
            }

            System.out.println();
        }
    }
}



