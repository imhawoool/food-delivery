package fooddelivery.domain;

import fooddelivery.domain.주문발생됨;
import fooddelivery.domain.주문취소됨;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문_table")
@Data

public class 주문  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        주문발생됨 주문발생됨 = new 주문발생됨(this);
        주문발생됨.publishAfterCommit();



        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();

    }

    public static 주문Repository repository(){
        주문Repository 주문Repository = FrontApplication.applicationContext.getBean(주문Repository.class);
        return 주문Repository;
    }






}
