package cn.publink.study.demo;

import cn.publink.study.demo.DO.UserDO;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<UserDO> getUserList(String name, Integer age) {
        if (StringUtils.isEmpty(name)) {
            throw new NullPointerException();
        }
        List<UserDO> list = new ArrayList<>();
        list.add(UserDO.builder().Id("1").age(age).name(name).build());
        list.add(UserDO.builder().Id("2").age(20).name("Tom").build());
        return list;
    }
}
