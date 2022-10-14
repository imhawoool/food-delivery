package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class 주문발생됨 extends AbstractEvent {

    private Long id;
    private String foodId;
    private String options;
    private String address;
    private List<String> options;
    private String storeId;
}
