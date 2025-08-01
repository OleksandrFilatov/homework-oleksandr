package main.homework20_05.Task4;

public class StringTasks {
    public static void processString(String text) {
        char lastChar = text.charAt(text.length() - 1);
        System.out.println("Последний символ: " + lastChar);


        boolean containsJava = text.contains("Java");
        System.out.println("Содержит \"Java\": " + containsJava);

        String replaced = text.replace('a', 'o');
        System.out.println("После замены 'a' на 'o': " + replaced);

        System.out.println("В верхнем регистре: " + text.toUpperCase());

        System.out.println("В нижнем регистре: " + text.toLowerCase());


        int start = text.indexOf("Java");
        int end = start + "Java".length();
        if (start != -1) {
            String cut = text.substring(start, end);
            System.out.println("Вырезано: " + cut);
        } else {
            System.out.println("Слово 'Java' не найдено");
        }
    }

    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");

        processString(myString);
    }
}
