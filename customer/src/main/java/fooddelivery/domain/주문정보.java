package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="주문정보_table")
@Data
public class 주문정보 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String status;


}