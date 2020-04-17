package cn.publink.study.demo;

import org.springframework.cloud.openfeign.FeignClient;
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
     * @param
     * @return java.lang.String
     * @throws
     * @author harry
     * @date 2020/4/17 11:05
     */
    @GetMapping("/a")
    String getString();

    /**
     * 得到ListStr
     *
     * @param
     * @return java.lang.String
     * @throws
     * @author harry
     * @date 2020/4/17 11:05
     */
    @GetMapping("/b")
    String getListStr();


}
