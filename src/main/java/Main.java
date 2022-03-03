import com.evozon.model.Cart;
import com.evozon.service.CartService;
import com.evozon.service.impl.CartServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
        CartService cartService =  context.getBean("cartService",CartServiceImpl.class);
        cartService.add("123");
        Cart cart = cartService.get();
        System.out.println(cart.getProducts().get(0).getId());
    }
}
