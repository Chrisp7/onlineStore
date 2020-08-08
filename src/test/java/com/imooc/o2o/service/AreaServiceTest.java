package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;

	@Test
	public void getAreaListTest() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals(3, areaList.size());
		cacheService.removeFromCache(areaService.AREALIST);
		areaService.getAreaList();
	}

}
