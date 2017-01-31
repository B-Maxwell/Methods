/**
 * Created by Ben Maxwell on 1/31/17.
 * Established constructor, setters, and getters for this class
 */

public class Employee {
    String name;
    String department;
    String positionTitle;
    int yearOfHire;
    boolean isManager;


    //This is the constructor for the employee class
    public Employee(String name, String department, String positionTitle, int yearOfHire, boolean isManager) {
        this.name = name;
        this.department = department;
        this.positionTitle = positionTitle;
        this.yearOfHire = yearOfHire;
        this.isManager = isManager;
    }

    //This is the setter for employee name
    public void setName(String name) {
        this.name = name;
        if (name.contains(" ")) {
            this.name = name;

        } else {

            System.out.println("Name must contain first and last name!");
        }
    }

    //This is the getter for employee name
    public String getName() {
        return name;
    }

    //This is the setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //This is the getter for department
    public String getDepartment(){
        return department;
    }

    //This is the setter for position title
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;

    }

    //This is the getter for position title
    public String getPositionTitle() {
        return positionTitle;

    }

    //This is the setter for year of hire
    public void setYearOfHire(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }

    //This is the getter for year of hire
    public int getYearOfHire(){
        return yearOfHire;
    }

    //This is the setter for manager indicator
    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    //This is the getter for manager indicator
    public boolean getIsManager() {
        return isManager;
    }

}
