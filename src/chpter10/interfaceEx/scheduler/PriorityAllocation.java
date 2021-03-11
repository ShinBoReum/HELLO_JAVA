package chpter10.interfaceEx.scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNexCall() {
        System.out.println("높은 등급부터 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무스킬이 가장높은 상담원에게 배정합니다. ");
    }
}
