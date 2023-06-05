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