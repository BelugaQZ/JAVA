import java.util.*;

public class task3_1 {
    //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
    public static void main(String[] args) {
        List<String> planet = new ArrayList<>();
        planet.add("Меркурий");
        planet.add("Меркурий");
        planet.add("Венера");
        planet.add("Земля");
        planet.add("Земля");
        planet.add("Марс");
        planet.add("Юпитер");
        planet.add("Сатурн");
        planet.add("Сатурн");
        planet.add("Сатурн");
        planet.add("Уран");
        planet.add("Нептун");
        planet.add("Плутон");


        frecuency(planet);
    }

    private static void frecuency(List<String> planet) {
        Set<String> uniqueValues = new HashSet<>(planet);
        for(String item : uniqueValues) {
            System.out.println(item + " - " + Collections.frequency(planet, item));
        }
    }

}
