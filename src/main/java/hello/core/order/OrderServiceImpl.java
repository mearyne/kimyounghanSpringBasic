package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    DiscountPolicy discountPolicy = new FixDiscountPolicy();
    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member memberFindById = memberRepository.findById(memberId);
        int discount = discountPolicy.discount(memberFindById, itemPrice);
        return new Order(memberId, itemName, itemPrice, discount);
    }
}
