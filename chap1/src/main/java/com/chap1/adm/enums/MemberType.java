package com.chap1.adm.enums;

import lombok.Getter;

@Getter
public enum MemberType{
	N("일반"),
    P("프리미어");

	private String value;

    MemberType(String value) {
        this.value = value;
    }

	public String getValue() { return value;	}

}