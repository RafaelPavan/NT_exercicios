import java.util.Scanner;

public class CalcTwoPoints {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.print("Insert first Point: ");
        int x1 = calc.nextInt();

        System.out.print("Insert Second Point: ");
        int x2 = calc.nextInt();



        double distance = Math.sqrt(Math.pow(x2-x1, 2));
        System.out.format("The break between these two points are: %.0f break(s).", distance);
    }
}
