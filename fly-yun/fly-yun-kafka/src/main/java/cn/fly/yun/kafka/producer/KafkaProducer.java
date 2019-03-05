package cn.fly.yun.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Service
public class KafkaProducer {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 消息简单发送
     * @param topic
     * @param object
     */

    public void sendMessage(String topic,Object object){
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, object);

        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable throwable) {
                log.info("发送消息失败："+throwable.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, Object> sendResult) {
                log.info("发送消息成功："+sendResult.toString());
            }
        });

    }


    public void sendMsgByKey(String topic,String key,Object object){
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, key, object);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable throwable) {
                log.info("发送消息失败："+throwable.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, Object> sendResult) {
                log.info("发送消息成功："+sendResult.toString());
            }
        });
    }

    public void sendMsgByPartitions(String topic,String key,Object object,Integer partition){
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic,partition,key,object);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable throwable) {
                log.info("发送消息失败："+throwable.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, Object> sendResult) {
                log.info("发送消息成功："+sendResult.toString());
            }
        });
    }

}
