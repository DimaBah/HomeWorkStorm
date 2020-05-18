package HW6.Map3;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(111,"zzzz");
        myMap.put(222,"xxxx");
        myMap.put(333,"ccccccc");
        myMap.put(444,"vvvv");
        myMap.put(123,"nnnnn");
        myMap.put(421,"bbbbb");
        myMap.put(523,"nnnnn");
        myMap.put(254,"mmmmm");
        myMap.put(321,",,,,,,");
        for (String value : myMap.values()){
            System.out.println("Value: " + value);
        }
        for (Integer key : myMap.keySet()){
            System.out.println("Key: " + key);
        }
    }
}
