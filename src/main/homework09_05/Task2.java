package main.homework09_05;

public class Task2 {
    public static void main (String[] args){
        double mon = 17;
        double tue = 16;
        double wen = 16;
        double thu = 15;
        double fri = 12;
        double sat = 19;
        double sun = 14;

        double averageTemp = (mon + tue + wen + thu + fri + sat + sun) /7;

        System.out.println("средняя температура за неделю: " + averageTemp );

    }
}
