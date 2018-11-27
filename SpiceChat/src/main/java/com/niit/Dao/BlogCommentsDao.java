package com.niit.Dao;

import java.util.List;

import com.niit.models.BlogComment;

public interface BlogCommentsDao {
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getBlogComment(int blogPostId);
	void deleteBlogComment(BlogComment blogComment);
}