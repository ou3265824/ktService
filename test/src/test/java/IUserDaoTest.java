import com.olq.service.dao.IUserDao;
import com.olq.service.model.UserBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Resource
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        UserBean user = dao.selectUser(id);
        System.out.println("用户："+user.getUsername()+"----"+user.getPassword());
    }

}
