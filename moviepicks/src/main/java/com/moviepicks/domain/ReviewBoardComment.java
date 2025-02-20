package com.moviepicks.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "review_board_comment")
public class ReviewBoardComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "comment_id", nullable = false, updatable = false)
  private Long commentId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  // 리뷰 게시글이 없기 때문에 임시로 만듦
//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "review_board_id")
//  private ReviewBoardId reviewBoardId;

  @Column(name = "content", nullable = false)
  private String content;

  @Column(name = "create_date", nullable = false, updatable = false)
  private LocalDateTime createDate;

  public ReviewBoardComment(){
    this.createDate = LocalDateTime.now();
  }
}
