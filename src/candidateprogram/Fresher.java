package candidateprogram;

/**
 *
 * @author Admin
 */
public class Fresher extends  Candidates {
    private String rankOfGraduation;
    private String universityName;
    private int graduatedTime;

    public Fresher() {
    }

    public Fresher(String rankOfGraduation, String universityName, int graduatedTime, int ID, int birthdate, int type, String name, String address, String phone, String email) {
        super(ID, birthdate, type, name, address, phone, email);
        this.rankOfGraduation = rankOfGraduation;
        this.universityName = universityName;
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }
    
}
