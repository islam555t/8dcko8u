import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                // a) Создаем списки А и Б
                List<String> listA = new ArrayList<>();
                List<String> listB = new ArrayList<>();

                // b) Считываем 5 строк от пользователя и сохраняем в список А
                System.out.println("Введите 5 строк для списка A:");
                for (int i = 0; i < 5; i++) {
                    String input = scanner.nextLine();
                    listA.add(input);
                }

                // c) Отображаем список А
                System.out.println("Список A:");
                for (String str : listA) {
                    System.out.println(str);
                }

                // d) Считываем еще 5 строк от пользователя и сохраняем в список Б
                System.out.println("Введите 5 строк для списка B:");
                for (int i = 0; i < 5; i++) {
                    String input = scanner.nextLine();
                    listB.add(input);
                }

                // e) Объединяем списки А и Б в новый список С
                List<String> listC = new ArrayList<>();
                int size = listA.size();
                for (int i = 0; i < size; i++) {
                    listC.add(listA.get(i));
                    listC.add(listB.get(size - 1 - i));
                }

                // f) Отображаем список С
                System.out.println("Список C:");
                for (String str : listC) {
                    System.out.println(str);
                }

                // g) Сортируем элементы списка С по длине слова
                Collections.sort(listC, (a, b) -> a.length() - b.length());

                // Отображаем отсортированный список С
                System.out.println("Отсортированный список C:");
                for (String str : listC) {
                    System.out.println(str);
                }
            }
        }
        

