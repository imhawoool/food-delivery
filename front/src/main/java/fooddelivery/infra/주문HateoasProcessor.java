package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 주문HateoasProcessor implements RepresentationModelProcessor<EntityModel<주문>>  {

    @Override
    public EntityModel<주문> process(EntityModel<주문> model) {

        
        return model;
    }
    
}
