package edu.nyist.seckill.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author Rogers
 */
@Data
public class SeckillGoods {
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
    private int version;
}
