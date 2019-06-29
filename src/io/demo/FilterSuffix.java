package io.demo;

import java.io.File;
import java.io.FilenameFilter;

public class FilterSuffix implements FilenameFilter {

	private String Suffix;
	public FilterSuffix(String Suffix) {
		// TODO Auto-generated constructor stub
		this.Suffix = Suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(Suffix);
	}

}
