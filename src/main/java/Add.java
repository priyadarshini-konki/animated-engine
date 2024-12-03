public class Add {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}
