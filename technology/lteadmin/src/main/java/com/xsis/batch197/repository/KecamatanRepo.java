package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.KecamatanModel;
import com.xsis.batch197.model.ProvinsiModel;

@Repository
public interface KecamatanRepo extends JpaRepository<KecamatanModel, Long> {
	
	@Query(value = "select max(kdKecamatan) from KecamatanModel")
	public String getMaxKode();
	
	public List<KecamatanModel> findByNmKecamatan(String nama);
	
	public List<KecamatanModel> findByKdKecamatan(String kode);
	
	@Query(value = "SELECT p FROM KecamatanModel p WHERE LOWER(p.nmKecamatan) LIKE CONCAT('%',LOWER(:nama),'%')")
	public List<KecamatanModel> search(@Param("nama") String nama);
}