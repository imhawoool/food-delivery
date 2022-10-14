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
    @Autowired 상점Repository 상점Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='결제됨'")
    public void whenever결제됨_상태업데이트(@Payload 결제됨 결제됨){

        결제됨 event = 결제됨;
        System.out.println("\n\n##### listener 상태업데이트 : " + 결제됨 + "\n\n");


        

        // Sample Logic //
        상점.상태업데이트(event);
        

        

    }


    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문발생됨'")
    public void whenever주문발생됨_주문내역복제(@Payload 주문발생됨 주문발생됨){

        주문발생됨 event = 주문발생됨;
        System.out.println("\n\n##### listener 주문내역복제 : " + 주문발생됨 + "\n\n");


        

        // Sample Logic //
        상점.주문내역복제(event);
        

        

    }

}


