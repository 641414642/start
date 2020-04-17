package cn.publink.study.demo.DO;

import lombok.Builder;

/**
 * <p>用户DO</p>
 *
 * @author harry
 * @version 1.0.0
 * @email pangf@publink.cn
 * @date created in 2020/4/17 09:41
 * @project start
 * @package cn.publink.study.demo.DO
 * @Modified by
 */
@Builder
public class UserDO {

    /**
     * 主键
     */
    private String Id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    @Override
    public String toString() {
        return "UserDO{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
