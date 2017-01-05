package com.greenfox.regnisalram.reddit.controllers;

import com.greenfox.regnisalram.reddit.models.Post;
import com.greenfox.regnisalram.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@RequestMapping(value = "/posts", method = RequestMethod.GET)
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", repository.findAll());
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost(Model model) {
        return "posts/new_post";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestParam("title") String title, @RequestParam("message") String message) {
        repository.save(new Post(title, message));
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.POST)
    public String upvote(@PathVariable long id) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore()+1);
        repository.save(post);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.POST)
    public String downvote(@PathVariable long id) {
        Post post = repository.findOne(id);
        post.setScore(post.getScore()-1);
        repository.save(post);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editPost(Model model) {
        return "posts/edit";
    }

}
