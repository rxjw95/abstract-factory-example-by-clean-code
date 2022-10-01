package switchExample.after;

import switchExample.EmployeeType;
import switchExample.InvalidEmployeeType;

public class Solution {
    public static void main(String[] args) throws InvalidEmployeeType {
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        Employee employee = employeeFactory.makeEmployee(EmployeeType.COMMISSIONED);
        employee.calculatePay();
    }
}
