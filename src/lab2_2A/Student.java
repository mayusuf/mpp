package lab2_2A;

public class Student {

    private String name;
    private GradeReport gradeReport;

    public Student(String name, GradeReport gradeReport) {
        this.name = name;
        this.gradeReport = gradeReport;
        this.gradeReport.setStudent(this);
    }

    public GradeReport getGradeReport() {
        return gradeReport;
    }

    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
        if(this.gradeReport.getStudent() != this){
            this.gradeReport.setStudent(this);
        }
    }
}
