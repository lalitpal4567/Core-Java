package collections.linkedList.linkedListMethod;

import java.util.Arrays;
import java.util.LinkedList;

// offer() method adds the specified element at the end of the list.
// It returns boolean value.
// Its equivalent method is addLast.

public class OfferMethod {
    public static void main(String[] args) {
        LinkedList<String> channels = new LinkedList<>();
        channels.addAll(Arrays.asList("Star Gold","Zee Cinema","Pogo","B4U","India TV","Doordarshan"));
        System.out.println(channels);

        System.out.println(channels.offer("&pictures"));
        System.out.println(channels.offer("Star Utsav"));

        System.out.println(channels);
    }
}
