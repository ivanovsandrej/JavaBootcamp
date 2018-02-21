package sef.module17.activity;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTests {

    @Test
    public void mySimpleEqualsTest(){

        String expectedName = "Nattu";
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }

    @Test
    public void myObjectEqualsTest(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000.0);
        Employee expectedEmpObj2 = expectedEmpObj;

        assertEquals(expectedEmpObj, expectedEmpObj2);
    }

    @Test
    public void checkAddEmployeeTest(){

        Employee addedEmployee = new Employee(2, "NewEmployee", 12000);
        assertEquals(2, addedEmployee.getEmpId());
        assertEquals("NewEmployee", addedEmployee.getName());
        assertEquals(12000, addedEmployee.getSalary(), 2);
    }

    @Test
    public void  getHighestPaidEmployeeTest(){

        Employee expectedEmpObj = new Employee(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }

    @Test
    public void  getLowestPaidEmployeeTest(){

      Employee expectedEmpObj = new Employee(2, "Ivan", 1000);
      assertEquals(expectedEmpObj, Employee.getLowestPaidEmployee());
    }

/*
    @Test
    public void  equalsTest(){

        Employee expectedEmpObj = new Employee(2, "Ivan", 1000);
        assertEquals(true, expectedEmpObj.aBoolean((Object)expectedEmpObj));
    }


/*
Add aditional tests based on Employee class
 */
}

