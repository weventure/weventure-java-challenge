package ch.ebalance.foods.boundary;

import ch.ebalance.foods.entity.Food;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foods")
@Produces(MediaType.APPLICATION_JSON)
public class FoodResource {

    @Inject
    EntityManager entityManager;

    @GET
    public Food getFood() {
        throw new UnsupportedOperationException("Not implemented");
    }
}