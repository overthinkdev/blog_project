package com.my.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.blog.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer>{

}
