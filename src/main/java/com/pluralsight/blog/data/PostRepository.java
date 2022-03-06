package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.rest.core.annotation.RestResource;

public interface PostRepository extends JpaRepository<Post, Long> {
List<Post> findByTitleContaining(String title); 
}
