package factory.standard;

import java.io.Serializable;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: Phantom
 * @FileName: ConcreteProduct1
 * @Author: 屈志刚
 * @Date: 2020/7/30 1:34 下午
 * @Description:    具体产品类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class ConcreteProduct extends AbstractProduct implements Serializable {

    private static final long serialVersionUID = -4322693556608898413L;


    public ConcreteProduct() {
    }

    @Override
    public void printProductName() {
        System.out.println("ConcreteProduct name is : Aproduct");
    }
}
