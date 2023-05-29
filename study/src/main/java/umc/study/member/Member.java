package umc.study.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String login_id;
    private String login_pw;
    private String phone_number;
    private String email;
    private int grade;
    private int order_count;
    private String name;
}
