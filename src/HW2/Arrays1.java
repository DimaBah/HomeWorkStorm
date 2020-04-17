package HW2;

import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int masLen = 1 + rnd.nextInt(20);
        System.out.println("Lenght is "+masLen); //Для наглядности
        double otrSum = 0;
        double [] vector = new double[masLen];
        for (int i=0; i<masLen; i++){
            vector[i]=Math.random()*10 - 5;
            System.out.println(vector[i]); //Для нее же
            if (vector[i]<0){
                otrSum += vector[i];
            }
        }
        System.out.println("Сумма отрицательных элементов " + otrSum);
        int max;
        int min;
        max = min = 0;
        for (int i = 1; i < masLen; i++){
            if (vector[i] >= vector[max]){
                max = i;
            }
            if (vector[i] <= vector[min]){
                min = i;
            }
        }
        System.out.printf("Min = %d, Max = %d \n", min, max); // Наглядность и понимание :)
        if (Math.abs(min - max)<2){
            System.out.println("Между минимальным и максимальным элементами нет других! ");
        }
        else if (max>min){
            double proizv = 1;
            for (int i = min+1; i < max; i++){
                proizv *= vector[i];
            }
            System.out.println("Произведение элементов между минимальным и максимальным равно " + proizv);
        }
           else{
            double proizv = 1;
            for (int i = max+1; i < min; i++){
                proizv *= vector[i];
            }
            System.out.println("Произведение элементов между минимальным и максимальным равно " + proizv);
        }
    }
}
