package cn.publink.study.demo;

import cn.publink.study.demo.DO.UserDO;

import java.util.List;

/**
 * <p>内部服务</p>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/17 09:08
 * @project start
 * @package cn.publink.study.demo
 * @Modified by
 */
public interface SystemService {

    /**
     * 构建输出内容
     *
     * @param param
     * @return java.lang.String
     * @throws
     * @author harry
     * @date 2020/4/17 09:10
     */
    String makeUpSystemConsole(String param);

    /**
     * 获取用户集合
     *
     * @param name
     * @param age
     * @return java.util.List<cn.publink.study.demo.DO.UserDO>
     * @throws
     * @author harry
     * @date 2020/4/17 09:44
     */
    List<UserDO> getUserList(String name, Integer age);
}
