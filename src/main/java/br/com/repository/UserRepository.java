/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.model.User;

/**
 * @author carlosbgf
 *
 */

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	 User findByEmail(String email);
	 
	 User findByName(String name);
}