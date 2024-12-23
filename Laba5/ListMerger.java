
import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    // Метод для объединения двух списков
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer item : list1) {
            if (!list2.contains(item)) {
                resultList.add(item);
            }
        }

        for (Integer item : list2) {
            if (!list1.contains(item)) {
                resultList.add(item);
            }
        }

        return resultList;
    }

    @Override
    public String toString() {
        return "ListMerger";
    }
}
