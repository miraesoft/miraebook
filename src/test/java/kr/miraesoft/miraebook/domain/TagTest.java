package kr.miraesoft.miraebook.domain;

import static org.junit.Assert.*;
import kr.miraesoft.miraebook.domain.Tag;

import org.junit.Test;

/*
 * 아래와 같은 테스트를 계획합니다.
 * Tag 객체 확인
 * Tag Insert
 * Tag Select
 * Tag Update
 * Tag Delete
 */

public class TagTest {
	
	@Test
	public void Tag객체_확인() {
		Tag tag = new Tag();
		assertNotNull(tag);
	}
	
	@Test
	public void Tag_입력() {
		
	}

}
