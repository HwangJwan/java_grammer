package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소 역할을 하는 계층
// DB의 CRUD를 수행하는 계층
public class MemberRepository {
    private List<Member> memberList;

    public MemberRepository() {
        this.memberList = new ArrayList<>();
    }

    public void register(Member member) {
        this.memberList.add(member);
    }

    public Optional<Member> findByEmail(String email) {
//        email이 list에 있는지 없는지 확인
        Optional<Member> member = Optional.empty();
        for (Member a : memberList) {
            if (a.getEmail().equals(email)) {
                member = Optional.of(a);
            }
        }
        return member;
    }

    public Optional<Member> findById(long id) {
        Optional<Member> member = Optional.empty();
        for (Member a : memberList) {
            if (a.getId() == id) {
                member = Optional.of(a);
            }
        }
        return member;
    }

    public List<Member> findAll() {
        return this.memberList;
    }
}
