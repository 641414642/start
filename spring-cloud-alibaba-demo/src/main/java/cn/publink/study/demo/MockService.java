package cn.publink.study.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>Cloud服务</p>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/15 19:36
 * @project start
 * @package cn.publink.study.demo
 * @Modified by
 */
@FeignClient(name = "outside/service")
public interface MockService {

    /**
     * 得到字符串
     *
     * @return 查询结果
     */
    @GetMapping("/a")
    String getString();

    /**
     * 得到ListStr
     *
     * @return 查询结果
     */
    @GetMapping("/b")
    String getListStr();


}
