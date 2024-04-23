package com.shop.back.item.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {

	
	private Long id;

	private String name;

	private String status;                  //  판매중 Y or 판매 중지 N

	private int cnt;                        //  수량

	private int optionPrice;                //  옵션가

	private int price;                      //  가격 (itemGroup의 실제 판매가)

	private int total;                      //  가격 + 옵션가

	
	
}
