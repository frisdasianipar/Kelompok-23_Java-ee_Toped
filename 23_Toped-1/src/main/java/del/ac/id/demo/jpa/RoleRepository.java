package del.ac.id.demo.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;

import del.ac.id.demo.jpa.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	
	Role findByRole(String role);
}
