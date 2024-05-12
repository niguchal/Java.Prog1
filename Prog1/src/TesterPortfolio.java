public class TesterPortfolio {

    public static void main(String[] args) {
        TesterPortfolio tester = new TesterPortfolio();
        tester.testAddition();
        tester.testSubtraction();
        tester.testMultiplication();
        tester.testDivision();
    }

    public void testAddition() {
        int result = add(5, 3);
        if (result == 8) {
            System.out.println("Addition test passed");
        } else {
            System.out.println("Addition test failed");
        }
    }

    public void testSubtraction() {
        int result = subtract(5, 3);
        if (result == 2) {
            System.out.println("Subtraction test passed");
        } else {
            System.out.println("Subtraction test failed");
        }
    }

    public void testMultiplication() {
        int result = multiply(5, 3);
        if (result == 15) {
            System.out.println("Multiplication test passed");
        } else {
            System.out.println("Multiplication test failed");
        }
    }

    public void testDivision() {
        int result = divide(6, 3);
        if (result == 2) {
            System.out.println("Division test passed");
        } else {
            System.out.println("Division test failed");
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}