    package candidateprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateManagement {

    ArrayList<Candidates> arraylist = new ArrayList<>();
    Validation valid = new Validation();
    Scanner input = new Scanner(System.in);

    public boolean checkIDExist(int ID) {
        for (Candidates candi : arraylist) {
            if (ID == candi.getID()) {
                return true;
            }
        }
        return false;
    }

    public void createCandidate(int type) {
        System.out.println("--------Create new Candidate---------");

        while (true) {
            System.out.print("Enter ID: ");
            int ID = valid.checkInt();
            if (checkIDExist(ID)) {
                System.err.println("This ID has existed");
                return;
            } else {
                System.out.print("Enter Name: ");
                String name = valid.checkString();
                System.out.print("Enter Address: ");
                String address = valid.checkString();
                System.out.print("Enter BirthDate: ");
                int date = valid.checkBirthDate();
                System.out.print("Enter Phone: ");
                String phone = valid.checkPhone();
                System.out.print("Enter Email: ");
                String email = valid.checkEmail();
                Candidates candi = new Candidates(ID, date, type, name, address, phone, email);
                switch (type) {
                    case 1: {
                        createIntern(candi);
                        break;
                    }
                    case 2: {
                        createFresher(candi);
                        break;
                    }
                    case 3: {
                        createExperience(candi);
                        break;
                    }
                }
                System.out.print("Do you want to continue?(Y/N): ");
                String choice = input.next();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                } else if (choice.equalsIgnoreCase("Y")) {
                    continue;
                } else {
                    System.err.println("Not an option");
                    System.out.println("Do you want to continue?(Y/N): ");
                }

            }
        }
    }

    public void createExperience(Candidates candi) {
        System.out.println("======information of a Experience candidate======");
        System.out.print("Enter year of Experience: ");
        int year = valid.checkYearOfExperience();
        System.out.print("Enter Professional Skill: ");
        String skill = valid.checkString();
        arraylist.add(new Experience(year, skill, candi.getID(), candi.getBirthdate(),
                candi.getType(), candi.getName(), candi.getAddress(), candi.getPhone(), candi.getEmail()));
        System.err.println("Create uccessfully");
    }

    public void createFresher(Candidates candi) {
        System.out.println("======information of a Fresher candidate======");
        int graduateDate;
        while (true) {
            System.out.print("Enter graduateDate: ");
            graduateDate = valid.checkBirthDate();
            if (graduateDate < candi.getBirthdate()) {
                System.out.println("Graduated date must be larger than birth date!");
            } else {
                break;
            }
        }
        System.out.print("Enter rank of Fresher: ");
        String rank = valid.checkRankFresher();
        System.out.print("Enter Name of University: ");
        String name = valid.checkString();
        arraylist.add(new Fresher(rank, name, graduateDate, candi.getID(), candi.getBirthdate(),
                candi.getType(), candi.getName(), candi.getAddress(), candi.getPhone(), candi.getEmail()));
        System.err.println("Create Successfully");
    }

    public void createIntern(Candidates candi) {
        System.out.println("======information of a Intern candidate======");
        System.out.print("Enter Majors: ");
        String majors = valid.checkString();
        System.out.print("Enter Semester: ");
        int semester = valid.checkInt();
        System.out.print("Enter University Name: ");
        String name = valid.checkString();
        arraylist.add(new Intern(majors, name, semester, candi.getID(), candi.getBirthdate(),
                candi.getType(), candi.getName(), candi.getAddress(), candi.getPhone(), candi.getEmail()));
        System.err.println("Create successfully!!");
    }

    public void displayCandidate() {
        int ID = 0;
        String name = "", address = "", phone = "", email = "";
        int date = 0;
        int type = 0;
        Candidates candi = new Candidates(ID, date, type, name, address, phone, email);
        Collections.sort(arraylist, candi);
        System.out.println("==========EXPERIENCE CANDIDATE==========");
        for (Candidates candidate : arraylist) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("==========FRESHER CANDIDATE============");
        for (Candidates candidate : arraylist) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("==========INTERN CANDIDATE=============");
        for (Candidates candidate : arraylist) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }

    public void search() {
        displayCandidate();
        System.out.print("Input Candidate Name(First or Last): ");
        String name = valid.checkString();
        System.out.println("Type 1: Intern");
        System.out.println("Type 2: Fresher");
        System.out.println("Type 3: Experience");
        System.out.print("Input Type of Candidate: ");
        int type = valid.checkCandidateType();
        boolean result = false;
        System.out.println("-----Result-----");
        for (Candidates candi : arraylist) {
            if (candi.getName().contains(name) && type == candi.getType()) {
                System.out.println(candi.getName() + " | " + candi.getBirthdate() + " | "
                        + candi.getAddress() + " | " + candi.getID() + " | " + candi.getPhone() + " | " + candi.getEmail() + " | " + candi.getType());
                result = true;
            }
        }
        if (result == false) {
            System.err.println("Not Found!!");
        }
    }
}
