package com.test.team;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

		public Integer num() {
			
			//올바른 결과 : 100
			return 100;
			//실패 결과: 200
			//return 200;
			
		}

}
