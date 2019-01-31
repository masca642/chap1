package com.chap1.adm.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.chap1.adm.enums.GenderType;
import com.chap1.adm.enums.MemberType;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {
	//@NotNull(groups = {InsertGroup.class}, message = "아이디를 입력하세요")
    //@Pattern(groups = {InsertGroup.class}, regexp = "^[a-zA-Z0-9]*$", message = "아이디는 영문, 숫자의 조합으로 만들어야 합니다.")
    //@Size(groups = {InsertGroup.class}, min = 6, max = 12, message = "아이디는 {min}~{max}자로 구성할 수 있습니다.")
    private String id;
	
	//@NotEmpty(groups = {InsertGroup.class}, message = "이름을 입력하세요.")
	private String name;

	//@NotEmpty(groups = {InsertGroup.class}, message = "비밀번호를 입력하세요.")
    //@Size(groups = {InsertGroup.class, UpdateGroup.class}, min = 6, max = 20, message = "비밀번호는 {min}~{max}의 길이로 입력하세요.")
    //@Pattern(groups = {InsertGroup.class, UpdateGroup.class}, regexp = "^[a-zA-Z0-9]*$", message = "비밀번호는 영문, 숫자의 조합으로 만들어야 합니다.")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
	
	//@NotEmpty(groups = {InsertGroup.class}, message = "폰번호를 입력하세요.")
    //@Pattern(regexp = "^01([0|1|6|7|8|9]?)-\\d{3,4}-\\d{4}$", groups = {InsertGroup.class, UpdateGroup.class}, message = "폰번호 형식이 일치하지 않습니다.")
    private String phoneNo;
	
	//@NotEmpty(groups = {InsertGroup.class}, message = "생년월일을 입력하세요.")
    //@Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", groups = {InsertGroup.class, UpdateGroup.class}, message = "생년월일을 입력하세요.")
    private String birthday;
	
	private MemberType memberType;
	
	//@NotNull(groups = {InsertGroup.class}, message = "성별을 선택하세요.")
    private GenderType genderType;
	
	
	
}
