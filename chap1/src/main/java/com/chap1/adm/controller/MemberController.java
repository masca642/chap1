package com.chap1.adm.controller;

import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chap1.adm.domain.Member;
import com.chap1.adm.dto.MemberForm;
import com.chap1.adm.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//@Api(value = "회원가입, 회원관리", description = "회원가입 및 정보관리")
@RestController
@RequestMapping("api/members")
@RequiredArgsConstructor
@Transactional
@Slf4j
public class MemberController {
	//private final ModelMapper modelMapper;
	//private final MemberRepository memberRepository;
	//private final PasswordEncoder passwordEncoder;
	private static MemberRepository memberRepository;
	private static PasswordEncoder passwordEncoder;
	
	//@ApiOperation("ID 중복검색")
    @GetMapping("existsById/{id}")
    public boolean exists(@PathVariable("id") String id) {
        return memberRepository.existsById(id);
    }
    
    @PutMapping("/{id}/resetPassword")
    public void resetPassword(@PathVariable("id") String id) {
        //Member member = memberRepository.findById(id);
        //String birthday = member.getBirthday().toString().replace("-", "");
       // member.setPassword(passwordEncoder.encode(birthday));
       // memberRepository.save(member);
    }
    
    @PostMapping
    public String addMember(/*@Validated(InsertGroup.class)*/ MemberForm form) {
        /*return Optional.of(form)
                .filter(src -> !memberRepository.exists(src.getId()))
                .map(src -> modelMapper.map(src, Member.class))
                .map(memberRepository::save)
                .map(Member::getId)
                .orElseThrow(() -> new EntityExistsException("이미 존재하는 사용자입니다."));*/
        return "";
    }
}
