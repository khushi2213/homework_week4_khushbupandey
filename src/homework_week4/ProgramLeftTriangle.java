package homework_week4;
/**15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
import java.util.Scanner;


public class ProgramLeftTriangle {
    public static void main(String args[]) {
        Display();
    }
    public static void Display(){
        int i, j, my_input;
        System.out.println("Required packages have been imported");
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("A reader object has been defined ");
        System.out.print("Enter the number of rows : ");
        my_input = my_scanner.nextInt();
        System.out.println("The right triangle star pattern : ");
        for (i=0; i<my_input; i++){
            for (j=2*(my_input-i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
