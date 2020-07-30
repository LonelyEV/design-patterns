package factory.simple;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: Phantom
 * @FileName: ConcreteCreator
 * @Author: 屈志刚
 * @Date: 2020/7/30 1:41 下午
 * @Description:    简单工厂类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class ConcreteCreator {

    public static <T extends AbstractProduct> T createProduct(Class<T> classz) {

        AbstractProduct product = null;

        try {
            product = (AbstractProduct) Class.forName(classz.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return (T) product;
    }
}
