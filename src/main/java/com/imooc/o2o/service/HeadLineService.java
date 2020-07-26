package com.imooc.o2o.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imooc.o2o.entity.HeadLine;

public interface HeadLineService {
	List<HeadLine> getHeadLineList(HeadLine headLineCondition) throws IOException;

}
