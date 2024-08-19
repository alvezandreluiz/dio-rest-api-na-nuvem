package dio_rest_api_na_nuvem.service;

import dio_rest_api_na_nuvem.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
