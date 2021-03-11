package chpter10.interfaceEx.scheduler;

public class RoundRobin implements Scheduler {
    @Override
    public void getNexCall() {
        System.out.println("대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음순번 상담원에게 배정합니다.");
    }
}
