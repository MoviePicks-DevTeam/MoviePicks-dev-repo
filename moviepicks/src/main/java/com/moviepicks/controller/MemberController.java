package com.moviepicks.controller;

import com.moviepicks.domain.Member;
import com.moviepicks.dto.MemberDTO;
import com.moviepicks.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/v1/member")
public class MemberController {

  private final Log log = LogFactory.getLog(MemberController.class);
  private final MemberService memberService;

  @PostMapping("/join")
  public String joinMember(
      @RequestParam(value = "member") Member member,
      HttpSession session){

    MemberDTO memberDTO = convertStringToMemberDTO(member);

    Long memberId = memberService.joinMember(memberDTO);
    log.debug("memberId = " + memberId + "@@@@@");
    memberDTO.setMemberId(memberId);
    log.debug("memberDTO = " + memberDTO + "@@@@@");

    session.setAttribute("memberDTO", memberDTO);

    return"home.html";
  }

  private MemberDTO convertStringToMemberDTO(Member member){
    MemberDTO memberDTO = new MemberDTO();

//    memberDTO.setMemberId(member.getMemberId());
    memberDTO.setNickname(member.getUsername());

    return memberDTO;

  }
}
