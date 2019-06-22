package com.xsis.batch197.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xsis.batch197.model.XBiodataModel;

public interface XPelamarPagingRepo extends PagingAndSortingRepository<XBiodataModel, Long> {

}
