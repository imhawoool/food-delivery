package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 환불 extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public 환불(결제 aggregate){
        super(aggregate);
    }
    public 환불(){
        super();
    }
}
