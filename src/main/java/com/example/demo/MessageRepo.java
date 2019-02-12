package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface MessageRepo extends PagingAndSortingRepository<Message, Long> {

}
