package factory.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: SingletonFactory
 * @Author: 屈志刚
 * @Date: 2020/7/30 3:21 下午
 * @Description:    单例工厂类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {

        try {
            Class classz = Class.forName(Singleton.class.getName());
            /** 调用无参构造器*/
            Constructor constructor = classz.getDeclaredConstructor();
            /** 设置无参构造器是可访问的*/
            constructor.setAccessible(true);
            /** 产生一个对象*/
            singleton = (Singleton) constructor.newInstance();


        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    /**
     * 功能描述: <br>
     * 〈获取一个Singleton对象〉
     *
     * @param
     * @return:
     * @throws:
     * @Version: 1.0.0
     * @Author: 屈志刚
     * @Date: 3:31 下午 2020/7/30
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}
