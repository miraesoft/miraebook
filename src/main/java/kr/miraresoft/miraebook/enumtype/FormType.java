package kr.miraresoft.miraebook.enumtype;

import java.util.HashMap;
import java.util.Map;

public enum FormType {
	PDF("PDF"), PAPER("종이");

	private String name;

	private FormType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Map<FormType, String> getMap() {
		HashMap<FormType, String> tempMap = new HashMap<FormType, String>();
		tempMap.put(PAPER, PAPER.name);
		tempMap.put(PDF, PDF.name);
		return tempMap;
	}
}
