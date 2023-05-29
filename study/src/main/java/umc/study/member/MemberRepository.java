package umc.study.member;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findMember(Long id) {
        return em.find(Member.class, id);
    }

    public Member updateMember(Long id, String newName) {
        return em.find(Member.class, id);
    }

    public void deleteMember(Long id) {
        em.remove(em.find(Member.class, id));
    }
}
