package factory.singleton;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: SingletonFactoryTest
 * @Author: 屈志刚
 * @Date: 2020/7/30 3:27 下午
 * @Description:    单例工厂测试类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class SingletonFactoryTest {

    public static void main(String[] args) {
        Singleton singleton = SingletonFactory.getSingleton();
        System.out.println(singleton);
    }
}
