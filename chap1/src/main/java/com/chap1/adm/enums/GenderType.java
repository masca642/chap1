package com.chap1.adm.enums;

import lombok.Getter;

@Getter
public enum GenderType{
	M("남자"),
	F("여자");
	
	private String value;
	
	GenderType(String value){
		this.value = value;
	}
}
