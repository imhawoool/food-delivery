package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 배달건픽됨 extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;
    private String address;
    private String storeId;
}


