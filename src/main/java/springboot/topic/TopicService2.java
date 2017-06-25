package springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * @Service : Marks the class as spring business service. 
   It create instance and registers it as a Singleton
*/
@Service
public class TopicService2 {
	private List<Topic> topics = new ArrayList<Topic>(
			Arrays.asList(new Topic("Spring", "Spring framework", "spring framework description"),
					new Topic("Java", "Java coursework", "java course description"),
					new Topic("Javascript", "Javascript coursework", "Javascript descritpion")));
	
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		Topic topic = topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
		return topic;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopic(Topic topic,String id) {
		for (int i=0; i < topics.size(); i++){
			Topic t = topics.get(i);
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
