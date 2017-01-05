package com.greenfox.regnisalram.reddit.services;

import com.greenfox.regnisalram.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by regnisalram on 1/5/17.
 */
@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public void list(Model model) {
        model.addAttribute("posts", repository.findAll());
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
