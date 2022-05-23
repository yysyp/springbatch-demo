package ps.demo.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

//    @Autowired
//    private JmsMessagingTemplate jmsMessagingTemplate;
//
//    //This will enter while true for listening
//    @JmsListener(destination = "activemq.queue1")
//    public void receiveMessage(String message) {
//        log.info("Receive message:{}", message);
//    }

}
