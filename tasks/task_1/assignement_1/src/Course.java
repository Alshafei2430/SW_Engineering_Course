import java.util.Vector;
import java.util.Enumeration;

public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle( String t) {
        title = t;
    }
    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }
    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }

    // task
    
    public void printCourseStudents() {
        /* prints the names of the students
        enrolled for this course
        */
        Enumeration<CourseRecord> e = courseRecords.elements();
        System.out.println("=========Course Students=========");
        while (e.hasMoreElements()) {
            String studenName = e.nextElement().getStudent().getName();
            System.out.println(studenName);
        }
    }

    public void printBestStudent() {
        /*
            prints the best student according to the 
            average computed by the CourseRecord class
            for each student
        */
        String bestStudent = "";
        double bestAverage = 0;
        Enumeration<CourseRecord> e = courseRecords.elements();
        while (e.hasMoreElements()) {
            try {
                CourseRecord courseRecord = e.nextElement();
                double average = courseRecord.average();
                if (average > bestAverage) {
                    bestAverage = average;
                    bestStudent = courseRecord.getStudent().getName();
                }
            } catch (Exception ex) {
                //TODO: handle exception
            }  
        }
        System.out.println("Best Student =====:- " + bestStudent);

    }

    public void printFinalExamStudents() {
        /*
            prints the student names that can participate
            in the final exam, based in the value returned
            by the method "boolean canTakeFinalExam()"
            of the CourseRecord class
        */
        Enumeration<CourseRecord> e = courseRecords.elements();

        while(e.hasMoreElements()) {
            CourseRecord cr = e.nextElement();
            if (cr.canTakeFinalExam()) {
                System.out.println("Student " + cr.getStudent().getName() + " can take the final exam for this course");
            } else {
                System.out.println("Student " + cr.getStudent().getName() + " can not take the final exam for this course");
            }
        }
}

}