import java.util.ArrayList;

public class ExamNotes {
    ArrayList<Grades> students;

    public void addStudent(boolean approved, String name, String note) {
        Grades student = new Grades(note, approved, name);
        studets.add(student);
    }

    public void printByApprov() {

    }
}