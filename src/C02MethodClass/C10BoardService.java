package C02MethodClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        <게시판서비스>
        1.계좌객체 : Author, Post
        2.자료구조 : List(authorList, postList)
        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
            3-2.회원 전체 목록 조회 : id, email
            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
            3-5.게시물 목록 조회 : id(post), title
            3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
     */
public class C10BoardService {
    public static void main(String[] args) {
        List<Author> authorList=new ArrayList<>();
        List<Post> postList=new ArrayList<>();

        while(true) {
            System.out.println("사용하실 서비스 번호를 입력해주세요\n1 : 회원가입서비스\n2 : 회원전체목록조회\n3 : 회원상세조회\n4 : 게시글 작성\n5 : 게시물 목록 조회\n6 : 게시물 상세 조회");
            Scanner  sc=new Scanner(System.in);
            int number=Integer.parseInt(sc.nextLine());
            if(number==1) { //회원가입
                System.out.println("회원가입서비스입니다. 이름과 이메일 그리고 비밀번호를 입력해주세요.");
                String name=sc.nextLine();
                String email=sc.nextLine();
                String pwd=sc.nextLine();
                boolean alreadyExist=false;
                for(Author a:authorList) {
                    if(a.isMemberEmail(email)) {
                        alreadyExist=true;
                        break;
                    }
                }
                if(alreadyExist) {
                    System.out.println("이미 존재하는 회원입니다");
                }
                else {
                    authorList.add(new Author(name, email, pwd));
                }
            }
            else if(number==2) {    //회원목록조회
                System.out.println("회원목록조회서비스입니다.");
                for(Author a:authorList) {
                    System.out.println(a.getId()+" "+a.getEmail());
                }
            }
            else if(number==3) {    //회원상세조회
                System.out.println("회원상세조회서비스입니다. 회원 아이디를 입력하세요");
                long memberId=Long.parseLong(sc.nextLine());
                boolean existingMember=true;
                Author author=null;
                for(Author a:authorList) {
                    if(a.isMemberId(memberId)) {
                        existingMember=false;
                        author=a;
                        break;
                    }
                }
                if(existingMember) {
                    System.out.println("존재하지 않는 회원 ID입니다.");
                }
                else {
                    System.out.println("ID는 "+author.getId()+" 이메일은 "+author.getEmail()+" 이름은 "+author.getName()+" 비밀번호는 "+author.getPwd()+" 작성 글 수는 "+author.getPostList().size());
                }
            }
            else if(number==4) {    //게시글작성
                System.out.println("게시글작성서비스입니다. 제목과 내용 그리고 이메일을 입력해주세요");
                String title=sc.nextLine();
                String contents=sc.nextLine();
                String email=sc.nextLine();
                Author author=new Author();
                boolean isCorrect=false;
                for(Author a:authorList) {
                    if(a.isMemberEmail(email)) {
                        author=a;
                        isCorrect=true;
                        break;
                    }
                }
                if(isCorrect) {
                    postList.add(new Post(title, contents, author));
                }
                else {
                    System.out.println("존재하지 않는 회원입니다.");
                }
            }
            else if(number==5) {    //게시물목록조회
                System.out.println("게시물목록조회서비스입니다");
                for(Post p:postList) {
                    System.out.println(p.getId()+" "+p.getTitle());
                }
            }
            else if(number==6) {    //게시물상세조회
                System.out.println("게시물상세조회서비스입니다. 게시글 ID를 입력하세요");
                long postId=Long.parseLong(sc.nextLine());
                Post post=new Post();
                for(Post p:postList) {
                    if(p.isPostId(postId)) {
                        post=p;
                        break;
                    }
                }
                System.out.println("게시글 ID는 "+post.getId()+" 제목은 "+post.getTitle()+" 내용은 "+post.getContents()+" 작성자 이름은 "+post.getAuthor().getName());
            }
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}

class Author {
    private String name;
    private String email;
    private String pwd;
    private Long id;
    private static long staticId;
    private List<Post> postList;

    public Author() {
    }

    public Author(String name, String email, String pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        staticId++;
        this.id=staticId;
        this.postList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public Long getId() {
        return id;
    }
// 객체의 이메일과 입력받은 이메일이 같은가?
    public boolean isMemberEmail(String email) {
        return this.getEmail().equals(email);
    }
//  객체의 ID와 입력받은 ID가 같은가?
    public boolean isMemberId(long memberId) {
        return this.getId()==memberId;
    }

    public List<Post> getPostList() {
        return postList;
    }
}

class Post {
    private String title;
    private String contents;
    private Author author;
    private Long id;
    private static long staticId;

    public Post() {
    }

    public Post(String title, String contents, Author author) {
        this.title = title;
        this.contents = contents;
        this.author = author;
        staticId++;
        this.id=staticId;
//        this는 지금 만들고자 하는 post 객체
        author.getPostList().add(this);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
//    객체의 게시글 id와 같은가?
    public boolean isPostId(long postId) {
        return this.getId()==postId;
    }

}


