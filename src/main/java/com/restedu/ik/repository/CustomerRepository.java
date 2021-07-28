package com.restedu.ik.repository;

import com.restedu.ik.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link com.restedu.ik.model.Customer class}
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
