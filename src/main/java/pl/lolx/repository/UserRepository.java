package pl.lolx.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import pl.lolx.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
