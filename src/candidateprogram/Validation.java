package candidateprogram;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

    Scanner input = new Scanner(System.in);
    ArrayList<Candidates> arraylist = new ArrayList<>();
    String VALID_PHONE = "^\\d{10}$";
    String VALID_EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public String checkString() {
        String string;
        while (true) {
            string = input.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Not empty!");
                System.err.print("Enter Again: ");
            } else {
                break;
            }
        }
        return string;
    }

    public int checkInt() {
        int result;
        while (true) {
            try {
                result = Integer.parseInt(input.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must a digit");
                System.out.print("Enter Again: ");
            }
        }
    }

    public int checkBirthDate() {
        int date;
        while (true) {
            date = checkInt();
            if (date > 1900 && date < 2020) {
                break;
            } else {
                System.err.println("Not valid year: ");
                System.out.print("Enter again: ");
            }
        }
        return date;
    }

    public String checkPhone() {
        String phone;
        while (true) {
            phone = input.nextLine();
            if (phone == null) {
                System.err.println("Invalid ");
                continue;
            }
            if (phone.matches(VALID_PHONE)) {
                break;
            } else {
                System.err.println("Invalid");
                System.out.print("Enter again: ");

            }
        }
        return phone;
    }

    public String checkEmail() {
        String email;
        Pattern pat = Pattern.compile(VALID_EMAIL);
        while (true) {
            email = input.nextLine();
            if (email == null) {
                System.err.println("Invalid ");
                continue;
            }
            if (pat.matcher(email).matches()) {
                break;
            } else {
                System.err.println("Invalid");
                System.out.print("Enter again: ");
            }
        }
        return email;
    }

    public int checkYearOfExperience() {
        int year;
        while (true) {
            year = checkInt();
            if (year > 0 && year < 100) {
                break;
            } else {
                System.err.println("Not available");
                System.out.print("Enter again: ");
            }
        }
        return year;
    }

    public String checkRankFresher() {
        String rank;
        String rank_type = "[Ee]xcellence|[Gg]ood|[Ff]air|[Pp]oor";
        boolean loop = true;
        do {
            rank = input.nextLine();
            if (rank == null) {
                System.out.println("Invalid input!");
                continue;
            }
            if (rank.matches(rank_type)) {
                loop = false;
            } else {
                System.err.println("Invalid rank!");
                System.err.println("Rank must be Excellence or Good or Fair or Poor");
                System.out.print("Enter again: ");
            }
        } while (loop);
        return rank;
    }

    public int checkCandidateType() {
        int i = 0;
        while (true) {
            try {
                i = Integer.parseInt(input.nextLine());
                if (i >= 1 && i <= 3) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Must a digit!!");
                System.out.print("Enter again ");
            }
        }
        return i;
    }
}
