package kr.miraesoft.miraebook.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class TagControllerTest {

	@Test
	public void TagController_객체_확인() {
		TagController tagController = new TagController();
		assertNotNull(tagController);
	}
	
	@Test
	public void TagController_태크_입력() {
		TagController tagController = new TagController();
		tagController.add();
		assertNotNull(tag)
	}
	
}
