package lesson_ArrayList_0826;

import java.util.ArrayList;
import java.util.List;

public class ListsIterator {
    private int currentList = 0, currentIndex = 0, totalElements = 0, countElements = 0;
    private ArrayList<List<Integer>> lists = new ArrayList<>();

    public ListsIterator(List<Integer> list1, List<Integer> list2) {
        this.lists.add(list1);
        this.lists.add(list2);
        for (List<Integer> var : this.lists) {
            this.totalElements += var.size(); // calculate the total number of elements
        }
    }

    public Integer next() {
        int indexOfLists = currentList;
        Integer returnValue = null;
        while (indexOfLists < this.lists.size()) {
            List<Integer> l = lists.get(currentList);
            if (l.size() > currentIndex) {
                returnValue = l.get(currentIndex);
                countElements++;
            }
            indexOfLists++;
            currentList++;
            currentList %= lists.size();

            if (currentList == 0) {
                currentIndex++;
            }

            if (returnValue != null) {
                return returnValue;
            }
        }
        System.out.println("ERROR iteration next() used despite there is no next element");
        return null;
    }

    public boolean hasNext() {
        return countElements < totalElements;
    }
}
