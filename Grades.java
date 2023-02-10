public abstract class Grades{

    private int grade;
    private String review;
    private String name;

    public Grades(String name, int grade, String review){
        setName(name);
        setGrade(grade);
        setReview(review);
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
    private void setReview(String review) {
        this.review = review;
    }

    private void setGrade(int grade) {
        this.grade = grade;
    }
}