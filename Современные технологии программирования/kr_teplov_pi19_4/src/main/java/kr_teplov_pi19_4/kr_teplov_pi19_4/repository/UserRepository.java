package kr_teplov_pi19_4.kr_teplov_pi19_4.repository;

import kr_teplov_pi19_4.kr_teplov_pi19_4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
