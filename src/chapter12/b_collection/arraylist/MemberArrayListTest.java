package chapter12.b_collection.arraylist;

import chapter12.b_collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(101, "Lee");
        Member memberGee = new Member(102, "Gee");
        Member memberKim = new Member(103, "Kim");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberGee);
        memberArrayList.addMember(memberKim);

        memberArrayList.showAll();

        memberArrayList.removeMember(101);

        memberArrayList.showAll();


    }
}
