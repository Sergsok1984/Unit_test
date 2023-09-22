package Calculator;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0 || discountAmount <= 0 || discountAmount > 100) {
            throw new ArithmeticException("Incorrect variables");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100;
    }
}
