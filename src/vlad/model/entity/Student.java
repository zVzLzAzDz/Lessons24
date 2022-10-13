package vlad.model.entity;

public class Student extends Human {

    private double mark;

    public Student(){

    }
    public Student(String name, int age, double mark){
        setName(name);
        setAge(age);
        this.mark = mark;


    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}

