package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배달건픽됨 extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String address;
    private String storeId;

    public 배달건픽됨(배달 aggregate){
        super(aggregate);
    }
    public 배달건픽됨(){
        super();
    }
}
