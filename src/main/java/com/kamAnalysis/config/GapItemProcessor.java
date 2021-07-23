package com.kamAnalysis.config;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class GapItemProcessor implements ItemProcessor<GapDetails, Gap> {

	private static final Logger log = LoggerFactory.getLogger(GapItemProcessor.class);

	@Override
	public Gap process(final GapDetails gapDetails) throws Exception {
		final String isClose = gapDetails.getIsGapClose();
		final Date dateSelected = gapDetails.getDateSelected();

		final Gap transformedGap = new Gap(isClose, dateSelected);

		log.info("Converting (" + gapDetails + ") into (" + transformedGap + ")");

		return transformedGap;
	}

}
