package com.green.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
	private Long id;	//댓글 id
	private Long articleId; // article의 부모글 id
	private String nickname; // 닉네임
	private String body; // 댓글 내용
	
	// CommentDto <- Comments
}
