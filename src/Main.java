public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        byte OS = 0;
        byte clientOS = 0;
        byte Android = 1;
        if (OS == clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (OS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задача 2.");
        byte OS2 = 0;
        short clientDeviceYear = 2014;

        byte clientOS2 = 0;
        byte Android2 = 1;
        if (OS2 == clientOS2 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (OS2 == clientOS2 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
            if (OS2 == Android2 && clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
            if (OS2 == Android2 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                        }

        System.out.println("Задача 3.");
            int year = 2024;
            int cycle = 400;
            int cycle1 = 4;
            int cycle2 = 100;
            if (year % cycle == 0 || year % cycle1 == 0 && year % cycle2 != 0) {
                System.out.println(year + " год является високосным.");
            } else
                System.out.println(year + " год не является високосным.");

        System.out.println("Задача 4.");
        short deliveryDistance = 95;
        byte way = 20;
        byte day = 1;
        if (deliveryDistance <= way) {
        System.out.println("Потребуется дней " + day);
        }
        if (deliveryDistance > way && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (day + 1));
        }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней " + (day + 2));
            }
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет!");
            }

        System.out.println("Задача 5.");
        short monthNumber = 12;
        switch (monthNumber) {
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году только 12 месяцев!");
        }
        }
        }



