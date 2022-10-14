package fooddelivery.domain;

import fooddelivery.domain.결제됨;
import fooddelivery.domain.환불;
import fooddelivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="결제_table")
@Data

public class 결제  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        결제됨 결제됨 = new 결제됨(this);
        결제됨.publishAfterCommit();



        환불 환불 = new 환불(this);
        환불.publishAfterCommit();

    }

    public static 결제Repository repository(){
        결제Repository 결제Repository = FrontApplication.applicationContext.getBean(결제Repository.class);
        return 결제Repository;
    }




    public static void 결제(주문발생됨 주문발생됨){

        /** Example 1:  new item 
        결제 결제 = new 결제();
        repository().save(결제);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문발생됨.get???()).ifPresent(결제->{
            
            결제 // do something
            repository().save(결제);


         });
        */

        
    }


}
