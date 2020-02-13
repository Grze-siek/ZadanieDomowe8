package firmaszkoleniowa;

public class TestClass {
    public static void main(String[] args) {
        TrainingGroup group = new TrainingGroup("Szkolenie Java", new Leader("mgr", "Jan", "Zieba"), 2);
        group.addStudent(new Student("Adam", "Małysz", 857565));
        group.addStudent(new Student("frffe", "vrvrv", 775757));
        group.showInfo();
    }
}
