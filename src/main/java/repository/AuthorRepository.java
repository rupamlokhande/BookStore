package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
}