package ru.netology.sqr;

public class SQRService {

    public int sqr(int counter) {
        int max = 300;
        int min = 200;
        counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) counter++;{
            }
        }
        return counter;
    }
}

