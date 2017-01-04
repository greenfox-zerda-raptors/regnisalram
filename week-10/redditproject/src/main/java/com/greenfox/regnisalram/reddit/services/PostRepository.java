package com.greenfox.regnisalram.reddit.services;

import com.greenfox.regnisalram.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by regnisalram on 1/4/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
