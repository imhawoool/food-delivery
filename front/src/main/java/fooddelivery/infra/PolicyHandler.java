package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired 주문Repository 주문Repository;
    @Autowired 결제Repository 결제Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문발생됨'")
    public void whenever주문발생됨_결제(@Payload 주문발생됨 주문발생됨){

        주문발생됨 event = 주문발생됨;
        System.out.println("\n\n##### listener 결제 : " + 주문발생됨 + "\n\n");


        

        // Sample Logic //
        결제.결제(event);
        

        

    }


}


