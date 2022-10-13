package vlad.model.entity;

public class Student extends Human {


    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private double mark;
    private MarkNote note;


    public Student() {
        super();
        note = new MarkNote();

    }

    public Student(String name, int age, double mark) {
        super(name, age);
        this.mark = mark;
        note = new MarkNote(mark);

    }

    public Student(String name, int age, MarkNote note) {
        super(name, age);
        this.mark = mark;
        this.note = note;

    }

    public double getMark() {
        return note.getMark();
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            note.setMark(mark);
        }
    }


    public MarkNote getNote() {
        return note;
    }

    public void setNote(MarkNote note) {
        this.note = note;
    }

    public String getInfo() {
        return super.getInfo() + ", mark = " + mark;
    }
}

