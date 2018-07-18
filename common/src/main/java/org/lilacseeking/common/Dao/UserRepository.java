package org.lilacseeking.common.Dao;

import org.lilacseeking.common.Model.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserPO,Long>{
    List<UserPO> findByName(String name);

}
