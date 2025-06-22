package homework22_05.Task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int grade = random.nextInt(13);
        int tvTime = 45;

        System.out.println("Оценка за контрольную работу: " + grade);

        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println("Отлично! Мы очень рады твоему успеху!");
                tvTime += 60; // Добавляем 1 час
                break;

            case 9:
            case 8:
            case 7:
                System.out.println("Молодец! Так держать!");
                // Оставляем 45 минут без изменений
                break;

            case 6:
            case 5:
            case 4:
                System.out.println("Неплохо, но есть куда расти.");
                tvTime += 15;
                break;

            case 3:
                System.out.println("Я расстроен. Нужно стараться больше.");
                tvTime -= 30;
                break;

            default: // для оценок 0, 1, 2 и других некорректных значений
                System.out.println("Это трагедия... Сегодня телевизор запрещён.");
                tvTime = 0;
        }

        // Ограничение: не более 60 минут в день
        if (tvTime > 60) {
            tvTime = 60;
        } else if (tvTime < 0) {
            tvTime = 0;
        }

        System.out.println("Оставшееся время просмотра ТВ: " + tvTime + " минут");
    }
}
