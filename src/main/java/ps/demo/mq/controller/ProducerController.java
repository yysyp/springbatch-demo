package ps.demo.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class ProducerController {

    @Autowired
    private Queue queue;

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("send/{msg}")
    public String send(@PathVariable("msg") final String msg) {
        jmsTemplate.convertAndSend(queue, msg);
        return "Your message" + msg + " published successfully";
    }
}
