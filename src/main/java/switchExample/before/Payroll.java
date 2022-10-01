package switchExample.before;

import switchExample.InvalidEmployeeType;
import switchExample.Money;

public class Payroll {

    /*
    1. case 별로 서로 다른 계산 방법이 있다. 클래스의 변경 이유가 여러 가지가 있다는 의미로 SRP 원칙 위배 (클래스의 변경 이유는 오직 한 가지)
    2. 새 직원의 유형이 추가될 때마다 해당 클래스의 코드를 변경해야 한다. 그러므로 OCP 원칙 위배
    3. 직종별 월급 계산 방법과 월급날, 휴가일수도 다르다.
     */
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED -> {
                return calculateCommissionedPay(e);
            }
            case HOURLY -> {
                return calculateHoulyPay(e);
            }
            case SALARIED -> {
                return calculateSalariedPay(e);
            }
            default -> throw new InvalidEmployeeType(e.type);
        }
    }

    private Money calculateCommissionedPay(Employee e) {
        // omitted
        return new Money(0);
    }

    private Money calculateHoulyPay(Employee e) {
        // omitted
        return new Money(0);
    }

    private Money calculateSalariedPay(Employee e) {
        // omitted
        return new Money(0);
    }

}
