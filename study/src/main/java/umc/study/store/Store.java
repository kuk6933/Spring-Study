package umc.study.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Store {

    @Id @GeneratedValue
    private Long id;
    private String store_name;
    private int minimum_amount;
    private int deliverty_fee;
    private String comment;
    private Double reputation;
    private int dibs_count;
    private String closed_day;
    private String address;
    private String registration_num;
    private String facility;
    private String guidance;
    private String phoneNumber;
}
