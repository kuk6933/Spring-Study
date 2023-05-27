package umc.study.member;

import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberRepository {


    private static List<Member> members = new ArrayList<>();
    private static int usersCount = 0;

    public List<Member> findAll() {
        return members;
    }

    public Member join(Member member) {
        members.add(member);
        return member;
    }

    public void updateMember(Long id,Member member) {

    }

    public void deleteMember(Long id) {
        Iterator<Member> iterator = members.iterator();

        while(iterator.hasNext()) {
            Member member = iterator.next();

            if(member.getId() == id) {
                iterator.remove();
            }
        }
    }
}
