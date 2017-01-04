package com.greenfox.regnisalram.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@RequestMapping(value = "/posts", method = RequestMethod.GET)
public class PostsController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "posts/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost(Model model) {
        return "posts/new_post";
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
