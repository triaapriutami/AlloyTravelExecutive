package mobile.skripsi.alloytravelexecutive.service;


/**
 *  * this class for example
 */
public class UserService extends BaseService<UserApi> {

    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }

        return instance;
    }

    public UserService() {
        setApi(UserApi.class);
    }
//
//    public Call<User> login(String username, String password) {
//        return getApi().login(ApiUrl.LOGIN_API, username, password);
//    }
}
