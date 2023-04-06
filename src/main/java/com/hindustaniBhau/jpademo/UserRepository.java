package com.hindustaniBhau.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // it has made interface not class to use /extend JPA repositoty as JPA is an interface
// JpaRepository<User,Integer> - < tableName , datatype of the primary key(wrapperClass)>
// why interface not class ------ because if we make it a class then we have the responsibility to implement the jpaRepository
// but that not our reponsibility and we won't be allowed to that in spring. however ORM framework(Hibenate) has the responsibilty
// to implement and that's why we make it interface not class.
}
