package DSA;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generate(4);
        for (List<Integer> list : pascalTriangle) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> mainList = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        mainList.add(firstRow);

        if (n == 1) return mainList;
        for (int i = 1; i < n; i++) {
            List<Integer> prevRow = mainList.get(i - 1);

            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 0; j < i - 1; j++) {
                newList.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            newList.add(1);
            mainList.add(newList);
        }

        return mainList;
    }
}
