import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println(" === Triangle Checker ===");
            System.out.println("Input size 1: ");
            Double firstSide = input.nextDouble();
            System.out.println("Input size 2: ");
            Double secondSide = input.nextDouble();
            System.out.println("Input size 3: ");
            Double thirdSide = input.nextDouble();
            Double sum1 = firstSide + secondSide;
            Double sum2 = secondSide + thirdSide;
            Double sum3 = firstSide + thirdSide;

            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || sum1 <= thirdSide || sum2 <= firstSide || sum3 <= secondSide) {
                throw new IllegalTriangleException();
            } else {
                System.out.println("3 side is accpected!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Wrong type!");
        } catch (IllegalTriangleException ex) {
            System.out.println("Wrong input!");
        }
    }
}
