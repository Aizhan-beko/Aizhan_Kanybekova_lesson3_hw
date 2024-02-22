public class Main {
    public static void main(String[] args) {


        double[] numbers = { 2.2, 1.3, -4.3, 4.5, -6.7, 7.8, -9.8, 5.6, 8.4, -6.9, -3.8, 7.7, -2.9, 8.1, 9.5 };
         double sumPositive = 0.0;
         int countPositive = 0;
         boolean negativeFound = false;

        for (double number: numbers) {
            if (negativeFound) {
                if (number > 0) {
                    sumPositive += number;
                    countPositive++;
                }
            } else if (number < 0) {
                negativeFound = true;
            }
            if(countPositive > 0)
            { double averagePositive  = sumPositive/countPositive;
                System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositive);

            }
        }
    }
}