package cn.publink.study.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>内部服务调用Cloud服务</p>
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

    @Override
    public String getString() {
        System.out.println(systemService.makeUpSystemConsole("本地服务"));
        System.out.println(mockService.getListStr());
        System.out.println(systemService.getUserList(mockService.getListStr(), 18));
        System.out.println("本地服务结束");
        return "123";
    }

}
