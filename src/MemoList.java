import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class MemoList {
    LinkedList<Memo> memoList = new LinkedList<>();
    // 메소드1: 메모 전체 조회 가능-작성 최신순으로 (Getter, Setter)
    public LinkedList<Memo> getMemoList() {
        return memoList;
    }
    public void setMemoList(LinkedList<Memo> memoList) {
        this.memoList = memoList;
    }

    // 메소드2: 메모 리스트의 1건의 메모 추가하기
    public void addMemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String Name = sc.nextLine();

        System.out.println("비밀번호를 입력해주세요");
        String Password = sc.nextLine();

        System.out.println("내용을 입력해주세요");
        String Context = sc.nextLine();

        Memo memo = new Memo(memoList.size() + 1, Name, Password, Context);
        memoList.add(memo);

        System.out.println("메모가 작성되었습니다");
        System.out.println("");
    }

    // 메소드3: 글 번호를 넘겨받아 글 번호에 해당하는 글 1건을 리턴
    public Memo checkMemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("글 번호를 입력해주세요 : ");
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
            System.out.print("비밀번호를 입력해주세요. ");
            String password = sc.next();
            sc.nextLine();
            //checkPassword()로 분리 가능
            if(password.equals(memo.getPassword())){
                //-비밀번호가 일치할 시 :수정 내용 업데이트 ,비밀번호 불일치 시 :비밀번호가 일치하지 않는다는 메시지 출력
                System.out.println("메모를 수정합니다.");
                System.out.println("이름을 입력해주세요.");
                String newName=sc.next();
                sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String newPassword=sc.next();
                sc.nextLine();
                System.out.println("메모내용을 입력해주세요.");
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
            System.out.println("비밀번호를 입력하세요: ");
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
