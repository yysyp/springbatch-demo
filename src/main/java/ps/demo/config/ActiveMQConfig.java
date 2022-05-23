package ps.demo.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;

@Configuration
public class ActiveMQConfig {

    public static final String ACTIVEMQ_QUEUE = "activemq.queue1";

    @Bean
    public Queue activeMqJMSQueue() {
        return new ActiveMQQueue(ACTIVEMQ_QUEUE);
    }


}
