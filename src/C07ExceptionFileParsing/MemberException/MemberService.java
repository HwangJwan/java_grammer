package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MemberService {
    private MemberRepository memberRepository;

    public void register(String name, String email, String password) {
//        List(DB)에 email이 중복일 경우 예외 발생(IllegalArguments)
        Optional<Member> member = memberRepository.findByEmail(email);
        if (member.isPresent()) {
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }
//        객체 조립 후 repository를 통해 저장
        Member newMember = null;
        newMember = new Member(name, email, password);
        memberRepository.register(newMember);

    }

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    public Member findById(long id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isEmpty()) {
//            예외 발생
            member.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 ID입니다"));
        }

        return member.get();
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public void login(String email, String password) {
        Optional<Member> member = memberRepository.findByEmail(email);
//        email이 있는지 확인 후 없으면 예외 발생
        if (member.isEmpty()) {
            member.orElseThrow(() -> new NoSuchElementException("없는 회원입니다."));
        }
//        password가 일치한지 확인 후 일치하지 않으면 예외 발생
        if (!member.get().getPassword().equals(password)) {
            throw new IllegalArgumentException();
        }
    }
}
