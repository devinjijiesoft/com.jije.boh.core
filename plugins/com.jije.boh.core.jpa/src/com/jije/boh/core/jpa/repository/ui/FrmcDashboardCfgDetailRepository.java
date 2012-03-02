package com.jije.boh.core.jpa.repository.ui;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.ui.FrmcDashboardCfg;
import com.jije.boh.core.domain.ui.FrmcDashboardCfgDetail;

/**
 * @author devin.liu
 * @since 2012 02 29
 * @version 1.0 description: FrmcDashboardCfg Repository
 * 
 **/
@Transactional
public interface FrmcDashboardCfgDetailRepository extends
		CrudRepository<FrmcDashboardCfgDetail, String>, PagingAndSortingRepository<FrmcDashboardCfgDetail, String>  {

 
}
