package cn.publink.study.demo;

import org.springframework.stereotype.Service;

/**
 * <p>SystemService的实现类</p>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/17 09:11
 * @project start
 * @package cn.publink.study.demo
 * @Modified by
 */

@Service
public class SystemServiceImpl implements SystemService {

    @Override
    public String makeUpSystemConsole(String param) {
        return "内部服务的业务：" + param;
    }
}
