package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSQR = i * i;
            if (iSQR >= minNumber) {
                if (iSQR <= maxNumber) {
                    counter++;
                    System.out.println(counter);
                }
            }

        }
        return counter;

    }

}

