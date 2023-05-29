//package jpabook.jpashop;
//
//import jpabook.jpashop.domain.Member;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MemberRepositoryTest {
//
//    @Autowired MemberRepository memberRepository;
//
//    @Test
//    @Transactional //entity manager를 통한 모든 데이터변경은 한상 Transacational 안에서 일어나야함
//    public void testMember() throws Exception {
//        //given
//        Member member = new Member();
//        member.setName("memberA");
//
//        //when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//
//        //then
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getUserName()).isEqualTo(member.getUserName());
//        Assertions.assertThat(findMember).isEqualTo(member); //영속성 entity에서 식별자가 같으면 같은 객체임
//
//    }
//}