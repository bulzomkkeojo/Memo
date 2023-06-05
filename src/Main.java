import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean memo_start = true;
        MemoList memoList =new MemoList();
        memoList.init();


        while (memo_start) {
            System.out.println("1. 입력");
            System.out.println("2. 목록 보기");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 종료 메뉴");
            String menu_input = sc.nextLine();

            if (Objects.equals(menu_input, "1")) {
                // 팀원 1
                System.out.println("1. 입력\n");
            } else if (Objects.equals(menu_input, "2")) {
                // 팀원 2
                System.out.println("2. 목록 보기\n");
                memoList.getOneMemo(1);
                memoList.getOneMemo(2);
                memoList.getOneMemo(3);
                memoList.getOneMemo(4);
                memoList.getOneMemo(5);
            } else if (Objects.equals(menu_input, "3")) {
                // 심형철
                System.out.println("3. 수정\n");
                memoList.updateMemo();
                //혹시 공백생기면 sc.skip("[\\r\\n]+");
            } else if (Objects.equals(menu_input, "4")) {
                // 팀원 4
                System.out.println("4. 삭제\n");
            } else if (Objects.equals(menu_input, "5")) {
                // 팀원 5
                System.out.println("5. 종료 메뉴\n");
            } else {
                System.out.println("잘못된 메뉴입니다.");
            } // if~else문 중료
        } // while문 종료
    }
}