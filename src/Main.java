import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

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
                // 팀원 1
                System.out.println("1. 입력\n");
                memoList.addMemo();
            } else if (Objects.equals(menu_input,"2")) {
                // 팀원 2
                System.out.println("2. 목록 보기\n");
                LinkedList<Memo> memoLinkedList = memoList.getMemoList();
                for (int i=memoLinkedList.size()-1; i>=0; i--) {
                    System.out.printf("%-2d | %-5s | %s\n%s\n", memoLinkedList.get(i).getNumber(), memoLinkedList.get(i).getName(), memoLinkedList.get(i).getMemoDate(), memoLinkedList.get(i).getContext());
                }
            } else if (Objects.equals(menu_input,"3")) {
                // 팀원 3
                System.out.println("3. 수정\n");
                Memo memo_u = memoList.checkMemo();
                memoList.updateMemo(memo_u);
            } else if (Objects.equals(menu_input,"4")) {
                // 팀원 4
                System.out.println("4. 삭제\n");
                Memo memo_d = memoList.checkMemo();
                memoList.deleteMemo(memo_d);
                memoList.resetNumber();
            } else if (Objects.equals(menu_input,"5")) {
                // 팀원 5
                System.out.println("5. 종료\n");
                System.out.println("메모장을 종료합니다.");
                memo_start = false;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            } // if~else문 중료
        } // while문 종료


    }
}