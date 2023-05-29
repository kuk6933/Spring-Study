package umc.study.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public Optional<Store> findStore(Long id) {
        return storeRepository.findById(id);
    }

    public void updatePhoneNumber(Long id, String phoneNumber) {
        Optional<Store> tmpStore = storeRepository.findById(id);
        if(!tmpStore.isPresent()) return;
        Store store = tmpStore.get();
        store.setPhoneNumber(phoneNumber);
    }
}
