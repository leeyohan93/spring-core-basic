package spring.core.basic.discount;

import org.springframework.stereotype.Component;
import spring.core.basic.member.Grade;
import spring.core.basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private static final int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
