package com.test.team;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//junit 5(Jupiter)
@SpringBootTest
public class TestRepositoryTests {

	@Autowired
	private TestRepository repo;
	
	@DisplayName("숫자테스트")
	@Test //지정자 생략 권장
	void testNum() {
		assertEquals(100, repo.num());
	}
	
	

}
