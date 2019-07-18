package ac.kr.ajou.longmethod;

import org.junit.Test;


public class LongMethodTest {
    public static final String CORRECT_SOCIAL_STRING = "abcdef";


    @Test
    public void dosomeThing_소셜스트링이_8자리이면_에러(){
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething("11111111","ab" ,"!111");
    }

    @Test(expected = RuntimeException.class)
    public void dosomeThing_소셜스트링이_6자리이고_숫자가있으면_에러(){
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething(CORRECT_SOCIAL_STRING,"2ab" ,"!111");
    }

    @Test(expected = RuntimeException.class)
    public void dosomeThing_이름이_5자리_이상이면_에러(){
        LongMethod longMethod = new LongMethod();
        boolean result = longMethod.doSomething(CORRECT_SOCIAL_STRING,"dddddd" ,"!111");
    }

}
