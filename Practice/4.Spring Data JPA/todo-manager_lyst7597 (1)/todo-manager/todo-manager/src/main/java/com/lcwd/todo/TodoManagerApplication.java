package com.lcwd.todo;

import com.lcwd.dao.TodoDao;
import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.lcwd")
public class TodoManagerApplication implements CommandLineRunner {

@Autowired
private TodoDao todoDao;

Logger logger= LoggerFactory.getLogger(TodoManagerApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(TodoManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("app start");
//		JdbcTemplate template=todoDao.getTemplate();
//		logger.info("Template object:{}",template);
//		logger.info("Template object:{}",template.getDataSource());

//		Todo todo=new Todo();
//		todo.setId(123);
//		todo.setTitle("This is testing spring jdbc");
//		todo.setContent("Wow it is working");
//		todo.setStatus("PENDING");
//		todo.setAddedDate(new Date());
//		todo.setToDoDate(new Date());
// 	todoDao.saveTodo(todo);

	//	Todo todo=todoDao.getTodo(123);
	//	logger.info("TODO :{}",todo);

//		        Todo todo = new Todo();
//        todo.setId(1230);
//        todo.setTitle("Java Placement Course");
//        todo.setContent("I have to learn java course");
//        todo.setStatus("PENDING");
//        todo.setAddedDate(new Date());
//        todo.setToDoDate(new Date());
//
//        todoDao.saveTodo(todo);

//List<Todo> allTodos = todoDao.getAllTodos();

  //    logger.info("ALL TODOS : {}",allTodos);

//
//		        Todo todo = todoDao.getTodo(1230);
//        logger.info("TODO : {}", todo);
//        todo.setTitle("Learn SpringBoot Course");
//        todo.setContent("I have to learn spring  boot");
//        todo.setStatus("DONE");
//        todo.setAddedDate(new Date());
//        todo.setToDoDate(new Date());
//        todoDao.updateTodo(1230, todo);
//	todoDao.deleteTodo(2	);
	//	todoDao.deleteMultiple(new int[]{1,123});
	}



}
