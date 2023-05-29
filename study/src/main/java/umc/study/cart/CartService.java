package umc.study.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

}
