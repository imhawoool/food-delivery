package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 결제HateoasProcessor implements RepresentationModelProcessor<EntityModel<결제>>  {

    @Override
    public EntityModel<결제> process(EntityModel<결제> model) {

        
        return model;
    }
    
}
