package com.liuzm.paascloud.dynamicDS.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liuzm.paascloud.dynamicDS.demo.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
