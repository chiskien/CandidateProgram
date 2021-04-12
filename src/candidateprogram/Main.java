package candidateprogram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CandidateManagement ck = new CandidateManagement();
        System.out.println("===================CANDIDATE MANAGEMENT PROGRAM==================");
        System.out.println("1. Create Intern ");
        System.out.println("2. Create Fresher ");
        System.out.println("3. Create Experience ");
        System.out.println("4. Search ");
        System.out.println("5. Exit ");
        while (true) {
            System.out.print("Enter your choice: ");
            switch (input.nextInt()) {
                case 1: {
                    ck.createCandidate(1);
                    break;
                }
                case 2: {
                    ck.createCandidate(2);
                    break;
                }
                case 3: {
                    ck.createCandidate(3);
                    break;
                }
                case 4: {
                    ck.search();
                    break;
                }
                case 5: {
                    return;
                }
            }

        }
    }
}
