package umc.study.store;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;

    @GetMapping("store/{id}")
    public Optional<Store> findStore(@PathVariable Long id) {
        return storeService.findStore(id);
    }

    @PutMapping("store/{id}")
    public void updatePhoneNumber(@PathVariable Long id,@RequestParam String phoneNumber) {
        storeService.updatePhoneNumber(id, phoneNumber);
    }

}
