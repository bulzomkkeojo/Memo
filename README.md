![header](https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=불좀꺼조&fontSize=70)
## 🎇 불좀꺼조
📝 Spring_6기 A반 1조 메모장 프로그램 📝

## 📍 프로그램 요구사항
1. 메모장 프로그램 → 1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료 메뉴
2. 입력
   - 이름, 비밀번호, 메모를 입력받음(Scanner)
   - 1건의 글 생성 및 메모 리스트에 저장
   
3. 수정
   - 수정할 글 번호를 입력받음
   - 수정할 글이 존재하면 글 수정, 그렇지 않으면 존재하지 않는다는 메시지 출력
   - 수정할 글 비밀번호 입력받음
   - 비밀번호가 일치하면 수정 내용을 업데이트하고, 일치하지 않으면 일치하지 않는다는 메시지 출력

4. 삭제
   - 삭제할 글 번호를 입력받음
   - 삭제할 글이 존재하면 글 삭제, 존재하지 않으면 존재하지 않는다는 메세지 출력
   - 삭제할 글의 비밀번호 입력받음
   - 비밀번호가 일치하면 삭제하고, 일치하지 않으면 일치하지 않는다는 메세지 출력

5. Memo 클래스
   - 메모 한 건에 대한 정보를 가지는 클래스
   - 글 번호, 작성자 이름, 비밀번호, 게시글, 작성일(컴퓨터 시스템의 날짜와 시간을 자동으로 저장)을 가지고 있음
   - 글 수정 시, 수정 시간으로 시간 변경됨

6. MemoList 클래스
   - 여러 건의 메모를 저장하는 클래스
   - 메모 전체 조회 가능 (Getter/Setter 존재)
   - 작성 최신 순으로 메모 출력
   - 메모 리스트에 한 건의 글 추가 가능
   - 글의 수정 혹은 삭제 시, 글 번호를 넘겨 받고, 리스트에서 글 번호에 해당하는 글 1건을 리턴하는 메소드 존재
   - 해당되는 글 1건을 수정하는 메소드 존재
   - 해당되는 글 1건을 삭제하는 메소드 존재
   - 글 삭제 후 글의 번호를 다시 붙여줌
   - 글 삭제 후 새 글이 입력될 때 idx가 기존 idx에 이어서 1씩 증가할 수 있게 count 값 수정

## 👩‍💻 팀원 역할
- 고푸름: 메모 리스트에 메모 추가하기
- 김인서: 메모 삭제하기
- 송병민: 글 번호에 해당하는 메모 리턴
- 심형철: 메모 수정하기
- 이수연: IDX 값 리셋, 메인 메소드

## 💻 출력 화면 구상
```
------ 메인 화면 ------
1. 입력
2. 목록 보기
3. 수정
4. 삭제
5. 종료

------ 입력 화면 ------
1. 입력

이름을 입력해주세요
"000"

비밀번호를 입력해주세요
1234

내용을 입력해주세요
첫 메모

메모가 작성되었습니다

------ 목록 보기 화면 ------
2. 목록 보기

1 | "000" | 2023년 06월 05일 17시 50분 58초
첫 메모


2 | "000" | 2023년 06월 05일 17시 52분 35초
두 번째 메모

------ 수정 화면 ------
3. 수정

글 번호를 입력해주세요: 1
비밀번호를 입력해주세요: 1234
메모를 수정합니다.
이름을 입력해주세요.
"0000"
비밀번호를 입력해주세요.
1234
메모내용을 입력해주세요.
첫 번째 메모
수정이 완료되었습니다. 메인으로 돌아갑니다.

------ 삭제 화면 ------
4. 삭제

글 번호를 입력해주세요: 1
비밀번호를 입력하세요: 1234
글을 삭제합니다.

------ 종료 화면 ------
5. 종료

메모장을 종료합니다.
```
## 🗂️ 파일 구성
1. Main.java
메인 메뉴를 출력하고, 각 메뉴 입력 시 해당하는 메소드를 호출한다.

