package factory.multiple;


/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: java-design-patterns
 * @FileName: Acreator
 * @Author: 屈志刚
 * @Date: 2020/7/30 2:42 下午
 * @Description:    工厂A类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Acreator extends AbstractCreator {

    @Override
    public AbstractProduct createProduct() {
        return new Aproduct();
    }
}
