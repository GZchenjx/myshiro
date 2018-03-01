import com.jx.bean.User;
import com.jx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by CHEN JX on 2017/11/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-*.xml"})
public class UserDAOTest {

    @Autowired
    private UserService userService;

    @Test
    public void add(){
        User user = new User();
        user.setName("哈哈");
        user.setPassword("123");
        user.setRealName("asd");
        user.setSex(1);
        userService.add(user);
    }
}
