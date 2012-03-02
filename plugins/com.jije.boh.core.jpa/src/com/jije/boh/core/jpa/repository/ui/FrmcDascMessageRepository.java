package com.jije.boh.core.jpa.repository.ui;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.jije.boh.core.domain.ui.FrmcDascMessage;;

/**
 * @author devin.liu
 * @since 2012 02 29
 * @version 1.0 description: FrmcDashboardCfg Repository
 * 
 **/
@Transactional
public interface FrmcDascMessageRepository extends
		CrudRepository<FrmcDascMessage, String> {

 
}
