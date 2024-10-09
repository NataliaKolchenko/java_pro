import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// у нас 2 потока. 1й (основной) - взаимодействует с пользователем. Запрашивает города, складывает в файл
// 2й - работает в фотоновом режиме (демон). с какой-то периодичесностью должен проверять файл,
// если в файле больше 10 строк - то очищает этот файл
// если пользователь ввел "выход", то работа приложения завершается
public class ExampleApp {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        Monitor monitor = new Monitor(strings, new FileCustomerWriter());
        Dialog dialog = new Dialog(strings);

        Thread threadMonitoring = new Thread(monitor);
        Thread threadDialog = new Thread(dialog);

        threadMonitoring.setDaemon(true);
        threadMonitoring.start();

        threadDialog.start();
    }
}
