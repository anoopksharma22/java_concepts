package interviewQuestions.secondHighest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestNumber {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,6,4,2,1);
        System.out.println(getNthHigest(2, nums));
    }

    public static int getNthHigest(int rank, List<Integer> nums){
        if(rank < 1 ){
            throw new IllegalArgumentException("Rank cannot be less than 1");
        }
        return nums.stream().collect(Collectors.toSet())
                .stream().sorted(Comparator.reverseOrder())
                .skip(rank-1).limit(1).collect(Collectors.toList()).get(0);
    }
}
