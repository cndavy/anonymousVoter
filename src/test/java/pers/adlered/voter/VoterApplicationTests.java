package pers.adlered.voter;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pers.adlered.voter.domain.demo;
import pers.adlered.voter.tool.GetDate;
import pers.adlered.voter.tool.MD5Utils;
import pers.adlered.voter.tool.Ten2ThirtySix;

import java.net.URL;
import java.util.UUID;

import static java.lang.Math.abs;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = VoterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VoterApplicationTests {
    Logger logger=LoggerFactory.getLogger(getClass());
    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private MockMvc mvc;
    @Autowired
    demo demo;


   // @Before
    public void setUp() throws Exception {
        String url = String.format("http://localhost:%d/", port);
        System.out.println(String.format("port is : [%d]", port));
        this.base = new URL(url);
    }
    @Test
    public void test1() throws Exception {

        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/showVote/6", String.class, "");
        System.out.println(String.format("测试结果为：%s", response.getBody()));
    }
    @Test
    public void test2() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/showVote/6"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    @Test
    public void contextLoads() {
        logger.debug(this.demo.toString());
        logger.trace(this.demo.toString());
        logger.info(this.demo.toString());
        logger.error(this.demo.toString());
        logger.warn(this.demo.toString());

      //  System.out.println(this.demo.toString());
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
    @Test
    public void testHashcode() {
        for (int i=0 ;i<10;i++ ) {
            UUID uuid = UUID.randomUUID();
            int code = uuid.hashCode();
            code=abs(code);
            System.out.println(Ten2ThirtySix.DeciamlToThirtySix(code));
        }
    }
}
