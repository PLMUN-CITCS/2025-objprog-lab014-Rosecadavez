public class MethodReturnTypes {

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    public static double calculateAverage(int num1, int num2) {
        return (double) (num1 + num2) / 2.0;
    }

    public static void main(String[] args) {
        displayWelcomeMessage();
        int value1 = 20;
        int value2 = 30;
        double average = calculateAverage(value1, value2);
        System.out.println("The average is: " + average);
    }
}