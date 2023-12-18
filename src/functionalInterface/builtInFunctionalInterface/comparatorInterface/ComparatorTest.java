package functionalInterface.builtInFunctionalInterface.comparatorInterface;

import java.util.Collections;
import java.util.Comparator;

class Job{
    int id;
    int profit;
    int deadline;
    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", profit=" + profit +
                ", deadline=" + deadline;
    }
}
public class ComparatorTest {
    static Job[] jobArr;
    ComparatorTest(){
        jobArr = new Job[4];
    }

    public static void displayJob(){
        for(Job job : jobArr){
            System.out.println(job);
        }
    }

    public static void main(String[] args) {
        ComparatorTest comparator = new ComparatorTest();

        Job j1 = new Job(1, 4, 20);
        Job j2 = new Job(2, 1, 10);
        Job j3 = new Job(3, 1, 40);
        Job j4 = new Job(4, 1, 30);

        jobArr[0] = j1;
        jobArr[1] = j2;
        jobArr[2] = j3;
        jobArr[3] = j4;

    }
}
