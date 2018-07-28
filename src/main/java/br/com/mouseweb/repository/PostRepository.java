package br.com.mouseweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.mouseweb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	
}