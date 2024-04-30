package com.green.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.green.entity.Comments;

public interface CommentRepository 
    extends JpaRepository<Comments, Long> {
	
	//@Query 어노테이션으로 findByArticleId()를 실행한다
	// Native Query Method - Oracle 전용 문법으로 작성된 query를 입력하여 조회
    // native = true : oracle 전용 함수 
	// native = false : JPA 함수
	// :articleId(파라미터)로 조회한다
	@Query(value="SELECT * FROM comments WHERE article_id=:articleId",
			nativeQuery = true)
	List<Comments> findByArticleId(Long articleId);
	
	// native query xml : src/main/resources/META-INF/orm.xml
	// orm.xml에 sql을 저장해서 findByNickname() 함수 호출
	List<Comments> findByNickname(String nickname);
	
}
