public class Main {
            public static void main(String[] args) {
                // задача 1
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
                // задача 2
                for (int i = 10; i > 0; i = i - 1) {
                    System.out.println(i);
                }
                // задача 3
                for (int i = 0; i <= 17; i = i + 2) {
                    System.out.println(i);
                }
                // задача 4
                for (int i = 10; i >= -10; i = i - 1) {
                    System.out.println(i);
                }
                // задача 5
                for (int i = 1904; i <= 2096; i = i + 4) {
                    System.out.println(i + " год является високосным");
                }
                // задание 6
                for (int i = 7; i <= 98; i = i + 7) {
                    System.out.println(i);
                }
                // задача 7
                for (int i = 1; i <= 512; i = i * 2) {
                    System.out.println(i);
                }
                // задание 8
                int total = 0;
                for (int i = 1; i <= 12; i++) {
                    total = total + 29000;
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
                // задание 9
                total = 0;
                for (int i = 1; i <= 12; i++) {
                    total = total + 29000 + total / 100;
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
                //  задание 10
                for (int i = 1; i <= 10; i++) {
                    System.out.println("2*" + i + "=" + 2 * i);
                }
            }
        }
