package cn.publink.study.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Mock测试（内部Service调用外部Service）</p>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/15 19:25
 * @project start
 * @package cn.publink.study.demo
 * @Modified by
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockTest {

    @Autowired
    InsideMockService insideMockService;

    @MockBean
    MockService mockService;


   /**
    * 方法功能说明
    * @param
    * @author      harry
    * @date       2020/4/17 09:36
    * @exception
    * @return     void
    */
    @Before
    public void beforeTest() {
        Mockito.when(mockService.getListStr()).thenReturn("Mock外部服务的返回值");
    }

    /**
     * 单测方法
     *
     * @param
     * @return void
     * @throws
     * @author harry
     * @date 2020/4/16 09:04
     */
    @Test
    public void mockTest() {
        insideMockService.getString();
    }
}
