package homework09_05;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("-------------------ВАРИАНТ 1---------------------");
        Manager alex = new Manager();
        alex.age = 30;
        alex.salary = 3000;
        System.out.println("зарплата: " + alex.salary);
        System.out.println("возраст: " + alex.age);
        alex.age++;
        System.out.println("зарплата: " + alex.salary);
        System.out.println("new возраст " + alex.age);

        Manager vasya = new Manager();
        vasya.age = 40;
        vasya.salary = 2000;
        System.out.println("зарплата: " + vasya.salary);
        System.out.println("возраст: " + vasya.age);
        vasya.age++;
        System.out.println("зарплата: " + vasya.salary);
        System.out.println("new возраст " + vasya.age);
        System.out.println("-------------------ВАРИАНТ 2---------------------");

        Manager bob = new Manager(30, 3000);
        bob.printData();
        bob.birthday();
        bob.printData();

        Manager max = new Manager(40, 2000);
        max.printData();
        max.birthday();
        max.printData();
        System.out.println("-------------------КОНЕЦ---------------------");
    }
}


class Manager {
    int age;
    double salary;

    public Manager() {

    }

    public Manager(int givenAge, double givenSalary) {
        age = givenAge;
        salary = givenSalary;
    }

    void birthday() {
        age++;
    }

    void printData() {
        System.out.println("зарплата: " + salary + "\nвозраст: " + age);
    }
}