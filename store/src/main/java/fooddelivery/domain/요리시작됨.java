package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 요리시작됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String status;
    private String orderId;
    private String address;
    private String options;
    private String storeId;

    public 요리시작됨(상점 aggregate){
        super(aggregate);
    }
    public 요리시작됨(){
        super();
    }
}
