package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.BiodataModel;

@Repository
public interface BiodataRepo extends JpaRepository<BiodataModel, Long> {

	@Query(value = "select max(nik) from BiodataModel")
	public String getMaxKode();

	public List<BiodataModel> findByNik(String nik);

	public List<BiodataModel> findByNama(String nama);

	@Query(value = "SELECT b FROM BiodataModel b WHERE LOWER(b.nik) LIKE CONCAT('%',LOWER(:nik),'%') OR LOWER(b.nama) LIKE CONCAT('%',LOWER(:nama),'%')")
	public List<BiodataModel> search(@Param("nik") String nik);
}
