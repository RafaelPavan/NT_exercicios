import java.util.Scanner;
public class TestBMI {
    public static void main(String[] args) {
        Scanner imc = new Scanner(System.in);

        System.out.print("Insert your height: ");
        float height = imc.nextFloat();

        System.out.print("Insert your weight: ");
        float weight = imc.nextFloat();

        double result = weight / (Math.pow(height,2));

        if (result < 18.5){
            System.out.format("The BMI is: %.2f \nBelow ideal weight", result);
        } else if (result <= 24.9) {
            System.out.format("The BMI is: %.2f \nIdeal weight", result);
        } else if (result <= 29.9){
            System.out.format("The BMI is: %.2f \nYou're Overweight", result);
        } else if (result <= 34.9) {
            System.out.format("The BMI is: %.2f \nYou're with obesity grade 1", result);
        } else if (result <= 39.9) {
            System.out.format("The BMI is: %.2f \nYou're with obesity grade 2", result);
        } else {
            System.out.format("The BMI is: %.2f \nYou're with obesity grade 3", result);
        }

    }

}
