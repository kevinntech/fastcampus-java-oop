package service;

import logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    // 생성자 주입
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }

}