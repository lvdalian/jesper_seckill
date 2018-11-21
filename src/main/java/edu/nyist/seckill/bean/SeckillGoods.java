package edu.nyist.seckill.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by jiangyunxiong on 2018/5/22.
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
