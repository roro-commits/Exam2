import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {


    @Test
    void name (){
        Employee employee = new Employee("John","12345");
//        String iD = employee.getEmployeeID();
        String name = employee.getEmployeeID();
        assertEquals("John",name);
    }

    @Test
    void iD (){
        Employee employee = new Employee("John","12345");
        String iD = employee.getEmployeeID();
//        String name = employee.getEmployeeID();
        assertEquals("12345",iD);
    }

    @Test
    void arraySize (){
        EmployeeList list  = new EmployeeList();
        int lIstSize = list.getLIstSize();
        assertEquals(0,lIstSize);
    }

    @Test
    void add (){
        EmployeeList list  = new EmployeeList();
        Employee employee1 = new Employee("John","12345");
        list.addEmployee(employee1);
        int lIstSize = list.getLIstSize();
        assertEquals(1,lIstSize);
    }

    @Test
    void remove (){
        EmployeeList list  = new EmployeeList();
        Employee employee2 = new Employee("John","27465");
        Employee employee1 = new Employee("John","12345");
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.deleteEmployee(employee2);
        int lIstSize = list.getLIstSize();
        assertEquals(1,lIstSize);
    }
}
