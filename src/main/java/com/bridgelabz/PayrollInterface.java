package com.bridgelabz;

import java.util.List;

public interface PayrollInterface<T> {
  void writeEmployeePayrollData(List<T> employeePayrollList );
  void readEmployeePayrollData();
  long countEntries();
}
