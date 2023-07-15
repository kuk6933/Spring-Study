package sp5chap02.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sp5chap02.study.ChangePasswordService;
import sp5chap02.study.MemberDao;
import sp5chap02.study.MemberRegisterService;

public class MainForAssembler {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService regSvc = new MemberRegisterService(memberDao);
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }
}
