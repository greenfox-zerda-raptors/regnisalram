package com.greenfox.regnisalram.reddit.services;

import com.greenfox.regnisalram.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by regnisalram on 1/5/17.
 */
@Service
public class PostService {

    private final PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Page<Post> list(int page, int count) {
        return repository.findAllByOrderByScoreDesc(new PageRequest(page, count));
    }

    public void create(String title, String message) {
        repository.save(new Post(title, message));
    }

    public void upvote(long id){
        Post post = repository.findOne(id);
        post.setScore(post.getScore()+1);
        repository.save(post);
    }

    public void downvote(long id){
        Post post = repository.findOne(id);
        post.setScore(post.getScore()-1);
        repository.save(post);
    }
}
