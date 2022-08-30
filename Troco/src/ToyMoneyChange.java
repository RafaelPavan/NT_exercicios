import java.text.DecimalFormat;
import java.util.Random;

public class ToyMoneyChange {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("###,##0.00");
        Random randomNumber = new Random();

        double account = 8.50;
        double number = randomNumber.nextDouble(100);

        System.out.println("O valor do brinquedo é de = R$ " + account);


        System.out.println("Valor pago: R$ " + formatter.format(number));

        System.out.printf("%s", calcChange(account, number));
    }

    public static String calcChange(double conta, double pago){
        DecimalFormat formatter = new DecimalFormat("###,##0.00");
        if (pago < conta) {
            return ("\nDinheiro insuficiente, faltam R$" +
                    formatter.format(conta - pago) + "\n");
        }
        else {
            int bankNote[] = {100, 50, 20, 10, 5, 2, 1};
            int cents[] = {50, 25, 10, 5, 1};

            String rest;
            double change;
            int i, vlr, ct;

            change = pago - conta;
            rest = "Troco = R$ " + formatter.format(change) + "\n";


            vlr = (int) change;
            i = 0;
            while (vlr != 0){
                ct = vlr / bankNote[i];
                if (ct !=0) {
                    rest = rest + (ct + "nota(s) de R$ " + bankNote[i] + "\n");
                    vlr = vlr % bankNote[i];
                }
                i = i + 1;
            }
            rest = rest + "\n";

            vlr = (int)Math.round((change - (int)change) * 100);
            i = 0;
            while (vlr != 0) {
                ct = vlr / cents[i];
                if (ct != 0) {
                    rest = rest + (ct +"moeda(s) de"+ cents[i] +
                            "centavo(s)\n");
                    vlr = vlr % cents[i];
                }
                i = i + 1;
            }

            return (rest);
        }
    }

}


