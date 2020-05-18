package HW6.Kassa;

import java.util.Map;

public class Kassa {
        public void probitTovar(Pokupatel pokupatel) {
            double totalPrice = 0;
            System.out.print("В корзине товаров: " + pokupatel.getKorzina().size() + ". ");
            for (Map.Entry<String, Double> item : pokupatel.getKorzina().entrySet()) {
                totalPrice += item.getValue();
            }
            System.out.println("На сумму " + totalPrice + ".");
            System.out.println("Покупатель " + pokupatel.getNomer() + " обслужен!");
            pokupatel.getKorzina().clear();
        }
}
