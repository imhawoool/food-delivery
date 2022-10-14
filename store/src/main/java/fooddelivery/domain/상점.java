package fooddelivery.domain;

import fooddelivery.domain.주문접수됨;
import fooddelivery.domain.주문거절됨;
import fooddelivery.domain.요리완료됨;
import fooddelivery.domain.요리시작됨;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="상점_table")
@Data

public class 상점  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String options;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        주문접수됨 주문접수됨 = new 주문접수됨(this);
        주문접수됨.publishAfterCommit();



        주문거절됨 주문거절됨 = new 주문거절됨(this);
        주문거절됨.publishAfterCommit();



        요리완료됨 요리완료됨 = new 요리완료됨(this);
        요리완료됨.publishAfterCommit();



        요리시작됨 요리시작됨 = new 요리시작됨(this);
        요리시작됨.publishAfterCommit();

    }

    public static 상점Repository repository(){
        상점Repository 상점Repository = StoreApplication.applicationContext.getBean(상점Repository.class);
        return 상점Repository;
    }




    public static void 상태업데이트(결제됨 결제됨){

        /** Example 1:  new item 
        상점 상점 = new 상점();
        repository().save(상점);

        */

        /** Example 2:  finding and process
        
        repository().findById(결제됨.get???()).ifPresent(상점->{
            
            상점 // do something
            repository().save(상점);


         });
        */

        
    }
    public static void 주문내역복제(주문발생됨 주문발생됨){

        /** Example 1:  new item 
        상점 상점 = new 상점();
        repository().save(상점);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문발생됨.get???()).ifPresent(상점->{
            
            상점 // do something
            repository().save(상점);


         });
        */

        
    }


}
