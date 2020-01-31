import com.spw.dao.UserDaoImpl;
import com.spw.dao.UserDaoMysqlImpl;
import com.spw.service.UserService;
import com.spw.service.UserServiceImpl;

/**
 * @author spw
 * @create 2020-01-30 10:37
 */
public class Mytest {
    public static void main(String[] args) {
        //用户实际接触的是业务层，不接触dao
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());//这边通过预留的一个接口调用不同的dao
        userService.getUser();
    }
}
