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
import java.time.LocalDateTime;
import lombok.Data;


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
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "review_board_id")
  private ReviewBoard reviewBoardId;

  @Column(name = "comment_content", nullable = false)
  private String commentContent;

  @Column(name = "comment_create_date", nullable = false, updatable = false)
  private LocalDateTime commentCreateDate;

  public ReviewBoardComment(){
    this.commentCreateDate = LocalDateTime.now();
  }
}
