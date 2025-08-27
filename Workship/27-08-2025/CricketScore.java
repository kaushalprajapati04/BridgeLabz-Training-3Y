import java.util.*;
public class CricketScore {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score:");
        int n = sc.nextInt();
        int score_card [] = new int[n];
        for(int i = 0; i < n; i++) {
            score_card[i] = sc.nextInt();
        }
        int score = 0;
        for (int i=0; i<score_card.length; i++) {
            score += score_card[i];
        }
        int score_avg = score/n;
        System.out.println("Average_score: " + score_avg);
        int max = score_card[0];
        int min = score_card[0];
        for (int i=0; i<score_card.length; i++) {
            if (score_card[i] > max) {
                max = score_card[i];
                System.out.println("Max_score: " + max);
            }
            if (score_card[i] < min) {
                min = score_card[i];
                System.out.println("Min_score: " + min);
            }
        }
    }
}
