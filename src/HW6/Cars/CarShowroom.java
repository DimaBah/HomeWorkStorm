package HW6.Cars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarShowroom {
    Integer id = 0;
    HashMap<Integer, String[]> cars;
    CarShowroom(){
        this.cars = new HashMap<>();
    }
    void addACar (String[] newCar) throws EmptyDataException{
        boolean noEmptyFields = true;
        for (String item : newCar){
            noEmptyFields = noEmptyFields && !item.equals("");
        }
        if (noEmptyFields) {
            id++;
            cars.put(id, newCar);
        }
        else {
            throw new EmptyDataException("Введите непустые данные!");
        }
    }

    void displayAllCars(){
        System.out.println("Все автомобили салона: ");
        for (Map.Entry<Integer, String[]> item : cars.entrySet()){
            System.out.printf("ID: %d    Модель: %s    Цена: %s р.\n", item.getKey(), item.getValue()[1], item.getValue()[2]);
            System.out.println("Выберите пункт:");
        }
    }
    void carInfo (String id) throws BadIdException{
        if (cars.containsKey(Integer.valueOf(id))) {
            String[] car = cars.get(Integer.valueOf(id));
            System.out.printf("ID: %d   Марка: %s   Модель: %s   Цена: %s р.   Год: %s   Цвет: %s\n", Integer.valueOf(id), car[0], car[1], car[2], car[3], car[4]);
        }
        else {
            throw new BadIdException("Нет авто с таким идентификатором...");
        }
        System.out.println("Выберите пункт:");
    }
    void buyACar (String id) throws BadIdException{
        if (cars.containsKey(Integer.valueOf(id))) {
            String[] car = cars.get(Integer.valueOf(id));
            System.out.printf("Отличный выбор! %s %sг. за %s р. покинула салон.\n", car[1], car[3], car[2]);
            cars.remove(Integer.valueOf(id));
        }
        else {
            throw new BadIdException("Нет авто с таким идентификатором...");
        }
        System.out.println("Выберите пункт:");
    }

    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom();
        try {
            carShowroom.addACar(new String[]{"Тойота", "Селика", "15000", "2010","желтый"});
            carShowroom.addACar(new String[]{"Тойота", "Королла", "10000", "2005","черный"});
            carShowroom.addACar(new String[]{"Опель", "Астра", "20000", "2015","красный"});
        } catch (EmptyDataException e) {
            e.printStackTrace();
        }
        System.out.println("Добро пожаловать в автосалон!");
        System.out.println("Что хотите сделать?\n" +
                "(1) Посмотреть список автомобилей\n" +
                "(2) Получить информацию об автомобиле\n" +
                "(3) Купить автомобиль\n" +
                "(4) Добавить автомобиль\n" +
                "(5) Выйти из салона\n" +
                "Выберите пункт:");
        Scanner scan = new Scanner(System.in);
        boolean toExit = false;
        while (!toExit){
            String i = scan.next();
            try {
                switch (Integer.parseInt(i)) {
                    case 1:
                        carShowroom.displayAllCars();
                        break;
                    case 2:
                        System.out.println("Введите ID для просмотра авто: ");
                        try {
                            carShowroom.carInfo(scan.next());
                        } catch (BadIdException e) {
                            System.out.println(e.getMessage());
                        } catch (NumberFormatException e) {
                            System.out.println("Введите корректный идентификатор! ");
                        }
                        break;
                    case 3:
                        System.out.println("Введите ID для покупки авто: ");
                        try {
                            carShowroom.buyACar(scan.next());
                        } catch (BadIdException e) {
                            System.out.println(e.getMessage());
                        } catch (NumberFormatException e) {
                            System.out.println("Введите корректный идентификатор! ");
                        }
                        break;
                    case 4:
                        System.out.print("Введите марку: ");
                        String brand = scan.next().trim();
                        System.out.print("Введите модель: ");
                        String model = scan.next().trim();
                        System.out.print("Введите цену: ");
                        String price = scan.next().trim();
                        System.out.print("Введите год производства: ");
                        String year = scan.next().trim();
                        System.out.print("Введите цвет: ");
                        String color = scan.next().trim();
                        try {
                            carShowroom.addACar(new String[]{brand, model, price, year, color});
                        } catch (EmptyDataException e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("Выберите пункт:");
                        break;
                    case 5:
                        System.out.println("До свидания!");
                        toExit = true;
                        break;
                    default:
                        System.out.println("Попробуйте еще раз........");
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Пункт меню!!!");
            }
        }
    }
}
