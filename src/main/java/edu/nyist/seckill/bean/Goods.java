package edu.nyist.seckill.bean;

import lombok.Data;

/**
 * @author rogers
 */
@Data
public class Goods {
    private Long id;
    private String goodsName;
    private String goodsTitle;
    private String goodsImg;
    private String goodsDetail;
    private Double goodsPrice;
    private Integer goodsStock;
}
