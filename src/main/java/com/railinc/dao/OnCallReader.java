package com.railinc.dao;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.railinc.entities.OnCall;

public class OnCallReader {

	public static List<OnCall> readFile(File csvFile) throws Exception {
		MappingIterator<OnCall> onCallIter = new CsvMapper().readerWithTypedSchemaFor(OnCall.class).readValues(csvFile);

		return onCallIter.readAll();
	}
}
