package com.chap1.adm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.chap1.adm.enums.GenderType;
import com.chap1.adm.enums.MemberType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor  //기본 생성자 자동 추가(..?)
@DiscriminatorValue("MEMBER")  // 엔티티 저장 시 구분 컬럼에 입력할 값을 지정(..?)
public class Member {
	@Id
	private String id;
	private String name;
	
	@Column(nullable = false)
	private String password;
	
	private String phoneNo;
	private Boolean enabled;

	@Temporal(TemporalType.DATE) 
	private Date birthday; // 생년월일
	
	@Enumerated(EnumType.STRING) 
	private MemberType memberType; // 회원분류
    
	@Enumerated(EnumType.STRING) 
    private GenderType genderType; // 성별
	
	@CreationTimestamp  // 데이터 입력시 자동으로 오늘날짜 들어감
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, updatable=false) //데이터 수정시 자동 업데이트 false
	private Date insertDate;
	
}