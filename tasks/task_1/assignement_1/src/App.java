public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student s1 = new Student();
        Student s2 = new Student(); 
        Student s3 = new Student();

        s1.setName("s1");
        s2.setName("s2");
        s3.setName("s3");

        Assignment cr1_a1 = new Assignment();
        Assignment cr1_a2 = new Assignment();
        Assignment cr1_a3 = new Assignment();
        Assignment cr2_a1 = new Assignment();
        Assignment cr3_a1 = new Assignment();

        cr1_a1.setMark(1);
        cr1_a2.setMark(2);
        cr1_a3.setMark(4);

        cr2_a1.setMark(1);

        CourseRecord cr1 = new CourseRecord();
        CourseRecord cr2 = new CourseRecord();
        CourseRecord cr3 = new CourseRecord();
        
        cr1.setStudent(s1);
        cr2.setStudent(s2);
        cr3.setStudent(s3);

        cr1.addAssignment(cr1_a1);
        cr1.addAssignment(cr1_a2);
        cr1.addAssignment(cr1_a3);
        cr2.addAssignment(cr2_a1);
        cr3.addAssignment(cr3_a1);

        Course c1 = new Course();
        Course c2 = new Course();

        c1.setTitle("c1");
        c2.setTitle("c2");

        c1.addCourseRecord(cr1);
        c1.addCourseRecord(cr3);
        c2.addCourseRecord(cr2);
        
        c1.printCourseStudents();
        System.out.println("========================================================");
        c1.printBestStudent();
        System.out.println("========================================================");
        c1.printFinalExamStudents();
    }
}
