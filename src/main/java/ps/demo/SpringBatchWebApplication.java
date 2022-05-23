package ps.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@Slf4j
@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchWebApplication implements CommandLineRunner {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job processJob;

    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchWebApplication.class, args);
        log.info("===>>SpringBatchWebApplication started.");
    }


    @Override
    public void run(String... args) throws Exception {
        String msg = jmsTemplate.receiveAndConvert("activemq.queue1")+"";
        log.info("===>>Receiving msg: {}", msg);
    }
}
