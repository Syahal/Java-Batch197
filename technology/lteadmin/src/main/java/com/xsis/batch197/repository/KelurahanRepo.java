package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.KelurahanModel;
import com.xsis.batch197.model.ProvinsiModel;

@Repository
public interface KelurahanRepo extends JpaRepository<KelurahanModel, Long> {

	@Query(value = "select max(kdKelurahan) from KelurahanModel")
	public String getMaxKode();

	public List<KelurahanModel> findByNmKelurahan(String nama);

	public List<KelurahanModel> findByKdKelurahan(String kode);

	@Query(value = "SELECT p FROM KelurahanModel p WHERE LOWER(p.nmKelurahan) LIKE CONCAT('%',LOWER(:nama),'%')")
	public List<KelurahanModel> search(@Param("nama") String nama);
}