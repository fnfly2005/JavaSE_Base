package io.demo;

import java.io.File;
import java.io.FileFilter;

public class FilterHiddenDemo implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		return pathname.isHidden();
	}

}
