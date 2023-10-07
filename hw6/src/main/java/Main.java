import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5);
        List<Integer> nums2 = List.of(1, 2, 3, 4, 6);

        System.out.println(Average.averageArrays(nums1, nums2));
    }
}

