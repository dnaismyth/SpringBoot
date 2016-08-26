package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.UserRepository;
import repository.WorkoutRepository;

@Service
public class ServiceBase {

	@Autowired
	protected UserService userService;
	
	@Autowired
	protected UserRepository userRepo;
	
	@Autowired
	protected WorkoutRepository workoutRepo;
	
	@Autowired
	protected WorkoutService workoutService;
}
