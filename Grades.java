public abstract class Grades{

    private int grade;
<<<<<<< HEAD
    private boolean review;
    private String nombre;

    public Grades(String grade, boolean review, String nombre){
=======
    private String review;
    private String name;

    public Grades(String name, int grade, String review){
        setName(name);
>>>>>>> bfdc468ed75fe02f0eda993ceae096ff0544f7e1
        setGrade(grade);
        setReview(review);
        setNombre(nombre);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
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