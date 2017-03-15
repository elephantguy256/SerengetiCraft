package com.ac.util;

import org.apache.commons.codec.language.bm.Lang;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hyeanmod.main.ACMain;

/**
 * This is where useful methods will be
 *
 */
public class Utils {
	
	/**
	 * Makes the variables which will be initialized when there getter method is called
	 */
	private static Logger logger;
	private static Lang lang;
	
	/**
	 * Returns the logger. This makes System.our.println look shabby
	 * @return The {@link Logger}
	 */
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(ACMain.MODID);
		}
		return logger;
	}
	
	/**
	 * Returns the language for the mod.
	 * @return the {@link Lang}
	 */
}