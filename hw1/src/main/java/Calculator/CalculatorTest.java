package Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        testCalculateDiscount();
    }

    public static void testCalculateDiscount() {
        assertThat(Calculator.calculateDiscount(100, 90)).isEqualTo(10.0);

        assertThatThrownBy(() -> Calculator.calculateDiscount(-1, 100))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Incorrect variables");


        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Incorrect variables");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 1000))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Incorrect variables");
    }
}
