public abstract class Grades{

    private int grade;
    private String review;

    public Grades(int grade, String review){
        setGrade(grade);
        setReview(review);
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