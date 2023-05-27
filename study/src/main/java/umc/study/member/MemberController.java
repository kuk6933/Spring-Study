package umc.study.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    private MemberService memberService;

    @PostMapping("/members/new")
    public void createMember(@RequestParam String memberName) {
        Member member = new Member();
        member.setName(memberName);
        memberService.join(member);
    }

    @GetMapping("/members/{id}") //R
    public Member findById(@PathVariable Long id) {
        return memberService.findAll();
    }

    @PutMapping("members/{id}")
    public void updateMember(@PathVariable Long id, @RequestBody Member member) {
        memberService.updateMember(id, member);
    }

    @DeleteMapping("members/{id}")
    public void deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
    }
}
