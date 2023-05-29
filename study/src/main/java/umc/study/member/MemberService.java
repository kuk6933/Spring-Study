package umc.study.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void join(Member member) { // C
        memberRepository.save(member);
    }

    public Member findMember(Long id) { //R
        return memberRepository.findMember(id);
    }

    public void updateMember(Long id, String name) {
        memberRepository.updateMember(id, name);
    }


    public void deleteMember(Long id) {
        memberRepository.deleteMember(id);
    }
}
