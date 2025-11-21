package daily_study.day_24.part_02;

public class GCExample {
    public static void main(String[] args) {
        GCExample obj = new GCExample();
        System.out.println("객체 생성 완료");

        obj = null;
        System.out.println("참조 제거됨");

        System.gc();
        System.out.println("GC 요청됨");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize 호출됨");
    }
}
