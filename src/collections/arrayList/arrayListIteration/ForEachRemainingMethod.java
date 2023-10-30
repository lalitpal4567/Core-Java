package collections.arrayList.arrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachRemainingMethod {
    public static void main(String[] args) {
        ArrayList<Integer> pageNo = new ArrayList<>();
        pageNo.add(34);
        pageNo.add(67);
        pageNo.add(12);
        pageNo.add(23);
        pageNo.add(88);

        System.out.println(pageNo);     // [34, 67, 12, 23, 88]

        Iterator<Integer> pages = pageNo.iterator();
        pages.forEachRemaining(number -> System.out.print(number + "  "));  // 34  67  12  23  88


//        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
//        while (tvShowListIterator.hasPrevious()){
//            String tvShow = tvShowListIterator.previous();
//            System.out.println(tvShow);
//        }
//        System.out.println("\n=== Iterate using simple for-each loop ===");
//        for(String tvShow: tvShows) {
//            System.out.println(tvShow);
//        }
//        System.out.println("\n=== Iterate using for loop with index ===");
//        for(int i = 0; i < tvShows.size(); i++){
//            System.out.println(tvShows.get(i));
//        }
    }
}
