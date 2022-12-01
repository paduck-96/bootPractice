# bootPractice

## 객체

사용자[ ]
게시판[ ]
(...시스템[ ])
()...데이터베이스[ ])

## 관계

게시판[]----<sub>0...</sub>게시글
|
|
사용자
|
|
(..시스템)----(..데이터베이스)

## 협력

- # 메시지 찾기, 메시지의 책임

1. 가입
   email,nick,pass>
   ----가입--->[사용자](--->시스템--->DB)

2. 게시글 보기
   제목> 제목>
   ---글 보여줘라--->[게시판]---글 찾아라--->[게시글]
   <글 <글

3. 게시글 쓰기
   info>
   ---글 써라--->[게시판]

4. 게시글 수정, 삭제
   id>
   ------>[게시판]

## 인터페이스

- 수신 메시지만
  [사용자]
  이메일, 닉네임, 비밀번호 -> 가입하라
  ```java
  class User{
    public void join(String email, String name, String password)
  }
  ```
  [게시판]
  제목 -> 글 보여주기  
  info -> 글 쓰기  
  id -> 글 수정, 삭제하기
  ```java
  class Board{
    public void show(String title){}
    public void write(@... String ...){}
    public void update(Long id){}
    public void delete(Long id){}
  }
  ```
  [게시글]
  제목 -> 글 찾기 -> return 글
  ```java
  class Article{
    public Article find(String title){}
  }
  ```

## 구현

- 메시지 처리 방법 메서드화

  - User 는 추가 참조하는 메시지가 없어 완료

  ```java
  class Board{
    private List<Article> article;

    public Board(List<Article> article){
        this.article = article;
    }

    public void show(String title){}
    public void write(@... String ...){}
    public void update(Long id){}
    public void delete(Long id){}
  }
  ```

```java
  class Article{
    private String title;
    private String nickname;
    private String content;

    public Article(String title, String nickname, String content){
        this.title = title;
        this.nickname = nickname;
        this.content = content;
    }
    }
```

## MVC 패턴에 끼워맞추기

View -> board/all  
 /:id
/add, delete, update

Controller -> Get board/all
/:id
===
Post board/add, delete, update
user/join
/
==> Domain -> User  
 Board
Article
Repository -> show()
write()
update()
delete()
join()
find()
