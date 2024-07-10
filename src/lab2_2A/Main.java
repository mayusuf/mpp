package lab2_2A;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Hafiz", null);
        GradeReport gradeReport = new GradeReport(student);
        student.setGradeReport(gradeReport);

    }
}
