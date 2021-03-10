//Rotimi Awoniran
//  G003377153@gmit.ie
// 10/03/2021


// employee class stores employee name and ID

public class Employee {
    private String employeeName;
    private String  employeeID;



  public  Employee() {
        // TODO Auto-generated constructor stub
    }

    public  Employee(String name, String iD) {

        setEmployeeID(iD);
        setEmployeeName(name);

    }




    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName.length() >= 5)
        {
            this.employeeName = employeeName;

        }
        else
        {
            System.out.println("The name length is too short");
        }

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {

        if (employeeID.length() >= 5)
        {
            this.employeeID = employeeID;

        }
        else
        {
            System.out.println("The ID length is too short");
        }

    }
}
