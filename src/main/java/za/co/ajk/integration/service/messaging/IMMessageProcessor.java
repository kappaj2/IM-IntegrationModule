package za.co.ajk.integration.service.messaging;

import org.springframework.messaging.Message;


public interface IMMessageProcessor {
    
    void processMessageReceived(Message<?> message);

}
