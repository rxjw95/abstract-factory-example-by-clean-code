package switchExample.after;

import switchExample.EmployeeType;
import switchExample.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeType type) throws InvalidEmployeeType;
}
