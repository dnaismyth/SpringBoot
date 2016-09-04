package com.movement.service;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.movement.GetMovingMainApplication;
import com.movement.repository.FollowRepository;
import com.movement.repository.UserRepository;
import com.movement.repository.WorkoutJDBCRepository;
import com.movement.repository.WorkoutRepository;
import com.movement.service.FollowService;
import com.movement.service.UserService;
import com.movement.service.WorkoutService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=GetMovingMainApplication.class)
public class TestBaseClass {
	protected static final Logger logger = Logger.getLogger(TestBaseClass.class); 

	@Autowired
	protected UserService userService;
	
	@Autowired
	protected FollowService followService;
	
	@Autowired
	protected FollowRepository followRepo;
	
	@Autowired
	protected UserRepository userRepo;
	
	@Autowired
	protected WorkoutService workoutService;
	
	@Autowired
	protected WorkoutRepository workoutRepo;

}