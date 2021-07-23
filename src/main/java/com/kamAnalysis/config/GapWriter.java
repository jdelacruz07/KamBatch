package com.kamAnalysis.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class GapWriter implements ItemWriter<Gap> {

	@Autowired
	private GapRespository gapRespository;

	@Override
	public void write(List<? extends Gap> items) throws Exception {
		System.out.println("Gaps en el writer" + items);
		gapRespository.saveAll(items);
	}

}
