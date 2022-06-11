package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<EmployeePayroll> employeePayrollList = new ArrayList<>();

    enum IOService {
        CONSOLE_IO,
        FILE_IO
    }

    EmployeeService() {

    }

    EmployeeService(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;

    }

    void writeEmployeeData(IOService ioService) {
        PayrollInterface<EmployeePayroll> obj;
        if (IOService.CONSOLE_IO.equals(ioService)) {
            obj = new EmployeePayrollConsoleService();
            obj.writeEmployeePayrollData(employeePayrollList);
        } else if (IOService.FILE_IO.equals(ioService)) {
            obj = new EmployeePayroleFileService();
            obj.writeEmployeePayrollData(employeePayrollList);
        }
    }

    void readEmployeeData(IOService ioService) {
        PayrollInterface<EmployeePayroll> obj;
        if (IOService.CONSOLE_IO.equals(ioService)) {
            obj = new EmployeePayrollConsoleService();
            obj.readEmployeePayrollData();
        } else if (IOService.FILE_IO.equals(ioService)) {
            obj = new EmployeePayroleFileService();
            obj.readEmployeePayrollData();
        }
    }
    long countEntries(IOService ioService){
        PayrollInterface<EmployeePayroll> obj;
        long count=0;
        if (IOService.CONSOLE_IO.equals(ioService)) {
            obj = new EmployeePayrollConsoleService();
           count = obj.countEntries();
        } else if (IOService.FILE_IO.equals(ioService)) {
            obj = new EmployeePayroleFileService();
           count= obj.countEntries();
        }
        return count;
    }
}