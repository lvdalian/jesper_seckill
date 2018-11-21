package edu.nyist.seckill.vo;

import edu.nyist.seckill.bean.User;
import lombok.Data;

/**
 * @author rogers
 */
@Data
public class GoodsDetailVo {
    private int seckillStatus = 0;
    private int remainSeconds = 0;
    /**
     * 商品
     */
    private GoodsVo goods ;
    /**
     * 用户
     */
    private User user;
}
