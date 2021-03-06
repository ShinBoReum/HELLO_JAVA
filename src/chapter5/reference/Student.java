package chapter5.reference;

public class Student {

    int studentID;
    String studentName;


    Subject korea;
    Subject math;

    public Student() {
        korea = new Subject();
        math = new Subject();
    }

    public Student(int id, String name) {
        studentID= id;
        studentName=name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score){
        korea.setSubjectName(name);
        korea.setSubjectScore(score);
    }

    public void setMath(String name, int score){
        korea.setSubjectName(name);
        korea.setSubjectScore(score);
    }

    public void showStudentInfo(){
        int total= korea.getSubjectScore() + math.getSubjectScore();
        System.out.println("총점은 :" +total);
    }


}
