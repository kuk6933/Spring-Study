package umc.study.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void join(Member member) { // C
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member) {
        Optional<Member> findMembers = memberRepository.findById(member.getId());
        if(!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다");
        }
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

    public void addOrderCount(Long id, int count) {
        Optional<Member> tmpMember = findMember(id);
        if(!tmpMember.isPresent()) {
            return;
        }
        Member member = tmpMember.get();
        member.setOrderCount(member.getOrderCount()+count);
        if(member.getOrderCount()> 10) {
            member.setGrade(2);
        } else if(member.getOrderCount() > 20) {
            member.setGrade(3);
        }
    }
}
