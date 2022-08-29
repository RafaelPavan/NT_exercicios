public class NoOdd {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 8;
        numbers[3] = 13;
        numbers[4] = 17;
        numbers[5] = 22;
        numbers[6] = 15;
        numbers[7] = 31;


        for (int i=0; i<=numbers.length -1; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

    }

}
