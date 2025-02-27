package com.moviepicks.dto;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReviewBoardDTO {
  private Long reviewBoardId;
  private Long memberId;
  private String title;
  private String content;
  private int point;
  private LocalDateTime boardCreateDate;
}
