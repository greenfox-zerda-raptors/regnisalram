package com.greenfox.regnisalram.reddit.services;

import com.greenfox.regnisalram.reddit.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by regnisalram on 1/4/17.
 */
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    Page<Post> findAllByOrderByScoreDesc(Pageable pageable);
}
