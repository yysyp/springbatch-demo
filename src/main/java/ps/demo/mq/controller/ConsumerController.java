package ps.demo.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class ConsumerController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("get/{msg}")
    public String receive() {
        String msg = jmsTemplate.receiveAndConvert("activemq.queue1")+"";
        return msg;
    }


}
