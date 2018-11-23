package ru.itpark;

public class СashbackService {
    public int calculateCashback(int firstCategoryPurchase, int secondCategoryPurchase, int thirdCategoryPurchase) {
        int result = 0;
        int cashbackAmount = 0;
        int maxCashbackAmount = 3_000;
        int firstCategoryPercent = 1;
        int secondCategoryPercent = 5;
        int thirdCategoryPercent = 30;

        if (firstCategoryPurchase > 0 ) {
            cashbackAmount = firstCategoryPurchase * firstCategoryPercent / 100;


        } else if (secondCategoryPurchase > 0) {
            cashbackAmount = secondCategoryPurchase * secondCategoryPercent / 100;

        } else if (thirdCategoryPurchase > 0) {
            cashbackAmount = thirdCategoryPurchase * thirdCategoryPercent / 100;
        }

        if (cashbackAmount > maxCashbackAmount) {
            cashbackAmount = maxCashbackAmount;
        }
        result += cashbackAmount;

        return result;
    }
}
