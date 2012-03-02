package com.jije.boh.core.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.Transaction;
import com.jije.boh.core.domain.model.FrmcDashboardCfg;
import com.jije.boh.core.domain.model.FrmcMenuCfg;

/**
 * @author devin.liu
 * @since 2012 02 29
 * @version 1.0 description: FrmcDashboardCfg Repository
 * 
 **/
@Transactional
public interface FrmcDashboardCfgRepository extends
		CrudRepository<FrmcDashboardCfg, String>, PagingAndSortingRepository<FrmcDashboardCfg, String> {
	


 

	}
