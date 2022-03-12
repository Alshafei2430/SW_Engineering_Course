import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord {
    private Student student;
    private Vector assignments;

    CourseRecord() {
        assignments = new Vector();
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student s) {
        student = s;
    }
    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }
    public Enumeration getAssignments() {
        return assignments.elements();
    }

    public double average() throws NotYetSetException {
        /*
            computes and returns the average for a student by
            traversing the vector of her assignments and 
            obtaining the mark for her assignment.
            this method should handle the NotYetSetException that
            can be thrown by getMaker() by
            ignoring the Assignment object that caused it in the
            average computation
        */
        // get all the vector elements into enumeration
        double total = 0;
        double average = 0;
        int numberOfAssignementsWithMarks = 0;
        Enumeration<Assignment> e = assignments.elements();
        // iterate untill the last element
        while (e.hasMoreElements()) {
            try {
                // System.out.println(e.nextElement().getMark());
                total += e.nextElement().getMark();
                numberOfAssignementsWithMarks++;
            } catch (Exception ex) {
                // TODO:
            } 
        }
        average = total / numberOfAssignementsWithMarks;

        return average;
    }

    public boolean canTakeFinalExam() {
        /*
            Returns true if the student has a mark
            for at least three assignments and false
            otherwise
        */
        int count = 0;
        Enumeration<Assignment> e = assignments.elements();
        while(e.hasMoreElements()) {
            Assignment a = e.nextElement();
            try {
                a.getMark();
                count++;
            } catch (Exception ex) {
                //TODO:
            }
        }
        return count >= 3;
    }
}