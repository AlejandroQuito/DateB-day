import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main (String [] args) {
        int day = 4;
        int month = 1;                                                                 //Исчесления месяцев от нуля, следовательно февраль 1.
        int year = 1994;
        int age = 100;


        for (int i = 0; i <= age; i++) {

            Calendar calendar = new GregorianCalendar(year, month, day);                //Задали отправную точку
            calendar.add(Calendar.YEAR, i);                                             // Прибавляем по одному году через константу и метод календаря
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");   // Устанавливаем нужный нам формат вывода даты
            System.out.println(i + " - "  + dateFormat.format(calendar.getTime()));     // Выводим через метод гет тайм
        }
    }
}
