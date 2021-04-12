package candidateprogram;

/**
 *
 * @author Admin
 */
public class Intern  extends  Candidates {
    private String majors,universityName;
    private int semester;

    public Intern() {
    }

    public Intern(String majors, String universityName, int semester, int ID, int birthdate, int type, String name, String address, String phone, String email) {
        super(ID, birthdate, type, name, address, phone, email);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}
