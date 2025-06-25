package HomeWork02_06.Task1;

class Group {
    String groupName;
    Student[] studentsForGroup;

    public Group(String groupName, Student[] studentsForGroup) {
        this.groupName = groupName;
        this.studentsForGroup = studentsForGroup;
    }

    public void printGroupInfo() {
        System.out.println("Группа: " + groupName);
        for (Student s : studentsForGroup) {
            s.printStudentInfo();
        }
    }
}

