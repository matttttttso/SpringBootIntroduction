package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MessageMapper {
	@Select("SELECT text FROM messages ORDER BY id")
	List<Message> findAll();
	
	@Insert("INSERT INTO message(text) VALUES(#{text})")
	int create(Message message);
}
