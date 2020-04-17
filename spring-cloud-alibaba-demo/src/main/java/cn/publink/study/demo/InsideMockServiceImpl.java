package cn.publink.study.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>功能描述</p>
 * <li>功能1</li>
 * <li>功能2</li>
 * <li>功能3</li>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/15 19:47
 * @project start
 * @package cn.publink.study.demo
 * @Modified by
 */
@Service
public class InsideMockServiceImpl implements InsideMockService {

    @Resource
    private MockService mockService;

    @Autowired
    SystemService systemService;

    public void MockService(MockService mockService) {
        this.mockService = mockService;

    }

    @Override
    public String getString() {
        System.out.println(systemService.makeUpSystemConsole("本地服务"));
        System.out.println(mockService.getListStr());
        System.out.println("本地服务结束");
        return "123";
    }
}
