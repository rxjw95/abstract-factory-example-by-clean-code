package switchExample;

import switchExample.EmployeeType;

public class InvalidEmployeeType extends Exception {
    public InvalidEmployeeType(EmployeeType type) {
        super(String.format("Invalid Employee Type: %s", type.toString()));
    }
}
