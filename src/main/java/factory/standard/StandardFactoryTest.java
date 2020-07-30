package factory.standard;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: Phantom
 * @FileName: StandardFactoryTest
 * @Author: 屈志刚
 * @Date: 2020/7/30 1:49 下午
 * @Description:    通用工厂模式测试类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class StandardFactoryTest {

    public static void main(String[] args) {

        /** 初始化工厂类*/
        AbstractCreator creator = new ConcreteCreator();

        /** 根据工厂类产生产品*/
        AbstractProduct producer = creator.createProduct(ConcreteProduct.class);
        producer.printProductName();
    }
}
