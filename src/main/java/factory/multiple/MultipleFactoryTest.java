package factory.multiple;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: MultipleFactory
 * @Author: 屈志刚
 * @Date: 2020/7/30 2:45 下午
 * @Description:    多工厂模式测试类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class MultipleFactoryTest {

    public static void main(String[] args) {

        Aproduct aproduct = (Aproduct) new Acreator().createProduct();
        aproduct.printProductName();

        Bproduct bproduct = (Bproduct) new Bcreator().createProduct();
        bproduct.printProductName();

    }
}
