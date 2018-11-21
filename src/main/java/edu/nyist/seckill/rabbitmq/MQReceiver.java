package edu.nyist.seckill.rabbitmq;

import edu.nyist.seckill.bean.SeckillOrder;
import edu.nyist.seckill.bean.User;
import edu.nyist.seckill.redis.RedisService;
import edu.nyist.seckill.service.GoodsService;
import edu.nyist.seckill.service.OrderService;
import edu.nyist.seckill.service.SeckillService;
import edu.nyist.seckill.vo.GoodsVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiangyunxiong on 2018/5/29.
 */
@Service
@Slf4j
public class MQReceiver {

    @Autowired
    RedisService redisService;

    @Autowired
    GoodsService goodsService;

    @Autowired
    OrderService orderService;

    @Autowired
    SeckillService seckillService;

    @RabbitListener(queues=MQConfig.QUEUE)
    public void receive(String message){
        log.info("receive message:"+message);
        SeckillMessage m = RedisService.stringToBean(message, SeckillMessage.class);
        User user = m.getUser();
        long goodsId = m.getGoodsId();

        GoodsVo goodsVo = goodsService.getGoodsVoByGoodsId(goodsId);
        int stock = goodsVo.getStockCount();
        if(stock <= 0){
            return;
        }

        //判断重复秒杀
        SeckillOrder order = orderService.getOrderByUserIdGoodsId(user.getId(), goodsId);
        if(order != null) {
            return;
        }

        //减库存 下订单 写入秒杀订单
        seckillService.seckill(user, goodsVo);
    }

    @RabbitListener(queues = MQConfig.TOPIC_QUEUE1)
    public void receiveTopic1(String message) {
        log.info(" topic  queue1 message:" + message);
    }

    @RabbitListener(queues = MQConfig.TOPIC_QUEUE2)
    public void receiveTopic2(String message) {
        log.info(" topic  queue2 message:" + message);
    }
}
