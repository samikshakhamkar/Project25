package com.task.shopCart.dto;


import com.task.shopCart.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCartDto {

    private Integer id;

    private Integer product_id;

    private Integer qty;

    private Double price;

    private User userId;

    private  String added_date;

    private String productName;


}
