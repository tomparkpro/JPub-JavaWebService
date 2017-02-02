package serviceTest;

import info.thecodinglive.config.ServiceConfig;
import info.thecodinglive.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by jins on 2017-01-30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class, loader = AnnotationConfigContextLoader.class)
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void findUserList(){
        userService.findAllUserInfo();
    }
}
