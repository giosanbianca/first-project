import com.evozon.model.Cart;
import com.evozon.service.CartService;
import com.evozon.service.impl.CartServiceImpl;

public class Main {

    public static void main(String[] args) {
        CartService cartService = new CartServiceImpl();
        cartService.add("123");
        Cart cart = cartService.get();
        System.out.println(cart.getProducts().get(0).getId());
    }
}
