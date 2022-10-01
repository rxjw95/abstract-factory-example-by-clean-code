package switchExample.after.employee;

import switchExample.Money;
import switchExample.after.Employee;

public class CommissionedEmployee extends Employee {
    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money money) {

    }

}
