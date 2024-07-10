package lab2_2A;

public class GradeReport {

    private Student student;

    public GradeReport(Student student){
        this.student = student;
        this.student.setGradeReport(this);
    }

    public void setStudent(Student student) {
        this.student = student;
        if(this.student.getGradeReport() != this){
            this.student.setGradeReport(this);
        }
    }

    public Student getStudent() {
        return this.student;
    }
}
