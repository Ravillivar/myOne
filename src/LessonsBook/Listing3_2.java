package LessonsBook;
// импортируем класс JOptionPane из библиотеки swing
import javax.swing.JOptionPane;

public class Listing3_2 {
    public static void main (String[] args){
        //объявление целочисленных переменных
        int yearNow, yearBorn, userAge;
        //объявление строковой переменной
        String userData;
        //выводим окно запроса текущей даты
        userData=JOptionPane.showInputDialog("Какой сейчас год? ");
        //преобразуем строку в число в явном виде
        yearNow=Integer.parseInt(userData);
        // выводим оконо запроса года рождения
        userData=JOptionPane.showInputDialog("В каком году вы родились? ");
        //преобразуем строку в число в явном виде
        yearBorn=Integer.parseInt(userData);
        //вычисляем возраст
        userAge= yearNow - yearBorn;
        //выводим окно сообщения с результатом
        JOptionPane.showMessageDialog(null, "Ваш возраст: " + userAge);
    }
}
