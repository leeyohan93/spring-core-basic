package spring.core.basic.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 생성자가 하나일때는 @Autowired 생략 가능
 */
@Component
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

//    @Autowired //ac.getBean(MemberRepository.class)
//    public MemberServiceImpl(final MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }


//    public MemberServiceImpl(final MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
