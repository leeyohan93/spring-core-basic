package spring.core.basic.discount;

import org.springframework.stereotype.Component;
import spring.core.basic.annotation.MainDiscountPolicy;
import spring.core.basic.member.Grade;
import spring.core.basic.member.Member;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private static final int discountPercent = 10; //10% 할인

    @Override
    public int discount(final Member member, final int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        return 0;
    }
}
