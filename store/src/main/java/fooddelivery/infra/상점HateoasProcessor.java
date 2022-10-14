package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 상점HateoasProcessor implements RepresentationModelProcessor<EntityModel<상점>>  {

    @Override
    public EntityModel<상점> process(EntityModel<상점> model) {

        
        return model;
    }
    
}
