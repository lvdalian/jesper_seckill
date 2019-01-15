package edu.nyist.seckill.bean;

import lombok.Data;

/**
 * @author Rogers
 */
@Data
public class SeckillOrder {
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
