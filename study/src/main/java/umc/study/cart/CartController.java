package umc.study.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @DeleteMapping("card/{id}")
    private void deleteCart(@PathVariable Long id)
    {
        cartService.deleteCart(id);
    }
}
