import java.util.ArrayList;

public class EmployeeList {

    private ArrayList<Employee> employeeLIst = new ArrayList<Employee>();
    private ArrayList<String> iD = new ArrayList<String>();

    //function adding employee to array list
    public void addEmployee(Employee obj){
        String uniqueID = obj.getEmployeeID();

            if(!iD.contains(uniqueID))
            {
                iD.add(uniqueID);
                employeeLIst.add(obj);

            }
            else
            {
                System.out.println("Duplicate Employee details found, no object added");
            }




    }
    //function removing employee from array list
    public void deleteEmployee(Employee obj){
        String uniqueID = obj.getEmployeeID();

        if(!iD.contains(uniqueID))
        {
            iD.remove(uniqueID);
            employeeLIst.remove(obj);

        }
        else
        {
            System.out.println(" Employee details Not found, no object Removed");
        }




    }

// get size of array
   public  int getLIstSize() {
         int size;
        size = employeeLIst.size();
        return size;
    }

}
