package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired // 생성자에 붙여주면 자동으로 의존관계 주입해줌 ac.getBean(MemberRepository.class)랑 비슷하게 동작함
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //인터페이스와 구현체에 의존. 즉 추상화에도 구체화에도 의존하는것 DIP위반
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    ///테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
