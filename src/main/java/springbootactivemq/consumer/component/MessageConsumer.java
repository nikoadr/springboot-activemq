package springbootactivemq.consumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import springbootactivemq.model.SystemMessage;

/**
 * @author Niko Andrian on 10/7/2021
 * @project springboot-activemq
 */
@Component
public class MessageConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "firsttray-queue")
    public void messageListener(SystemMessage systemMessage){
        LOGGER.info("Message received. {}",systemMessage);
    }
}
