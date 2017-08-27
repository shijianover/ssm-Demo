package com.shijian.library.dao;

        import com.shijian.library.entity.User;

        import java.util.List;

public interface UserDao {
    public User findById(String uid) ;
    public List<User> findAllUser();
}
