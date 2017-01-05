package com.greenfox.regnisalram.reddit.controllers;

import com.greenfox.regnisalram.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@RequestMapping(value = "/posts", method = RequestMethod.GET)
public class PostsController {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        service.list(model);
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "posts/new_post";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestParam("title") String title, @RequestParam("message") String message) {
        service.create(title, message);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/upvote", method = RequestMethod.POST)
    public String upvote(@PathVariable long id) {
        service.upvote(id);
        return "redirect:/posts/";
    }

    @RequestMapping(value = "/{id}/downvote", method = RequestMethod.POST)
    public String downvote(@PathVariable long id) {
        service.downvote(id);
        return "redirect:/posts/";
    }

//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public String editPost(Model model) {
//        return "posts/edit";
//    }

}
