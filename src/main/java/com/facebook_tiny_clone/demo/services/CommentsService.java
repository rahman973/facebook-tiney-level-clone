package com.facebook_tiny_clone.demo.services;

import com.facebook_tiny_clone.demo.model.Comments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentsService {
    List<Comments> findAll();

    Comments findById(Long postId);

    Comments save(Comments post);

    Comments update(Long postId, Comments post);

    void delete(Long postId);
}
