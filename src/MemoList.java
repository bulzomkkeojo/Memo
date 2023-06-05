import java.util.*;

public class MemoList { //여러 건의 메모를 저장하는 클래스 이다.
    public List<Memo> memos;
    public void init(){
        memos=new LinkedList<>(Arrays.asList(
                new Memo(1, "심형철1", "3412", "메모1"),
                new Memo(2, "심형철2", "7412", "메모2"),
                new Memo(3, "심형철3", "6412", "메모3"),
                new Memo(4, "심형철4", "5412", "메모4")
        ));
        for(Memo memo:memos){
            System.out.println(memo.getNumber()+"  "+memo.getName()+"  "+memo.getPassword()+"  "+memo.getContext()+"  "+memo.getMemoDate());
        }
    }



// 메소드1: 메모 전체 조회 가능-작성 최신순으로 (Getter, Setter)

    // 메소드2: 메모 리스트의 1건의 메모 추가하기

    // 메소드3: 글 번호를 넘겨받아 글 번호에 해당하는 글 1건을 리턴 (없으면 null 리턴)
    public Memo getOneMemo(int index){
        Memo oneMemo = null;
        if(!memos.isEmpty()){
            for (Memo memo : memos) {
                if ((memo.getNumber() == index)) {
                    oneMemo=memo;
                    System.out.println(oneMemo.getNumber()+oneMemo.getName()+oneMemo.getPassword()+oneMemo.getContext()+oneMemo.getMemoDate());
                    return oneMemo;
                }
            }
        }else{
            System.out.println("메모 리스트가 비었습니다.");
        }
        return oneMemo;
    }
    public boolean checkPassword(Memo memo,String password){
        return Objects.equals(memo.getPassword(), password);
    }
    // 메소드4: 해당되는 글 한건을 수정하는 메소드
    public void updateMemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 글 번호를 입력해주세요. ");
        int idx = sc.nextInt();
        sc.nextLine();
        //- 수정할 글이 존재하면 글을 수정하고 존재하지 않으면 존재하지 않는다고 메시지를 출력한다.
        Memo theMemo=getOneMemo(idx); //null 값일 수 있음
        if (theMemo!=null) {
            System.out.println("해당 글이 존재합니다.");
            //- 수정할 글의 비밀번호를 입력 받는다.
            System.out.print("비밀번호를 입력해주세요. ");
            String password = sc.next();
            sc.nextLine();
            //checkPassword()로 분리 가능
            if(checkPassword(theMemo,password)){
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
                theMemo.setName(newName);
                theMemo.setPassword(newPassword);
                theMemo.setContext(newContext);
                theMemo.setMemoDate();
                System.out.println("수정이 완료되었습니다. 메인으로 돌아갑니다.");
            }else{
                System.out.println("비밀번호가 일치하지 않습니다.");
            }

        }else {
            System.out.println("글이 존재하지 않습니다.");
        }
    }
    // 메소드5: 글 한 건을 삭제하는 메소드

    // 메소드6: 글 삭제 후 글의 번호를 다시 붙여줌
    // 글 삭제 후 새 글이 입력될 때, idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록 count 값 수정


}
