package chapter12.b_collection.arraylist;

import chapter12.b_collection.Member;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for(int i=0; i<arrayList.size(); i++){
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if( memberId == tempId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println("there is no Id like " + memberId);
        return false;
    }

    public void showAll(){

        for (Member member : arrayList){
            System.out.println(member);
        }

        System.out.println("\n"+arrayList);
    }

}
