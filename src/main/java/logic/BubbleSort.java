package logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    // 입력으로 List를 받아서 정렬된 List를 반환한다.
    public List<T> sort(List<T> input) {
        List<T> output = new ArrayList<>(input);

        for (int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
