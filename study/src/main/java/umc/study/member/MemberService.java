package umc.study.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void join(Member member) { // C
        memberRepository.save(member);
    }

    public Optional<Member> findMember(Long id) { //R
        return memberRepository.findById(id);
    }

    public void updateAddress(Long id, String address) {
        Optional<Member> tmpMember = memberRepository.findById(id);
        if(!tmpMember.isPresent()) {
            return;
        }
        Member member = tmpMember.get();
        member.setAddress(address);
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
