package edu.nyist.seckill.rabbitmq;

import edu.nyist.seckill.bean.User;
import lombok.Data;

/**
 * @author rogers
 *
 * 消息体
 */
@Data
public class SeckillMessage {
    private User user;
    private long goodsId;
}
