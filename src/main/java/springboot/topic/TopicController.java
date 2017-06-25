package springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {

		return Arrays.asList(new Topic("Spring", "Spring framework", "spring framework description"),
				new Topic("Java", "Java coursework", "java course description"),
				new Topic("Javascript", "Javascript coursework", "Javascript descritpion"));
	}

}
