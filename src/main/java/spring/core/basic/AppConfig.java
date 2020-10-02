package spring.core.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.core.basic.discount.DiscountPolicy;
import spring.core.basic.discount.FixDiscountPolicy;
import spring.core.basic.member.MemberRepository;
import spring.core.basic.member.MemberService;
import spring.core.basic.member.MemberServiceImpl;
import spring.core.basic.member.MemoryMemberRepository;
import spring.core.basic.order.OrderService;
import spring.core.basic.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
