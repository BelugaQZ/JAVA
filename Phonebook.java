import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    static Map<String, List<String>> phonebook = new HashMap<>();

    static void add(String name, List number) {
        phonebook.put(name, number);
    }

    static void print() {
        Map<String, List<String>> map = new TreeMap<>();
        for (String contacts: phonebook.keySet()) {
            map.put(contacts, phonebook.get(contacts));
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List value = entry.getValue();
            System.out.printf("%-10s\t%s%n", key, value);
        }
    }

    static void sort() {
        Map<Integer, String> map = new TreeMap<>();
        for (String contacts: phonebook.keySet()) {
            String contact[] = contacts.split(" ");
            int count = 0;

            for (String contacts2: phonebook.keySet()) {
                String contact2[] = contacts2.split(" ");
                if (contact2[0].equalsIgnoreCase(contact[0])) {
                    count++;
                }
            }
            if(!map.containsValue(contact[0])) {
                map.put(count, contact[0]);
            }

        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("%-10s\t%d%n", value, key);
        }
    }

    static  Map<String, List<String>> search(String name) {
        Map<String, List<String>> map = new TreeMap<>();
        for (String contacts: phonebook.keySet()) {
            String contact[] = contacts.split(" ");
            if (contact[0].equalsIgnoreCase(name) || contact[1].equalsIgnoreCase(name)) {
                map.put(contacts, phonebook.get(contacts));
            }
        }

        return map;
    }
}
