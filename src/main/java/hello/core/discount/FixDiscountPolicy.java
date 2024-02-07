package hello.core.discount;

import hello.core.member.Member;

import static hello.core.member.Grade.VIP;

public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        return member.getGrade() == VIP ? discountFixAmount : 0;
    }
}
