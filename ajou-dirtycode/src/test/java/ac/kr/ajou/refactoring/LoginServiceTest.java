package ac.kr.ajou.refactoring;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void login_유저아이디가_널이거나_엠티면false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login(null, "pwd");
        assertFalse(result);

        result = loginService.login("  ", "pwd");
        assertFalse(result);


    }

    @Test
    public void login_유저아이디가_하지만_패스워드가틀리면_false() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test1111", "pwd");
        assertFalse(result);

    }

    @Test
    public void login_유저아이디가_존재하고_패스워드가맞으면_true() {
        LoginService loginService = new LoginService();
        boolean result = loginService.login("test0", "test0");
        assertTrue(result);

    }

    @Test
    public void lgetUserNameById_user가없으면_null() {
        LoginService loginService = new LoginService();
        String result = loginService.getUserNameById(null);
        assertNull(result);

    }

    @Test
    public void getUserNameById_user가있으면_사용자반환() {
        LoginService loginService = new LoginService();
        String result = loginService.getUserNameById("test1");
        assertNotNull(result);

    }

    @Test
    public void getAge_모든_사용자를_반환() {
        LoginService loginService = new LoginService();
        List<Player> result = loginService.getAge(1);
        assertTrue(result.size() == 10);

    }


}
