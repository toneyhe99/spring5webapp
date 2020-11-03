package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Auther;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface AutherRepository extends CrudRepository<Auther, Long> {
}
