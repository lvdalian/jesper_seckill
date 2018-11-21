package edu.nyist.seckill.rabbitmq;

import edu.nyist.seckill.bean.User;
import lombok.Data;

/**
 * Created by jiangyunxiong on 2018/5/29.
 *
 * 消息体
 */
@Data
public class SeckillMessage {
    private User user;
    private long goodsId;
}
