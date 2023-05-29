//package jpabook.jpashop;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jpabook.jpashop.domain.Member;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class MemberRepository {
//
//    @PersistenceContext // entity manager주업해줌
//    private EntityManager em;
//
//    public Long save(Member member) {
//        em.persist(member);
//        return member.getId(); //id정도만 조회하도록 함
//    }
//
//    public Member find(Long id) {
//        return em.find(Member.class, id);
//    }
//}
