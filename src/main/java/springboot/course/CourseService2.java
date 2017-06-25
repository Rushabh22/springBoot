package springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * @Service : Marks the class as spring business service. 
   It create instance and registers it as a Singleton
*/
@Service
public class CourseService2 {
	private List<Course> topics = new ArrayList<Course>(
			Arrays.asList(new Course("Spring", "Spring framework", "spring framework description"),
					new Course("Java", "Java coursework", "java course description"),
					new Course("Javascript", "Javascript coursework", "Javascript descritpion")));
	
	public List<Course> getAllTopics() {
		return topics;
	}

	public Course getTopic(String id) {
		Course topic = topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
		return topic;
	}

	public void addTopic(Course topic) {
		topics.add(topic);

	}

	public void updateTopic(Course topic,String id) {
		for (int i=0; i < topics.size(); i++){
			Course t = topics.get(i);
			if(t.equals(topic)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
	}
}
