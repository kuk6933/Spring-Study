package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "oreders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id") // 외래키 이름이 member_id 가됨
    private Member member; //연관관계 주인

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL) //orderA, orderB...이렇게 있을때 하나하나 persist안하고 persist(order)만해도 다 해줌
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;



    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public void setMmeber(Member member) { //연관관계 편의 메서드 (양방향에서 사용)
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItem orderItem) { //연관관계 편의 메서드 (양방향에서 사용)
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDeilivery(Delivery delivery) { //연관관계 편의 메서드 (양방향에서 사용)
        this.delivery = delivery;
        delivery.setOrder(this);
    }

}
