import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    static Logger logger;

    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        String filePath = "src/task2.txt";

        createLogger();
        System.out.println(parseJson(json));
        writeToFile(parseJson(json), filePath);
        closeLogger();
    }

    private static void closeLogger() {
        for (Handler handler: logger.getHandlers()){
            handler.close();
        }
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("src/log.txt", true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SimpleFormatter formatter = new SimpleFormatter();
        if (fileHandler != null){
            fileHandler.setFormatter(formatter);
        }
    }

    static void writeToFile(String s1, String filePath) {

        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(s1);
            writer.write("\n");
            writer.flush();
            logger.info("Запись успешно выполнена");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }
    }

    private static String parseJson(String json) {
        String[] entries = json.substring(1, json.length() - 2).split("\\},\\{");

        String result = "";
        for (String entry : entries) {
            String[] fields = entry.split(",");

            String фамилия = getValue(fields[0]);
            String оценка = getValue(fields[1]);
            String предмет = getValue(fields[2]);

            result += "Студент " + фамилия + " получил " + оценка + " по предмету " + предмет + ".\n";
        }

        return result;
    }

    private static String getValue(String field) {
        return field.split(":")[1].replaceAll("\"", "");
    }
}