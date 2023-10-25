package voinlist.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import voinlist.domain.*;

@Component
public class InListHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<InList>> {

    @Override
    public EntityModel<InList> process(EntityModel<InList> model) {
        return model;
    }
}
