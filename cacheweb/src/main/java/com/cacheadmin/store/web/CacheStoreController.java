package com.cacheadmin.store.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cacheadmin.common.CacheStoreType;

@Controller
public class CacheStoreController {
	
	@RequestMapping("/stores")
	public List<String> supportedStores(){
		List<String> cacheStoreNames = new ArrayList<String>();
		
		// TODO It needs to be replaced and configurable through external file
		
		CacheStoreType[] stores = CacheStoreType.values();
		for (CacheStoreType cacheStore : stores) {
			cacheStoreNames.add(cacheStore.name());
		}
		return cacheStoreNames;
	}

}
