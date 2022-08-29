public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 10;
        numbers[1] = 30;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 50;
        numbers[5] = 500;
        numbers[6] = 3;



        for (int i=0; i<=numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(numbers[i]);
        }

    }
}
