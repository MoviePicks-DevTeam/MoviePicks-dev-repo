package com.moviepicks.dto;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReviewBoardCommentDTO {
  private Long commentId;
  private Long memberId;
  private Long reviewBoardId;
  private String commentContent;
  private LocalDateTime commentCreateDate;

}
