package com.example;

import com.example.member.Member;
import com.example.member.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaStudyApplication.class)
@WebAppConfiguration
public class JpaStudyApplicationTests {


	@Autowired
	private MemberRepository memberRepository;

	@Test
	public void contextLoads() {

		Member m = memberRepository.findOne("test1");

		System.out.println(m.getPassword());
		System.out.println(m.getTeam());
	}

}
