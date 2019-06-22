package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.XMenutreeModel;

@Repository
public interface XMenutreeRepo extends JpaRepository<XMenutreeModel, Long> {
	
	 // public List<XMenutreeModel> findAllOrderByTitleAsc(String title);

}
