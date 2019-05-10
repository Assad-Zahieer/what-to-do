package assad.z.repository;

import assad.z.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepositry extends JpaRepository<User, Long> {
}
