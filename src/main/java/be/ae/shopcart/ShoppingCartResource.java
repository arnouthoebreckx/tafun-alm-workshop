package be.ae.shopcart;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/shoppingcart")
public class ShoppingCartResource {

    @Inject
    Logger log;
    @ConfigProperty(name = "price.btw")
    double priceBtw;

    public List<ShoppingCartItem> items = new ArrayList<>();

    public ShoppingCartResource() {
        items.add(new ShoppingCartItem("apple", 0.75));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ShoppingCartItem> getShoppingCart() {
        return items;
    }

    @POST
    public void postShoppingCart(ShoppingCartItem item) {
        log.debug("Item added: " + item.toString());
        item.setPrice(item.getPrice() * (1+priceBtw));
        items.add(item);
    }
}
