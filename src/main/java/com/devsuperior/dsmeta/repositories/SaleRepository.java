package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	/*Relatório com JPQL Sem otimizar
	/*
	@Query("SELECT obj "
		   + "FROM Sale obj "
		   + "WHERE obj.date BETWEEN :minDate AND :maxDate "
		   + "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%')) ")
	Page<Sale> search1(LocalDate minDate, LocalDate maxDate, String name, Pageable pageable);
	*/
	
	
	
	/*Relatório Com a consulta otimizada Com JOIN FETCH */
	@Query(value = "SELECT obj FROM Sale obj JOIN FETCH obj.seller "
			   + "WHERE obj.date BETWEEN :minDate AND :maxDate "
			   + "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%')) ",
			   countQuery = "SELECT COUNT(obj) FROM Sale obj JOIN obj.seller "
					   + "WHERE obj.date BETWEEN :minDate AND :maxDate "
					   + "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%')) ")
		Page<Sale> search1(LocalDate minDate, LocalDate maxDate, String name, Pageable pageable);
	
	
		
	
	
	
}
