package com.moviepicks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MemberDTO {
  private Long memberId;
  private String username;
}