2. Memo.java
메모 정보를 담기 위한 클래스로, 작성자의 이름, 메모 비밀번호, 메모 내용, 작성일, 메모 번호 내용을 저장한다.

3. MemoList.java
메모들을 리스트로 저장한다.
해당 리스트에 메모를 추가하는 메소드, 글 번호를 넘겨받아 메모를 리턴하는 메소드, 글 한건을 수정하는 메소드, 글 한건을 삭제하는 메소드, 글 번호를 다시 설정하는 메소드가 있다.


## 🪄 코드 구성
Main.java, Memo.java, MemoList.java 3개의 클래스로 구성되어 있다.

1. Memo.java
```java
public class Memo {

    Integer Number;                              // 메모 번호
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
    public void setMemoDate() { this.MemoDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초")); }
    // 메모 내용 설정 메소드
    public void setContext(String newContext) { this.Context = newContext; }
    // 사용자 이름 설정 메소드
    public void setName(String newName) { this.Name = newName; }
    // 비밀번호 설정 메소드
    public void setPassword(String newPassword) { this.Password = newPassword; }
    // 메모 번호 설정 메소드
    public void setNumber(Integer number) { this.Number = number; }

}
```
Integer 타입의 메모 번호와 String 타입의 작성자 이름, 비밀번호, 메모 내용, 작성일 필드가 있다.
각 필드에 접근 가능한 Getter 메소드와, 값을 수정하는 Setter 메소드가 있다.
그리고 메모 인스턴스를 생성하기 위한 생성자가 있다.

```java
public class MemoList {
    LinkedList<Memo> memoList = new LinkedList<>();
    // 메소드1: 메모 전체 조회 가능-작성 최신순으로 (Getter, Setter)
    public LinkedList<Memo> getMemoList() { return memoList; }
    public void setMemoList(LinkedList<Memo> memoList) { this.memoList = memoList; }

    // 메소드2: 메모 리스트의 1건의 메모 추가하기
    public void addMemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요: ");
        String Name = sc.nextLine();

        System.out.println("비밀번호를 입력해주세요: ");
        String Password = sc.nextLine();

        System.out.println("내용을 입력해주세요: ");
        String Context = sc.nextLine();

        Memo memo = new Memo(memoList.size() + 1, Name, Password, Context);
        memoList.add(memo);

        System.out.println("메모가 작성되었습니다.");
        System.out.println("");
    }

    // 메소드3: 글 번호를 넘겨받아 글 번호에 해당하는 글 1건을 리턴
    public Memo checkMemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("글 번호를 입력해주세요: ");
        int memoNum = scanner.nextInt();

        for (Memo memo : memoList) {
            if (memo.getNumber() == memoNum) {
                return memo;
            }
        }
        return null;
    }

    // 메소드4: 해당되는 글 한건을 수정하는 메소드
    public void updateMemo(Memo memo) {
        Scanner sc = new Scanner(System.in);
        //- 수정할 글이 존재하면 글을 수정하고 존재하지 않으면 존재하지 않는다고 메시지를 출력한다.
        if (memo!=null) {  //null 값일 수 있음
            //- 수정할 글의 비밀번호를 입력 받는다.
            System.out.print("비밀번호를 입력해주세요: ");
            String password = sc.next();
            sc.nextLine();
            //checkPassword()로 분리 가능
            if(password.equals(memo.getPassword())){
                //-비밀번호가 일치할 시 :수정 내용 업데이트 ,비밀번호 불일치 시 :비밀번호가 일치하지 않는다는 메시지 출력
                System.out.println("메모를 수정합니다.");
                System.out.println("이름을 입력해주세요: ");
                String newName=sc.next();
                sc.nextLine();
                System.out.println("비밀번호를 입력해주세요: ");
                String newPassword=sc.next();
                sc.nextLine();
                System.out.println("메모내용을 입력해주세요: ");
                String newContext=sc.nextLine();
                memo.setName(newName);
                memo.setPassword(newPassword);
                memo.setContext(newContext);
                memo.setMemoDate();
                System.out.println("수정이 완료되었습니다. 메인으로 돌아갑니다.");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
            }

        } else {
            System.out.println("글이 존재하지 않습니다.");
        }
    }
    // 메소드5: 글 한 건을 삭제하는 메소드
    public void deleteMemo(Memo memo) {
        Scanner sc = new Scanner(System.in);

        if (memo != null) {
            System.out.println("비밀번호를 입력해주세요: ");
            String inputPassword = sc.nextLine();
            if (inputPassword.equals(memo.getPassword())) {
                System.out.println("글을 삭제합니다.");
                memoList.remove(memo);
            } else {
                System.out.println("비밀번호가 일치하지 않습니다!");
            }

        } else {
            System.out.println("번호에 해당하는 글이 존재하지 않습니다.");
        }
    }

    // 메소드6: 글 삭제 후 글의 번호를 다시 붙여줌
    // 글 삭제 후 새 글이 입력될 때, idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록 count 값 수정
    public void resetNumber() {
        Integer i = 1;
        for (Memo m:memoList) {
            m.setNumber(i++);
        }
    }

}
```
Memo 인스턴스들을 담을 리스트를 LinkedList 타입으로 선언하고, Getter/Setter 메소드를 만들었다.
1) 메소드1: 메모 리스트에 메모 1건 추가하기
2) 메소드2: 글의 번호를 입력받아 리스트에 해당 메모가 있는지 확인하고, 메모를 리턴
3) 메소드3: 해당하는 글 1건을 수정하기
4) 메소드4: 해당하는 글 1건을 삭제하기
5) 메소드5: 글 삭제 후 글의 번호를 다시 붙여주기


