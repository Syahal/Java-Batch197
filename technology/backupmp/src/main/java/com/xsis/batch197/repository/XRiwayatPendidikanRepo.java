package com.xsis.batch197.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xsis.batch197.model.XRiwayatPendidikanModel;

@Repository
public interface XRiwayatPendidikanRepo extends JpaRepository<XRiwayatPendidikanModel, Long> {

}
