package fooddelivery.domain;

import fooddelivery.domain.배달건픽됨;
import fooddelivery.domain.배달완료됨;
import fooddelivery.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="배달_table")
@Data

public class 배달  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        배달건픽됨 배달건픽됨 = new 배달건픽됨(this);
        배달건픽됨.publishAfterCommit();



        배달완료됨 배달완료됨 = new 배달완료됨(this);
        배달완료됨.publishAfterCommit();

    }

    public static 배달Repository repository(){
        배달Repository 배달Repository = DeliveryApplication.applicationContext.getBean(배달Repository.class);
        return 배달Repository;
    }




    public static void 배달내역복제(주문발생됨 주문발생됨){

        /** Example 1:  new item 
        배달 배달 = new 배달();
        repository().save(배달);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문발생됨.get???()).ifPresent(배달->{
            
            배달 // do something
            repository().save(배달);


         });
        */

        
    }
    public static void 상태업데이트(요리완료됨 요리완료됨){

        /** Example 1:  new item 
        배달 배달 = new 배달();
        repository().save(배달);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리완료됨.get???()).ifPresent(배달->{
            
            배달 // do something
            repository().save(배달);


         });
        */

        
    }


}
