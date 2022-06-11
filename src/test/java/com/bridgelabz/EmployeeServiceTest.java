package com.bridgelabz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    @Test
    public void employeeServiceTest(){
        List<EmployeePayroll> employeePayrollList=new ArrayList<>();
        EmployeePayroll[] employeePayrollArray = {
                new EmployeePayroll(1,"amit",2000),
                new EmployeePayroll(2,"hari",1000),
                new EmployeePayroll(3,"ram",3000)
        };
        employeePayrollList= Arrays.asList(employeePayrollArray);
        EmployeeService employeeService = new EmployeeService(employeePayrollList);
employeeService.writeEmployeeData(EmployeeService.IOService.FILE_IO);
employeeService.readEmployeeData(EmployeeService.IOService.FILE_IO);
assertEquals(3,employeeService.countEntries(EmployeeService.IOService.FILE_IO));
    }


}