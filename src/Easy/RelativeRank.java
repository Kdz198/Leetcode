package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RelativeRank {
    public static void main(String[] args) {
            relativeRank123 rank = new relativeRank123();

            rank.findRelativeRanks(new int[]{10,3,8,9,4});
    }
}

class relativeRank123 {
    public String[] findRelativeRanks(int[] score) {

        String[] ranks = new String[score.length];
        int [] score2 = score.clone();
        Arrays.sort(score2);
        System.out.println("");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i] == score2[j]) {
                    System.out.println("i:" + i + " j:" + j + " score:" + score[i] + " score2:" + score2[j]);
                    ranks[i] = String.valueOf(score.length-j);
                    if (ranks[i].equals("1"))
                    {
                        ranks[i] = "Gold Medal";
                    }
                    if (ranks[i].equals("2"))
                    {
                        ranks[i] = "Silver Medal";
                    }
                    if (ranks[i].equals("3"))
                    {
                        ranks[i] = "Bronze Medal";
                    }
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(ranks[i]+"-");
        }


        return ranks;
    }
}
