package HW6.Kassa;

import java.util.Map;

public class Kassa {
        public void probitTovar(Pokupatel pokupatel) {
            double totalPrice = 0;
            System.out.print("В корзине товаров: " + pokupatel.korzina.size() + ". ");
            for (Map.Entry<String, Double> item : pokupatel.korzina.entrySet()) {
                totalPrice += item.getValue();
            }
            System.out.println("На сумму " + totalPrice + ".");
            System.out.println("Покупатель " + pokupatel.nomer + " обслужен!");
            pokupatel.korzina.clear();
        }
}
