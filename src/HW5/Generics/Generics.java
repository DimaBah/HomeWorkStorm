package HW5.Generics;

import java.util.Arrays;

public class Generics <T> {
    T[] anyTypeArray;

    public Generics(T[] anyTypeArray) {
        this.anyTypeArray = anyTypeArray;
    }
    public <T> T getElement(int index){
        return (T)anyTypeArray[index];
    }
    @Override
    public String toString() {
        return "Generics{" +
                "anyTypeArray=" + Arrays.toString(anyTypeArray) +
                '}';
    }

    public static void main(String[] args) {
        Generics<Double> doubleArray = new Generics<>(new Double[]{45.23, 89.65, 75.86, 987.456, 546.12});
        System.out.println(doubleArray.getElement(2).toString());
        Generics<String> stringArray = new Generics<>(new String[]{"aaaaaaa", "yyyyyyy", "ppppppp", "vvv", "zzz"});
        System.out.println(stringArray.getElement(4).toString());
        Generics<Character> charArray = new Generics<>(new Character[]{'n', 'u', 'r', ' ', '`'});
        System.out.println(charArray.getElement(0).toString());
    }
}
