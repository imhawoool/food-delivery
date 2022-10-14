package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 주문접수됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String status;
    private String orderId;
    private String address;
    private String options;
    private String storeId;
import lombok.Data;
}


