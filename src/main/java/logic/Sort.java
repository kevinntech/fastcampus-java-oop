package logic;

import java.util.List;

// 제네릭 타입으로 비교 가능한 자료형을 전달받는다.
public interface Sort<T extends Comparable<T>> {

    List<T> sort(List<T> input);

}