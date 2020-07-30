package factory.simple;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: SimpleFactoryTest
 * @Author: 屈志刚
 * @Date: 2020/7/30 2:28 下午
 * @Description:    简单工厂模式测试类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        AbstractProduct product = ConcreteCreator.createProduct(ConcreteProduct.class);
        product.printProductName();
    }
}
