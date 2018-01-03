import java.util.*;


public class HRSaveThePrisoner {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num_test_cases = Integer.parseInt(in.nextLine());
        int saved_prisoner = 0;
        while(num_test_cases > 0) {
            int num_prisoners = in.nextInt();
            int num_sweets = in.nextInt();
            int start_id = in.nextInt();

            if(num_sweets > num_prisoners)
                num_sweets %= num_prisoners;

            if(start_id+num_sweets > num_prisoners) {
                if((start_id + num_sweets%num_prisoners - 1) > num_prisoners) {
                    saved_prisoner = start_id + num_sweets%num_prisoners - 1 - num_prisoners;
                } else {
                    saved_prisoner = start_id + num_sweets%num_prisoners - 1;
                }
            } else
                saved_prisoner = start_id + num_sweets - 1;
            num_test_cases -= 1;
            in.nextLine();
            System.out.println(saved_prisoner);
        }
    }
}
