package assad.z.repository;

import assad.z.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long> {
//    List<Item>findbyUser(Long user_id);

}
