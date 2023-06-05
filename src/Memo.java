import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memo {

    Integer Number;                    // 메모 번호
    String Name, Password, Context, MemoDate;    // 작성자 이름, 비밀번호, 메모 내용, 작성일

    public Integer getNumber() { return Number; }

    public String getName() { return Name; }

    public String getPassword() { return Password; }

    public String getContext() { return Context; }

    public String getMemoDate() { return MemoDate; }

    // 메모 생성자
    public Memo (Integer Number, String Name, String Password, String Context) {
        this.Number = Number;
        this.Name = Name;
        this.Password = Password;
        this.Context = Context;
        this.MemoDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
    }

    // 현재 시간 설정 메소드
    public void setMemoDate() {
        this.MemoDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
    }

    // 메모 내용 설정 메소드
    public void setContext(String newContext) {
        this.Context = newContext;
    }

}
