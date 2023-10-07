import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestAverage {

    @Test
    public void testFirstBigger() {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 6);
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);

        assertThat(Average.averageArrays(nums1, nums2))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testSecondBigger() {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 6);

        assertThat(Average.averageArrays(nums1, nums2))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testEquals() {
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);

        assertThat(Average.averageArrays(nums1, nums2))
                .isEqualTo("Средние значения равны");
    }
}
