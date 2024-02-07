package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    OrderService orderService = new OrderServiceImpl();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Test
    public void createOrder() throws Exception {
        // given
        int productPrice = 10000;

        Member dummyMember = new Member(1L, "홍길동", Grade.VIP);
        int discount = discountPolicy.discount(dummyMember, productPrice);


        // when
        Order order = orderService.createOrder(dummyMember.getId(), "itemName", discount);


        // then


    }

}
