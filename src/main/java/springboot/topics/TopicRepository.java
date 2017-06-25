package springboot.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
//	public List<Topic> getAllTopics();
//	public getTopic(String id);
//	public updateTopic(Topic topic,String id);
//	public deleteTopic(String id);
	
}
