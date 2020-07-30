package factory.multiple;

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
     * 〈创建产品方法〉
     *
     * @param
     * @return:
     * @throws:
     * @Version: 1.0.0
     * @Author: 屈志刚
     * @Date: 2:42 下午 2020/7/30
     */
    public abstract AbstractProduct createProduct();
}
