package HomeWork02_06.Task1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("alex", "311");
        Student s2 = new Student("axil", "322");
        Student s3 = new Student("michel", "212");
        Student s4 = new Student("ira", "112");

        Student[] group1Students = {s1, s2};
        Student[] group2Students = {s3, s4};

        Group group1 = new Group("Group1", group1Students);
        Group group2 = new Group("Group2", group2Students);

        System.out.println("Группа 1:");
        group1.printGroupInfo();

        System.out.println("\nГруппа 2:");
        group2.printGroupInfo();
    }
}
