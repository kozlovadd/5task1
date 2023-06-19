package org.example;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int monthsRest = 0; // счётчик месяцев отдыха
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //если отдыхаем
                money = money - expenses;
                money /= 3;
                monthsRest++; // увеличиваем счётчик месяцев отдыха

            } else {
                //если работаем
                money = money + income;
                money = money - expenses;
            }
        }
        return monthsRest;
    }
}
