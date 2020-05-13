package HW6.Kassa;

import java.util.HashMap;

public class Pokupatel implements Comparable<Pokupatel>{
    Integer nomer;
    HashMap<String, Double> korzina;
    Pokupatel(int nomer, HashMap<String, Double> korzina){
        this.nomer = nomer;
        this.korzina = korzina;
    }
    public int getNomer() {
        return nomer;
    }
    @Override
    public int compareTo(Pokupatel o) {
        return nomer.compareTo(o.getNomer());
    }
}
