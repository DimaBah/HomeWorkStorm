package HW6.Botanist;

import java.util.*;

public class Botanist {
    void allTypes (Map<String, String> hashmap){
        System.out.println("Все типы растений с примерами: ");
        Set<String> uniqueTypes = new HashSet<>();
        for(Map.Entry<String, String> item : hashmap.entrySet()){
            if (!uniqueTypes.contains(item.getValue())){
                uniqueTypes.add(item.getValue());
                System.out.println(item.getValue() + ", например - " + item.getKey());
            }
        }
    }
    void getType (Map<String, String> hashmap, String plain){
        System.out.println(plain + " это " + hashmap.get(plain));
    }
    public static void main(String[] args) {
        Map<String, String> plains = new HashMap<>();
        plains.put("капуста","овощь");
        plains.put("морковь","овощь");
        plains.put("лук","овощь");
        plains.put("картофель","корнеплод");
        plains.put("апельсин","фрукт");
        plains.put("мандарин","фрукт");
        plains.put("яблоко","фрукт");
        plains.put("груша","фрукт");
        plains.put("арбуз","ягода");
        plains.put("вишня","ягода");
        plains.put("малина","ягода");
        plains.put("клубника","ягода");
        Botanist botanist = new Botanist();
        botanist.allTypes(plains);
        System.out.println();
        System.out.println("А конкретнее: ");
        botanist.getType(plains, "малина");
        botanist.getType(plains, "лук");
    }
}