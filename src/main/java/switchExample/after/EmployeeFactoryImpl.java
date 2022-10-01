package switchExample.after;

import switchExample.EmployeeType;
import switchExample.InvalidEmployeeType;
import switchExample.after.employee.HourlyEmployee;
import switchExample.after.employee.CommissionedEmployee;
import switchExample.after.employee.SalariedEmployee;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public Employee makeEmployee(EmployeeType type) throws InvalidEmployeeType {
        switch (type) {
            case COMMISSIONED -> {
                return new CommissionedEmployee();
            }
            case HOURLY -> {
                return new HourlyEmployee();
            }
            case SALARIED -> {
                return new SalariedEmployee();
            }
            default -> throw new InvalidEmployeeType(type);
        }
    }
}
