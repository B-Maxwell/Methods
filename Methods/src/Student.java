/**
 * Created by Ben Maxwell on 1/31/17.
 * Established constructor, setters, and getters for this class
 */
public class Student {
    String name;
    String courseOfStudy;
    boolean paidInFull; //Has the student's account been paid in full
    double balanceOwed;


    public Student(String name, String courseOfStudy, boolean paidInFull, double balanceOwed) {
        this.name = name;
        this.courseOfStudy = courseOfStudy;
        this.paidInFull = paidInFull;
        this.balanceOwed = balanceOwed;
    }

    //Creates getter for name
    public String getName() {
        return name;
    }

    //Creates setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Creates getter for course of study
    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    //Creates setter for course of study
    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    //Creates getter for paid in full indicator
    public boolean getPaidInFull() {
        return paidInFull;
    }

    //Creates setter for paid in full
    public void setPaidInFull(boolean paidInFull) {
        this.paidInFull = paidInFull;

        if (paidInFull == true) {

            System.out.println("Student is in good standing");

        } else {

            System.out.println("Student is not in standing");

        }
    }
    //Creates getter for balance owed
    public double getBalanceOwed() {
        return balanceOwed;
    }

    //Creates setter for balanced owed
    public void setBalanceOwed(double balanceOwed) {
        this.balanceOwed = balanceOwed;
    }
}

