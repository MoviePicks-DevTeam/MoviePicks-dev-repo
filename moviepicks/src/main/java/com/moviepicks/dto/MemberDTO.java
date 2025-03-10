package com.moviepicks.dto;

import com.moviepicks.status.MemberStatus;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@NoArgsConstructor
@Data
public class MemberDTO {
  private Long memberId;
  private String nickname;
  private String email;
  private String password;
  private MemberStatus status;
  private LocalDateTime memberCreateDate;
//  private String provider; // 소셜 로그인 제공자
}
