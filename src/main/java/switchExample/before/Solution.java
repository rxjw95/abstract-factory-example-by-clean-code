package switchExample.before;

import switchExample.EmployeeType;
import switchExample.InvalidEmployeeType;

public class Solution {
    public static void main(String[] args) throws InvalidEmployeeType {
        Payroll payroll = new Payroll();
        payroll.calculatePay(new Employee(EmployeeType.COMMISSIONED));
    }
}
