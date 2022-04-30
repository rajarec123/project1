package com.Springrest.repository;

import org.springframework.data.repository.CrudRepository;
import com.Springrest.modal.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord,String>{

}
