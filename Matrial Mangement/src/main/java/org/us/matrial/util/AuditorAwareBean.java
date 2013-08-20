package org.us.matrial.util;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareBean implements AuditorAware<String>{
	
	@Override
	public String getCurrentAuditor() {
		// TODO Auto-generated method stub
		return "adilramdan";
	}

}
