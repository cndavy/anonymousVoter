package pers.adlered.voter;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.adlered.voter.tool.GetDate;
import pers.adlered.voter.tool.MD5Utils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VoterApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Test
    public void testMd5() {
        System.out.println(MD5Utils.MD5("0asdfasdfwaefawefawefwef") );
        System.out.println(MD5Utils.MD2("0asdfasdfwaefawefawefwef"));
    }
    @Test
    public void testGetDate() {
        System.out.println(GetDate.year());
        System.out.println(GetDate.ymd());
    }
}
