package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class 주문 {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String storeId;
}


