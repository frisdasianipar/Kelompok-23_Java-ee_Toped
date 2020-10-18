package del.ac.id.demo.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;

import del.ac.id.demo.jpa.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);
}
