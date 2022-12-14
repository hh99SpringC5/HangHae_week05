package springc5.advanced.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springc5.advanced.domain.Member;
import springc5.advanced.domain.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findAllByOrderByModifiedAtDesc();

    List<Post> findAllByMemberOrderByModifiedAtDesc(Member member);
}
