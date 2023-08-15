import java.util.Date;
import java.util.List;

public class Profile {

    String gender;

    Date dateOfBirth;

    byte[] profilePicture;

    byte[] coverPhoto;

    List<Education> educationList;

    List<Work> workList;

    public boolean addWorkExperience(Work work) {
        return false;
    }

    public boolean addEducation(Education education) {
        return false;
    }

    public boolean addProfilePicture(byte[] image) {
        return false;
    }

    public boolean addCoverPhoto(byte[] image) {
        return false;
    }

    public boolean addGender(String gender) {
        return false;
    }
}

