package collections.hashMap.hashMapMethod;

import java.util.HashMap;

public class ContainsKeyMethod {
    public static void main(String[] args) {
        HashMap<String, String> stateCity = new HashMap<>();
        stateCity.put("Uttar Pradesh", "Noida");
        stateCity.put("New Delhi", "Delhi");
        stateCity.put("Bihar", "Patna");
        stateCity.put("Maharashtra", "Mumbai");
        System.out.println(stateCity);  // {Bihar=Patna, New Delhi=Delhi, Maharashtra=Mumbai, Uttar Pradesh=Noida}

        System.out.println(stateCity.containsKey("Bihar")); // true;
    }
}
