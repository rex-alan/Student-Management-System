import java.util.*;
public class TopicsCoveredRepo {
    private static ArrayList<TopicCovered> topicCoveredList = new ArrayList<>();

    public static ArrayList<TopicCovered> getTopicCoveredList() {
        return topicCoveredList;
    }
    public static void setTopicCoveredList(ArrayList<TopicCovered> topicCoveredList) {
        TopicsCoveredRepo.topicCoveredList = topicCoveredList;
    }
    
}
