import com.evozon.config.AppConfig;
import com.evozon.model.Cart;
import com.evozon.service.CartService;
import com.evozon.service.impl.CartServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        CartService cartService = context.getBean(CartServiceImpl.class);
        cartService.add("123");
        Cart cart = cartService.get();
        System.out.println(cart.getProducts().get(0).getId());
    }
}
