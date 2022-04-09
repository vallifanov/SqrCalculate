package ru.netology.sqr;

public class SQRService {
    public static int calculate(int lowerRange, int higherRange) {
        int i;
        int j = 0;
        for (i = 10; i <= 99; i++) {
            if (i * i > lowerRange && i * i <= higherRange) {
                System.out.println(j++);
            }
        }
        System.out.println("Количество квадратов чисел: " + j);
        return j;
    }
}

