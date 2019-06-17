package mil.af.anq10_api.member.repository;

import mil.af.anq10_api.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByUsername(String username);

    public Member findByEmail(String email);

}
