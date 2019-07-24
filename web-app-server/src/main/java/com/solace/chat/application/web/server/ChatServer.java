package com.solace.chat.application.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.solace.chat.application.auth.server.AuthServer;

@ComponentScan(basePackages = {"com.solace.chat.application.*"})
@SpringBootApplication
public class ChatServer {


	public static void main(String[] args) {
		SpringApplication.run(ChatServer.class, args);
	}
}
