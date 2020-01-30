import com.spw.service.UserService;
import com.spw.service.UserServiceImpl;

/**
 * @author spw
 * @create 2020-01-30 10:37
 */
public class Mytest {
    public static void main(String[] args) {
        //用户接触业务层，不接触dao
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }
}
