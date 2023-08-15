import java.util.List;

public class Question extends PostItem{

    long questionId;

    List<Answer> answersList;

    List<Comment> commentList;
    List<Tag> tags;
    Bounty bounty;

    QuestionStatus questionStatus;

    boolean isClosed;
    ClosingDetails closingDetails;

    public void addComment(){

    }

    public void addBounty(){

    }

    public void addTag(){

    }


}
