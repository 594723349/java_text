package heima.factory;

import heima.dao.UserDao;
import heima.dao.impl.UserDaoImpl;

public class  StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
