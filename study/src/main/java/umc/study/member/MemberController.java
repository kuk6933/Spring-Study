package umc.study.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("members/new")
    public void createMember(@RequestBody Member member) {
        memberService.join(member);
    }

    @PatchMapping("memners/{id}")
    public void updateAddress(@PathVariable Long id, @RequestParam String address) {
        memberService.updateAddress(id, address);
    }

    @GetMapping("members/{id}") //R
    public Optional<Member> findById(@PathVariable Long id) {
        return memberService.findMember(id);
    }


    @DeleteMapping("members/{id}")
    public void deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
    }
}
