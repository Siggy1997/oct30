package com.siggy.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.siggy.web.dto.LoginDTO;
import com.siggy.web.service.LoginService;

@SpringBootTest
class Aug30ApplicationTests {

	//Junit = 자바에서 독립된 단위 테스트를 지원해주는 프레임워크
	//단정(assert) 메소드로 테스트 케이스의 수행결과를 판별한다.
	// jUnit4 이후부터는 테스트를 지원 어노테이션을 제공한다 (@test @before @after 등)
	// @Test 메소드가 호출할 때 마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어지게 한다
	
	
	@Autowired
	LoginService loginService;
	
	
	@Test
	void contextLoads() {
		//DTO에 값을 담아서 DB에 물어보면 정말 값이 와요?
		LoginDTO dto = new LoginDTO();
		dto.setM_id("siggy");
		dto.setM_pw("123456");
		
		LoginDTO result = loginService.login(dto);
		
		
		assertEquals(result.getM_name(), "시기");
	//	assertNotNull(result);
	//	assertSame(dto, result);
		
		
	}

}
