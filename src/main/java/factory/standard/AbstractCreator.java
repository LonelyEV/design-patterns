package factory.standard;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: Creator
 * @Author: 屈志刚
 * @Date: 2020/7/30 1:38 下午
 * @Description:    抽象工厂类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public abstract class AbstractCreator {


    /**
     * 功能描述: <br>
     * 〈生产产品〉
     *
     * @param classz 待生产的产品类名
     * @return:
     * @throws:
     * @Version: 1.0.0
     * @Author: 屈志刚
     * @Date: 1:47 下午 2020/7/30
     */
    public abstract <T extends AbstractProduct> T createProduct(Class<T> classz);
}
