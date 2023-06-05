import java.util.LinkedList;
import java.util.Scanner;

public class MemoList {
    // 메소드1: 메모 전체 조회 가능-작성 최신순으로 (Getter, Setter)

    // 메소드2: 메모 리스트의 1건의 메모 추가하기

    // 메소드3: 글 번호를 넘겨받아 글 번호에 해당하는 글 1건을 리턴

    // 메소드4: 해당되는 글 한건을 수정하는 메소드

    // 메소드5: 글 한 건을 삭제하는 메소드
    public static void deleteMemo(LinkedList<Memo> memoList, int Number) {
        Scanner sc = new Scanner(System.in);

        boolean memoFound = false;
        for (Memo memo : memoList) {
            if (memo.getNumber() == Number) {
                System.out.print("비밀번호를 입력하세요: ");
                String inputPassword = sc.nextLine();
                if (inputPassword.equals(memo.getPassword())) {
                    System.out.println("글을 수정합니다. 내용을 입력해주세요.");
                    String newContext = sc.nextLine();
                    memo.setContext(newContext);
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다!");
                }
                memoFound = true;
                break;
            }
        }

        if (!memoFound) {
            System.out.println("번호에 해당하는 글이 존재하지 않습니다.");
        }
    }

    // 메소드6: 글 삭제 후 글의 번호를 다시 붙여줌
    // 글 삭제 후 새 글이 입력될 때, idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록 count 값 수정


}
