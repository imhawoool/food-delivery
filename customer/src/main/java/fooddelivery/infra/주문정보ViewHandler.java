package fooddelivery.infra;

import fooddelivery.domain.*;
import fooddelivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class 주문정보ViewHandler {


    @Autowired
    private 주문정보Repository 주문정보Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void when주문발생됨_then_CREATE_1 (@Payload 주문발생됨 주문발생됨) {
        try {

            if (!주문발생됨.validate()) return;

            // view 객체 생성
            주문정보 주문정보 = new 주문정보();
            // view 객체에 이벤트의 Value 를 set 함
            주문정보.setId(주문발생됨.getId());
            // view 레파지 토리에 save
            주문정보Repository.save(주문정보);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void when결제됨_then_UPDATE_1(@Payload 결제됨 결제됨) {
        try {
            if (!결제됨.validate()) return;
                // view 객체 조회
            Optional<주문정보> 주문정보Optional = 주문정보Repository.findById(Long.valueOf(결제됨.getOrderId()));

            if( 주문정보Optional.isPresent()) {
                 주문정보 주문정보 = 주문정보Optional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                주문정보.setStatus("결제됨");    
                // view 레파지 토리에 save
                 주문정보Repository.save(주문정보);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when주문접수됨_then_UPDATE_2(@Payload 주문접수됨 주문접수됨) {
        try {
            if (!주문접수됨.validate()) return;
                // view 객체 조회
            Optional<주문정보> 주문정보Optional = 주문정보Repository.findById(Long.valueOf(주문접수됨.getOrderId()));

            if( 주문정보Optional.isPresent()) {
                 주문정보 주문정보 = 주문정보Optional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                주문정보.setStatus("접수됨");    
                // view 레파지 토리에 save
                 주문정보Repository.save(주문정보);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

