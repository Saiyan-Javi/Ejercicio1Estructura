public abstract class Grades{

    private String grade;
    private boolean review;
    private String nombre;

    public Grades(String grade, boolean review, String nombre){
        setGrade(grade);
        setReview(review);
        setNombre(nombre);
    }

    public Grades(String grade2, int i, String nombre2) {
    }

    public String getGrade(){
        return grade;
    }

    public boolean getReview(){
        return review;
    }

    public String getNombre() {
        return nombre;
    }

    private void setReview(boolean review2) {
        this.review = review2;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    private  void setNombre(String nombre) {
        this.nombre = nombre;
    }
}