package chpter10.interfaceEx.scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNexCall() {
        System.out.println("대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분");
    }
}
