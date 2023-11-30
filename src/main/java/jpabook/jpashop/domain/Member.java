package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    //mappedBy 맵핑된 거울일 뿐이야
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
