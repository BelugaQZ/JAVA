import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task3 {

    public static void main(String[] args) {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10) + 1);
        }

        System.out.println("Начальный список: " + list);
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Сред.ариф.значение: " + average(list));
        deleteEven(list);
        System.out.println("Удаляем четные числа: " + list);

    }

    private static double average(List<Integer> list) {
        int sum = 0;
        for(int number : list) {
            sum += number;
        }
        double average = (double) sum / list.size();
        return average;
    }

    private static void deleteEven(List<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }

}