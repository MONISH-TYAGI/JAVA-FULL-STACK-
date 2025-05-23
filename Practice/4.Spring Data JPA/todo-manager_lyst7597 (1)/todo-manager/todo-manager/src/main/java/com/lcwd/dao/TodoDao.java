package com.lcwd.dao;

import com.lcwd.helper.Helper;
import com.lcwd.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Repository
public class TodoDao {

    Logger logger = LoggerFactory.getLogger(TodoDao.class);
    @Autowired
    private JdbcTemplate template;

    public TodoDao(@Autowired JdbcTemplate template)
    {
        this.template=template;
        String createTable="create table If NOT EXISTS todos(id int primary key,title varchar(100) not null,content varchar(500),status varchar(10) not null,addedDate datetime,todoDate datetime)";
        int update=template.update(createTable);
        logger.info("TODO TABLE CREATED {}",update);
    }


    public JdbcTemplate getTemplate(){
        return template;
    }

    public void setTemplate(JdbcTemplate template)
    {
        this.template=template;
    }

    public Todo saveTodo(Todo todo)
    {
        String insertQuery="insert into todos(id,title,content,status,addedDate,todoDate) values (?,?,?,?,?,?)";
        int rows=template.update(insertQuery,todo.getId(),todo.getTitle(),todo.getContent(),todo.getStatus(),todo.getAddedDate(),todo.getToDoDate());
        logger.info("JDBC OPERATION: {} inserted",rows);
        return todo;
    }

    public Todo getTodo(int id)
    {
        String query="Select * from todos WHERE id=?";
        Todo todo=template.queryForObject(query,new TodoRowMapper(),id);
      //  Todo todo=template.queryForObject(query,new TodoRowMapper(),id);
      //  Map<String,Object> todoData= template.queryForMap(query,id);
       // logger.info("TODO:{}", todoData);

        return todo;

    }
    public List<Todo> getAllTodos(){
        String query="Select * from todos";
        List<Todo> todo=template.query(query,new TodoRowMapper());
        return todo;
//        List<Map<String,Object>> maps=template.queryForList(query);
//        List<Todo> todos= maps.stream().map((map)->{
//            Todo todo= new Todo();
//            todo.setId((int)map.get("id"));
//            todo.setTitle((String) map.get("title"));
//            todo.setContent((String)map.get("content"));
//            todo.setStatus((String) map.get("status"));
//
//            try {
//                todo.setAddedDate(Helper.parseDate((LocalDateTime) map.get("addedDate")));
//                todo.setAddedDate(Helper.parseDate((LocalDateTime) map.get("addedDate")));
//            } catch (ParseException e) {
//                throw new RuntimeException(e);
//            }
//            return todo;
//        }).collect(Collectors.toList());
//        return todos;
    }

    public  Todo updateTodo(int id,Todo newTodo)
    {
        String query="update todos set title=?,content=?,status=?,addedDate=?,todoDate=? WHERE id=?";
        int update=template.update(query,newTodo.getTitle(),newTodo.getContent(),newTodo.getStatus(),newTodo.getAddedDate(),newTodo.getToDoDate(),id);
        logger.info("UPDATED {}", update);
        newTodo.setId(id);
        return newTodo;
    }

    public void deleteTodo(int id)
    {
        String query="delete from todos where id=?";
        int update=template.update(query,id);
        logger.info("Deleted{}",update);
    }
    public void deleteMultiple(int ids[])
    {
        String query="delete from todos where id=?";
        int []ints=template.batchUpdate(query, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                int id=ids[i];
                ps.setInt(1,id);
            }

            @Override
            public int getBatchSize(){
                return ids.length;
            }
        });
        for(int i:ints)
        {
            logger.info("DELETED {}",i);
        }

    }
}
