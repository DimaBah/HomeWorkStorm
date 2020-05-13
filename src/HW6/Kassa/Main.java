package HW6.Kassa;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Kassa kassa = new Kassa();
        HashMap<String, Double> korz1 = new HashMap<>();
        korz1.put("хлеб", 1.5);
        korz1.put("молоко", 1.9);
        korz1.put("сметана", 2.6);
        Pokupatel pok1 = new Pokupatel(1, korz1);
        HashMap<String, Double> korz2 = new HashMap<>();
        korz2.put("хлеб", 1.2);
        korz2.put("молоко", 1.8);
        korz2.put("сметана", 2.0);
        HashMap<String, Double> korz3 = new HashMap<>();
        korz3.put("печенье", 3.5);
        Pokupatel pok2 = new Pokupatel(2, korz2);
        Pokupatel pok3 = new Pokupatel(3, korz3);
        HashMap<String, Double> korz4 = new HashMap<>();
        korz4.put("макароны", 2.2);
        korz4.put("сосиски", 4.8);
        Pokupatel pok4 = new Pokupatel(4, korz4);
        PriorityQueue<Pokupatel> ochered = new PriorityQueue<>();
        ochered.add(pok1);
        ochered.add(pok2);
        ochered.add(pok3);
        ochered.add(pok4);
        while (!ochered.isEmpty()) {
            kassa.probitTovar(ochered.poll());
        }
    }
}
