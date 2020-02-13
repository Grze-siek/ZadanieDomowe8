package firmaszkoleniowa;

public class TrainingGroup {
    Leader leader;
    Student[] students;
    String nameOfGroup;
    int maxNumberOfStudents;
    public int numberOfStudentsInGroup;

    public TrainingGroup(String nameOfGroup, Leader leader, int maxNumberOfStudents) {
        this.nameOfGroup = nameOfGroup;
        this.leader = leader;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = new Student[maxNumberOfStudents];

    }

    public void addStudent(Student student)
    {
        if(maxNumberOfStudents > numberOfStudentsInGroup) {
            students[numberOfStudentsInGroup] = student;
            numberOfStudentsInGroup++;
        }
        else
            System.out.println("Maksymalna ilosc osob w grupie");
    }

    public void showInfo()
    {
        System.out.println(nameOfGroup);
        System.out.println(leader.getDegree() + " " + leader.getFirstName() + " " + leader.getLastName());
        for (int i = 0; i < numberOfStudentsInGroup; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + " " + students[i].getPhoneNumber());
        }
    }

}
