class TelePhone {
    String model; // 지역변수 model 선언
    int value; // 지역변수 value 선언

    void print() { // 함수 print()
        System.out.println(value + "만 원짜리 " + model + " 스마트폰"); // value와 model을 이용해 출력
    }
}

public class TelePhoneDemo {
    public static void main(String[] args) { // 메인함수
        TelePhone myPhone = new TelePhone(); // TelePhone 메소드를 myPhone변수로 초기화
        myPhone.model = "갤럭시 S22"; // TelePhone 메소드 안의 변수 사용
        myPhone.value = 100; // TelePhone 메소드 안의 변수 사용
        myPhone.print(); // TelePhone 메소드 안의 함수 사용

        TelePhone yourPhone = new TelePhone(); // TelePhone 메소드를 yourPhone변수로 초기화
        yourPhone.model = "갤럭시 S10"; // TelePhone 메소드 안의 변수 사용
        yourPhone.value = 50; // TelePhone 메소드 안의 변수 사용
        yourPhone.print(); // TelePhone 메소드 안의 함수 사용
    }
}
