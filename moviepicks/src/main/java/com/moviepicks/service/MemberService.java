package com.moviepicks.service;

import com.moviepicks.domain.Member;
import com.moviepicks.dto.MemberDTO;
import com.moviepicks.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

  MemberRepository memberRepository;

  @Transactional
  public Long joinMember(MemberDTO memberDTO){

    Member member = Member.builder().username(memberDTO.getUsername()).
        email(memberDTO.getEmail()).
        password(memberDTO.getPassword()).
        build();

    return memberRepository.save(member);
  }

}
