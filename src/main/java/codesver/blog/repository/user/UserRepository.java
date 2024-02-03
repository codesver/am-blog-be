package codesver.blog.repository.user;

import codesver.blog.data.entities.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByUsername(String username);

    User save(User user);
}
