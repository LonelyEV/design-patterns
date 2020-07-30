package factory.lazy.initialization;

import oracle.jvm.hotspot.jfr.Producer;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: Phantom
 * @FileName: LazyInitializationTest
 * @Author: 屈志刚
 * @Date: 2020/7/30 3:59 下午
 * @Description:    延迟加载工厂模式测试类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class LazyInitializationTest {

    public static void main(String[] args) {
        AbstractProduct productA =  ProductFactory.createProduct("Aproduct");
        System.out.println(productA.toString());
        AbstractProduct productB =  ProductFactory.createProduct("Bproduct");
        System.out.println(productB.toString());
        AbstractProduct productA2 =  ProductFactory.createProduct("Aproduct");
        System.out.println(productA2.toString());
        AbstractProduct productB2 =  ProductFactory.createProduct("Bproduct");
        System.out.println(productB2.toString());
    }
}
