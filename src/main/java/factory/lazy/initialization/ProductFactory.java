package factory.lazy.initialization;

import java.util.HashMap;
import java.util.Map;

/**
 * @Copyright (C), 2018, 上海金皿计算机科技有限公司
 * @ProjectName: Phantom
 * @FileName: ProductFactory
 * @Author: 屈志刚
 * @Date: 2020/7/30 3:43 下午
 * @Description:    延迟加载工厂类
 * @email ==>> quzhigang@midaigroup.com | jing9241120@sina.com
 * @History: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class ProductFactory {

    private static final Map<String, AbstractProduct> PRODUCT_MAP = new HashMap<>();

    public static synchronized AbstractProduct createProduct(String type) {

        AbstractProduct product = null;

        if (PRODUCT_MAP.containsKey(type)) {
            return PRODUCT_MAP.get(type);
        }

        try {
            switch (type) {
                case "Aproduct":
                    product = new Aproduct();
                    break;
                case "Bproduct":
                    product = new Bproduct();
                    break;
                default:
            }
            PRODUCT_MAP.put(type, product);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return product;
    }


}
