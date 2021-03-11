package chpter10.interfaceEx.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        //r,l,p
        System.out.println("배정방식 입력 . R,L,P");

        int ch = System.in.read();
        Scheduler scheduler;

        if (ch =='R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원하지않음");
            return;
        }

        scheduler.getNexCall();
        scheduler.sendCallToAgent();

    }
}
