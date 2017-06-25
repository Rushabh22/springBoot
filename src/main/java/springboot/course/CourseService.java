package springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @Service : Marks the class as spring business service. 
   It create instance and registers it as a Singleton
*/
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	

	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
