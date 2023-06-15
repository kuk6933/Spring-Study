package umc.study.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("members/new")
    public void createMember(@RequestBody Member member) {

        memberService.join(member);
    }


    @PatchMapping("members/{id}")
    public void updateAddress(@PathVariable("id")Long id, @RequestParam String address) {
        memberService.updateAddress(id, address);
    }

    @GetMapping("members/{id}") //R
    public Optional<Member> findById(@PathVariable("id") Long id) {
        return memberService.findMember(id);
    }


    @DeleteMapping("members/{id}")
    public void deleteMember(@PathVariable("id") Long id) {
        memberService.deleteMember(id);
    }

    @PostMapping("members/{id}/orderCount")
    public void addOrderCount(@PathVariable("id") Long id, @RequestParam int count) {
        memberService.addOrderCount(id, count);
    }
}
