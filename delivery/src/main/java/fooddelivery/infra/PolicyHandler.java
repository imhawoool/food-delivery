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
    @Autowired 배달Repository 배달Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문발생됨'")
    public void whenever주문발생됨_배달내역복제(@Payload 주문발생됨 주문발생됨){

        주문발생됨 event = 주문발생됨;
        System.out.println("\n\n##### listener 배달내역복제 : " + 주문발생됨 + "\n\n");


        

        // Sample Logic //
        배달.배달내역복제(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_상태업데이트(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 상태업데이트 : " + 요리완료됨 + "\n\n");


        

        // Sample Logic //
        배달.상태업데이트(event);
        

        

    }

}


