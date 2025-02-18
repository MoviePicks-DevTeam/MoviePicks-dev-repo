package com.moviepicks.dto;

import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MemberDTO {
  private Long memberId;
  private String username;
  private String email;
  private String password;
  private String provider; // 소셜 로그인 제공자
}
