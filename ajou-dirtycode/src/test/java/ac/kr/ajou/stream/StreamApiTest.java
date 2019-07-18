package ac.kr.ajou.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StreamApiTest {

    @Test
    public void filterString테스트(){
        StreamApi streamApi = new StreamApi();
        List<String> testStringList = new ArrayList<>();
        testStringList.add("a");
        testStringList.add("b");
        testStringList.add("b");
        testStringList.add("c");
        testStringList.add("c");


        List<String> result = streamApi.filterString(testStringList,"c");
        assertTrue(result.size() == 2);
        assertTrue(result.get(0).equals("c"));
        assertTrue(result.get(1).equals("c"));
    }
}
