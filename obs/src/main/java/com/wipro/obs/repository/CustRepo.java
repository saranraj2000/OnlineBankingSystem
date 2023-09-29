package com.wipro.obs.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.obs.entity.CustDetails;

@Repository
public interface CustRepo extends JpaRepository<CustDetails,String> {

}
