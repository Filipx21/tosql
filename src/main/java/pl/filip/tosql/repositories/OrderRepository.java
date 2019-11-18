package pl.filip.tosql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.filip.tosql.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
