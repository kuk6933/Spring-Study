package umc.study.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class MemberService {

    private MemberRepository memberRepository;

    public void join(Member member) { // C
        memberRepository.join(member);
    }

    public List<Member> findAll() { //R
        return memberRepository.findAll();
    }

    public void updateMember(Long id, Member member) {
        memberRepository.updateMember(id, member);
    }


    public void deleteMember(Long id) {
        memberRepository.deleteMember(id);
    }
}
