/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Текст в каждой строке должен быть уникален.
•	Слова в строке не должны повторяться т.е. (мамамамамама, мамамамамыла) итд не должно быть
•	Должны быть выведены все возможные комбинации. */
import java.util.Scanner;
public class Main {
    public static void main(String[]   args) {
        String[] str = { "мама", "мыла", "раму"};
        for (int a = 0; a < str.length; a = a + 1){
        for (int b = 0; b < str.length; b = b + 1){
        for (int c = 0; c < str.length; c = c + 1){
    System.out.println(str[a]+str[b]+str[c]);
        }
        }
        }
    }
    }
        
