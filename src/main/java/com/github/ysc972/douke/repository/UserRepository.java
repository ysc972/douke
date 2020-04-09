package com.github.ysc972.douke.repository;

import com.github.ysc972.douke.model.DkUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * @author 袁士成
 * @version 1.0
 * @title
 * @description
 * @company 好未来-爱智康
 * @mobile 15127765662
 * @created 2020/1/14 11:33 上午
 * @changeRecord
 */
@Repository
public interface UserRepository extends JpaRepository<DkUser, Long> {


    @Query("from DkUser u where u.phone =:phone ")
    DkUser findUserByPhone(@Param("phone") String phone);

}
