package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.KotaModel;
import com.xsis.batch197.model.ProvinsiModel;

@Repository
public interface KotaRepo extends JpaRepository<KotaModel, Long> {
	
	@Query(value="select max(kdKota) from KotaModel")
	public String getMaxKode();
	
	public List<KotaModel> findByNmKota(String nama);
	
	public List<KotaModel> findByKdKota(String kode);
	
	@Query(value = "SELECT p FROM KotaModel p WHERE LOWER(p.nmKota) LIKE CONCAT('%',LOWER(:nama),'%')")
	public List<KotaModel> search(@Param("nama") String nama);
}
