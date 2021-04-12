package candidateprogram;

/**
 *
 * @author Admin
 */
public class Experience extends  Candidates{
    private int yearOfExperience;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(int yearOfExperience, String professionalSkill, int ID, int birthdate, int type, String name, String address, String phone, String email) {
        super(ID, birthdate, type, name, address, phone, email);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    
}
