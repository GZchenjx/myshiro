import com.jx.bean.Products;
import com.jx.service.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

/**
 * Created by CHEN JX on 2017/11/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-*.xml"})
public class ProductsDAOTest {

    @Autowired
    private ProductsService productsService;

    @Test
    public void add(){
        Products products = new Products();
        products.setName("香蕉");
        products.setPrice(BigDecimal.valueOf(9.9));
        productsService.add(products);
    }
}
