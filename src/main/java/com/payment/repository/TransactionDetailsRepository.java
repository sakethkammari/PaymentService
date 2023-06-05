package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.entity.TranscationDetails;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TranscationDetails, Long>{
	TranscationDetails findByOrderId(long orderId);
}
