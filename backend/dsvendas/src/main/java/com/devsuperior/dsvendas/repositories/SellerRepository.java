package com.devsuperior.dsvendas.repositories;

import com.devsuperior.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
