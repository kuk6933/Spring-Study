package umc.study.cart;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Cart {

    @Id @GeneratedValue
    private Long id;
    private Long delivery_fee;
    private Long store_id;
    private Long user_id;
    private Long price;
}
