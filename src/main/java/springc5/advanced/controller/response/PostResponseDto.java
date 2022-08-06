package springc5.advanced.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springc5.advanced.domain.Comment;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {
  private Long id;
  private String title;
  private String content;
  private String imgUrl;
  private String author;
  private Long likes;
  private List<CommentResponseDto> comments;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;
}