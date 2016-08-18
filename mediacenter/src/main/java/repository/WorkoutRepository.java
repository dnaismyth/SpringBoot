package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dto.Workout;

@Transactional
@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
