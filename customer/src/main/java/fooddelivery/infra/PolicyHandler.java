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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    fooddelivery.external.주문Service 주문Service;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문거절됨'")
    public void whenever주문거절됨_카카오톡발송(@Payload 주문거절됨 주문거절됨){

        주문거절됨 event = 주문거절됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 주문거절됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리시작됨'")
    public void whenever요리시작됨_카카오톡발송(@Payload 요리시작됨 요리시작됨){

        요리시작됨 event = 요리시작됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 요리시작됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문접수됨'")
    public void whenever주문접수됨_카카오톡발송(@Payload 주문접수됨 주문접수됨){

        주문접수됨 event = 주문접수됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 주문접수됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_카카오톡발송(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 요리완료됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달건픽됨'")
    public void whenever배달건픽됨_카카오톡발송(@Payload 배달건픽됨 배달건픽됨){

        배달건픽됨 event = 배달건픽됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 배달건픽됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달완료됨'")
    public void whenever배달완료됨_카카오톡발송(@Payload 배달완료됨 배달완료됨){

        배달완료됨 event = 배달완료됨;
        System.out.println("\n\n##### listener 카카오톡발송 : " + 배달완료됨 + "\n\n");

        // REST Request Sample
        
        // 주문Service.get주문(/** mapping value needed */);


        

        // Sample Logic //

        

    }

}


