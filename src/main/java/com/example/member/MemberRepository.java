package com.example.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mac on 2016. 4. 6..
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}

