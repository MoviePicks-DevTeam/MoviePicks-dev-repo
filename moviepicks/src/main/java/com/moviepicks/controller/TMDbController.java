package com.moviepicks.controller;

import com.moviepicks.domain.Member;
import com.moviepicks.dto.MemberDTO;
import com.moviepicks.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/v1/tmdb")
public class TMDbController {
  private final Log log = LogFactory.getLog(TMDbController.class);

  @GetMapping("/list")
  public String joinMember(){

    // TMDb api에서 영화 리스트 코드

    return"home.html";
  }

}
