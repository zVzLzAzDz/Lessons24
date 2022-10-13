package vlad.model.entity;

public class Student extends Human {


    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;

    public Student() {


    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;


    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }

    public String getInfo() {
        return super.getInfo() + ", mark = " + mark;
    }
}

