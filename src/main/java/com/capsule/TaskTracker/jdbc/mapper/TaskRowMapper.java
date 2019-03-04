package com.capsule.TaskTracker.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.capsule.TaskTracker.entity.Task;

public class TaskRowMapper implements RowMapper<Task> {
	
	@Override
	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
		Task task = new Task();
//		task.setTaskId(rs.getString("task"));
		task.setPriority(rs.getInt("priority"));
//		task.setParentTaskName(rs.getString("parent_task"));
		task.setStartDate(rs.getDate("start_date"));
		task.setEndDate(rs.getDate("end_date"));
		
		return task;
	}
}
