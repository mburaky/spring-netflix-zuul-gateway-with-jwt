package com.justmop.zuulwithjwt.repository;

import com.justmop.zuulwithjwt.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    Optional<Client> findOneByPhone(String phoneNumber);
}
