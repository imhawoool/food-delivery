package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문발생됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String options;
    private String address;
    private List<String> options;
    private String storeId;

    public 주문발생됨(주문 aggregate){
        super(aggregate);
    }
    public 주문발생됨(){
        super();
    }
}
