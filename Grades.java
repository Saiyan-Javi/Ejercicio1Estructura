public abstract class Grades{

    private int grade;
    private boolean review;
    private String nombre;

    public Grades(String grade, boolean review, String nombre){
        setGrade(grade);
        setReview(review);
        setNombre(nombre);
    }

    public int getGrade(){
        return grade;
    }

    public String getReview(){
        return review;
    }

    public String getNombre() {
        return nombre;
    }

    private void setReview(String review) {
        this.review = review;
    }

    private void setGrade(int grade) {
        this.grade = grade;
    }

    private  void setNombre(String nombre) {
        this.nombre = nombre;
    }
}