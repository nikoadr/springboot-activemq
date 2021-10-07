package springbootactivemq.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springbootactivemq.model.SystemMessage;

import javax.sound.midi.SysexMessage;

/**
 * @author Niko Andrian on 10/7/2021
 * @project springboot-activemq
 */
@RestController
public class PublishController {
    @Autowired
    JmsTemplate jmsTemplate;

    @PostMapping("/publishMessage")

    public ResponseEntity<String> publishMessage(@RequestBody SystemMessage sysexMessage){
        try {
            jmsTemplate.convertAndSend("firsttray-queue",sysexMessage);
            return new ResponseEntity<>("Sent", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
