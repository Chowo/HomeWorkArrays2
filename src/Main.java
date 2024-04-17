public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        int[] bookKeeping1 = new int[5];
        bookKeeping1[0] = 500_000;
        bookKeeping1[1] = 490_000;
        bookKeeping1[2] = 450_000;
        bookKeeping1[3] = 550_000;
        bookKeeping1[4] = 600_000;
        int monthSpending = 0;
        for (int i = 0; i < bookKeeping1.length; i++) {
            monthSpending += bookKeeping1[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", monthSpending);

        //Task 02
        System.out.println("Task 02");
        int[] bookKeeping2 = {560_000, 800_000, 952_000, 495_000, 611_111};
        int maxSpending = bookKeeping2[0];
        int minSpending = bookKeeping2[0];
        for (int i = 0; i < bookKeeping2.length; i++) {
            if (maxSpending < bookKeeping2[i]) {
                maxSpending = bookKeeping2[i];
            }
            if (minSpending > bookKeeping2[i]) {
                minSpending = bookKeeping2[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей%n", minSpending, maxSpending);

        //Task 03
        System.out.println("Task 03");
        int[] bookKeeping3 = {4567, 8724, 3659, 5622, 6017};
        double averageMonthlySpending = 0.0;
        int totalSpending = 0;
        for (int i = 0; i < bookKeeping3.length; i++) {
            totalSpending += bookKeeping3[i];
        }
        averageMonthlySpending = (double) totalSpending / bookKeeping3.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", averageMonthlySpending);

        //Task 04
        System.out.println("Task 04");
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.printf("%s", reversFullName[i]);
        }
        System.out.println();
    }
}
