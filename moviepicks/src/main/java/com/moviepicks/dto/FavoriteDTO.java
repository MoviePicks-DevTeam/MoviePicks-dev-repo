package com.moviepicks.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@Data
public class FavoriteDTO {
  private Long favoriteId;
  private Long memberId;
  private Long movieId;

}
