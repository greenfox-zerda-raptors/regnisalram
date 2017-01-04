package com.greenfox.regnisalram.reddit.controllers;

import com.greenfox.regnisalram.reddit.models.Post;
import com.greenfox.regnisalram.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public ModelAndView create(@RequestParam("title") String title, @RequestParam("message") String message) {
        repository.save(new Post(title, message));
        return new ModelAndView("redirect:/posts/");
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editPost(Model model) {
        return "posts/edit";
    }

    @RequestMapping(value = "/upvote", method = RequestMethod.GET)
    public String upvote(Model model) {
        return "posts/list";
    }

    @RequestMapping(value = "/downvote", method = RequestMethod.GET)
    public String downvote(Model model) {
        return "posts/list";
    }
}
