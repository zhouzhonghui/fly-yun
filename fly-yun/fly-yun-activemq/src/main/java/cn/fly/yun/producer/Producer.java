package cn.fly.yun.producer;

import org.apache.activemq.ScheduledMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 实时发送消息，队列，消息
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, final String message){
        jmsTemplate.convertAndSend(destination, message);
    }

    public void sendDelayMessage(Destination destination,long time,String message){
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText(message);
                textMessage.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, time);
                return textMessage;
            }
        });
    }

    public void sendMessage(final String queueName,final String message){
        jmsTemplate.convertAndSend(queueName, message );
    }


    public void sendDelayMessage(final String queueName,long time,String message){
        jmsTemplate.send(queueName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText(message);
                textMessage.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, time);
                return textMessage;
            }
        });
    }

}
