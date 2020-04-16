package cn.publink.study.demo;

import org.springframework.web.bind.annotation.GetMapping;

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
public interface InsideMockService {

    /**
     * 得到字符串（包含调用远程服务）
     *
     * @return 查询结果
     */
    String getString();
}
