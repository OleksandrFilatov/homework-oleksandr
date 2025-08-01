package main.Task1;

class Student {
    String name;
    String groupName;

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public void printStudentInfo() {
        System.out.println("Студент: " + name + ", группа: " + groupName);
    }

}
