package com.shop.entity;

import com.shop.constant.itemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

import javax.lang.model.element.Name;
import  javax.persistence.*;
import  java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class item {

    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String itemNm;

    @Column(name= "price", nullable = false)
    private  int price;

    @Column(nullable = false)
    private  int stockNumber;

    @Lob
    private  String itemDetail;

    @Enumerated(EnumType.STRING)
    private itemSellStatus itemSellStatus;

    private LocalDateTime regTime;

    private  LocalDateTime updateTime;

}
