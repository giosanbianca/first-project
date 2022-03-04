import com.evozon.AppConfig;
import com.evozon.model.Cart;
import com.evozon.repository.impl.CartRepositoryImpl;
import com.evozon.service.CartService;
import com.evozon.service.impl.CartServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

import javax.naming.Context;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean(CartServiceImpl.class);
        System.out.println(cart.getProducts().get(0).getId());
    }
}
