package umc.study.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String login_id;
    @NotNull
    private String login_pw;
    @NotNull
    private String phone_number;
    @Email
    private String email;
    @Positive
    private int grade;
    @PositiveOrZero
    private int order_count;
    @NotNull
    private String name;
    @NotNull
    private String address;
}
