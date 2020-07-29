package com.example.jpalive.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpalive.Repository.MemberRepository;
import com.example.jpalive.domain.Member;

@SpringBootTest
class MemberServiceTest {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	MemberService memberService;
	
	@Test
	void testJoin() {
		//given
		Member member = new Member();
		member.setName("khkim");
		
		//when
		Long id = memberService.join(member);
		
		//then
		assertEquals(member, memberRepository.findOne(id));
	}

	@Test
	void testFindMembers() {
		fail("Not yet implemented");
	}

	@Test
	void testFindOne() {
		fail("Not yet implemented");
	}

}
