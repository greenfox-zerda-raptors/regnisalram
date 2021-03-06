package com.greenfox.regnisalram.reddit.controllers;

import com.greenfox.regnisalram.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@RequestMapping(value = "/posts", method = RequestMethod.GET)
public class PostsController {

    private PostService service;

    @Autowired
    public PostsController(PostService service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") Integer page,
                        @RequestParam(name = "count", defaultValue = "5") Integer count) {
        model.addAttribute("posts", service.list(page, count));
        return "posts/list";
    }

    @GetMapping(value = "/add")
    public String addPost() {
        return "posts/new_post";
    }

    @PostMapping(value = "/create")
    public String create(@RequestParam("title") String title, @RequestParam("message") String message) {
        service.create(title, message);
        return "redirect:/posts/";
    }

    @PostMapping(value = "/{id}/upvote")
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
