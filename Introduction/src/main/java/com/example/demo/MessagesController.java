package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessagesController {
	@Autowired
	MessageRepository messageRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getMessages() {
		return messageRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Message postMessages(@RequestBody Message message) {
		return messageRepository.save(message);
	}
}
