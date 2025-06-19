package daily_study.day_09.part_02;

public class InnerOuter {
    private String message = "외부 클래스 메시지";

    class Inner {
        public void showMessage() {
            System.out.println("외부 값: " + InnerOuter.this.message);
        }
    }

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.showMessage();
    }
}
