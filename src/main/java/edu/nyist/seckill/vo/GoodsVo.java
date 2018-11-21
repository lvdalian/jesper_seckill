package edu.nyist.seckill.vo;

import edu.nyist.seckill.bean.Goods;
import lombok.Data;

import java.util.Date;

/**
 * @author rogers
 */
@Data
public class GoodsVo extends Goods {
    /**
     * 秒杀价格
     */
    private Double seckillPrice;
    /**
     * 库存数量
     */
    private Integer stockCount;
    /**
     * 秒杀开始时间
     */
    private Date startDate;
    /**
     * 秒杀结束时间
     */
    private Date endDate;
    /**
     * 版本
     */
    private Integer version;
}

