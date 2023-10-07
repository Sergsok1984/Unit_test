import java.util.List;

public class Average {
    public static String averageArrays(List<Integer> list1, List<Integer> list2) {
        double average1 = list1.stream().
                mapToDouble(Integer::doubleValue).
                average().
                orElse(0.0);
        double average2 = list2.stream().
                mapToDouble(Integer::doubleValue).
                average().
                orElse(0.0);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
