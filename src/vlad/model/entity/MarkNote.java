package vlad.model.entity;

public class MarkNote {

    private  double mark;

    public MarkNote() {
        mark = 4;
    }

    public MarkNote(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
