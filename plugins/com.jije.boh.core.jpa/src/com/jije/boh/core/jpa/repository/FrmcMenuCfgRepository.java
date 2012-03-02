package com.jije.boh.core.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.model.FrmcMenuCfg;

/**
 * @author devin.liu
 * @since 2012 02 29
 * @version 1.0 description: FrmcMenuCfgRepository Repository
 * 
 **/
@Transactional
public interface FrmcMenuCfgRepository extends
		CrudRepository<FrmcMenuCfg, String>, PagingAndSortingRepository<FrmcMenuCfg, String>{

	 
}
