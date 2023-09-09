package com.example.lab4_20193315.repository;


import com.example.lab4_20193315.entity.Employees;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM employees where first_name like ?1 or last_name = ?1 ")
    List<Employees> findByName(String textoIngreso);
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE employees SET phone_number = ?1 WHERE ShipperID = ?2")
    void actualizarTelefonoYPostal(String phone, int shipperId);


}
