package cn.massz.dao;

import cn.massz.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 用户持久层接口
 */
@Repository("userDao")
public interface UserDao extends JpaRepository<User,Integer> {

}
