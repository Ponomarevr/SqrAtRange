package ru.netology.sqr;

public class SQRService {
    public int sqrAmountAtRangeService(int rangeFrom, int rangeTill) {
        int sqrAmountAtRange = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= rangeFrom & i * i <= rangeTill) {

                sqrAmountAtRange = sqrAmountAtRange + 1;
            }

        }
        return sqrAmountAtRange;
    }
}
