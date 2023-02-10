import java.util.ArrayList;
import java.util.Collection;


public class ExamNotes {
    ArrayList<Grades> students;

    public void addStudent(boolean approved, String name, String note) {
        Grades student = new Grades(note, approved, name);
        ((Collection<Grades>) student).add(student);
    }

    public void printByApprov() {

    }
}