```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemoList memoList = new MemoList();
        boolean memo_start = true;

        while (memo_start) {
            System.out.println("1. 입력");
            System.out.println("2. 목록 보기");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 종료");
            String menu_input = sc.nextLine();

            if (Objects.equals(menu_input,"1")) {
                System.out.println("1. 입력\n");
                memoList.addMemo();
            } else if (Objects.equals(menu_input,"2")) {
                System.out.println("2. 목록 보기\n");
                LinkedList<Memo> memoLinkedList = memoList.getMemoList();
                for (int i=memoLinkedList.size()-1; i>=0; i--) {
                    System.out.printf("%-2d | %-5s | %s\n%s\n", memoLinkedList.get(i).getNumber(), memoLinkedList.get(i).getName(), memoLinkedList.get(i).getMemoDate(), memoLinkedList.get(i).getContext());
                }
            } else if (Objects.equals(menu_input,"3")) {
                System.out.println("3. 수정\n");
                Memo memo_u = memoList.checkMemo();
                memoList.updateMemo(memo_u);
            } else if (Objects.equals(menu_input,"4")) {
                System.out.println("4. 삭제\n");
                Memo memo_d = memoList.checkMemo();
                memoList.deleteMemo(memo_d);
                memoList.resetNumber();
            } else if (Objects.equals(menu_input,"5")) {
                System.out.println("5. 종료\n");
                System.out.println("메모장을 종료합니다.");
                memo_start = false;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            } // if~else문 중료
        } // while문 종료


    }
}
```
총 5개의 메뉴를 출력해준다.
1. 입력을 선택했다면 MemoList.java의 addMemo() 메소드를 호출해서 메모 입력 작업을 수행한다.
2. 목록 보기를 선택했다면 MemoList.java의 memoList를 불러와 리스트 내용을 출력한다.
3. 수정을 선택했다면 MemoList.java의 checkMemo()를 통해 글 번호를 입력받고 메모를 리턴받은 다음 updateMemo() 메소드를 호출하여 글을 수정한다.
4. 삭제를 선택했다면 MemoList.java의 checkMemo()를 통해 글 번호를 입력받고 메모를 리턴받은 다음 deleteMemo() 메소드를 호출하여 글을 삭제한다.
5. 종료를 선택했다면 메모장의 종료를 알리고 반복문을 종료한다.
