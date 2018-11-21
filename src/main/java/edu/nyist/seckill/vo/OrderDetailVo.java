package edu.nyist.seckill.vo;

import edu.nyist.seckill.bean.OrderInfo;
import lombok.Data;

/**
 * @author rogers
 */
@Data
public class OrderDetailVo {
    /**
     * 商品
     */
    private GoodsVo goods;
    /**
     * 订单
     */
    private OrderInfo order;
}
