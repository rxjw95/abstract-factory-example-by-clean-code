package switchExample.after;

import switchExample.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money money);
}
