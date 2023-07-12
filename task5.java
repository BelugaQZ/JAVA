import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Phonebook.add("Иван Иванов", new ArrayList<>(Arrays.asList(132132, 5164616, 316646)));
        Phonebook.add("Светлана Петрова", new ArrayList<>(Arrays.asList(684351864, 1863516)));
        Phonebook.add("Кристина Белова", new ArrayList<>(Arrays.asList(59868, 518469)));
        Phonebook.add("Анна Мусина", new ArrayList<>(Arrays.asList(987643)));
        Phonebook.add("Анна Крутова", new ArrayList<>(Arrays.asList(531984, 897931)));
        Phonebook.add("Иван Юрин", new ArrayList<>(Arrays.asList(321464)));
        Phonebook.add("Петр Лыков", new ArrayList<>(Arrays.asList(13265494)));
        Phonebook.add("Павел Чернов", new ArrayList<>(Arrays.asList(619846, 4891857)));
        Phonebook.add("Петр Чернышов", new ArrayList<>(Arrays.asList(13716732)));
        Phonebook.add("Мария Федорова", new ArrayList<>(Arrays.asList(6519864, 55464, 65966)));
        Phonebook.add("Марина Светлова", new ArrayList<>(Arrays.asList(654986, 156166)));
        Phonebook.add("Мария Савина", new ArrayList<>(Arrays.asList(999944)));
        Phonebook.add("Мария Рыкова", new ArrayList<>(Arrays.asList(6518916, 65198163)));
        Phonebook.add("Марина Лугова", new ArrayList<>(Arrays.asList(56565)));
        Phonebook.add("Анна Владимирова", new ArrayList<>(Arrays.asList(64986816, 68484964)));
        Phonebook.add("Иван Мечников", new ArrayList<>(Arrays.asList(6519846, 646494673, 97976461)));
        Phonebook.add("Петр Петин", new ArrayList<>(Arrays.asList(646496, 35131)));
        Phonebook.add("Иван Ежов", new ArrayList<>(Arrays.asList(3513164, 5164)));

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;

        while (running) {
            System.out.println("1. Вывести все контакты\n2. Сортировать\n3. Найти контакт\n4. Выход\n");
            System.out.print("Введите команду: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("Все контакты: ");
                    Phonebook.print();
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Сортировка контактов: ");
                    Phonebook.sort();
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Введите искомое слово: ");
                    String text = scanner.nextLine();
                    System.out.println(Phonebook.search(text));
                    System.out.println();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }
}
