package org.slf4j.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class LogFactory implements ILoggerFactory{
	ConcurrentMap<String, Logger> loggerMap;

	 public LogFactory() {
         loggerMap = new ConcurrentHashMap<String, Logger>();
 }

	
	public Logger getLogger(String name) {
		// TODO Auto-generated method stub
		
		Logger slf4jLogger = loggerMap.get(name);

        if (slf4jLogger != null) {

                return slf4jLogger;

        } else {
                Logger newInstance = new LogAdapter(name);

                // Logger oldInstance = loggerMap.putIfAbsent(name, newInstance);
                loggerMap.putIfAbsent(name, newInstance);
               // return oldInstance == null ? newInstance : oldInstance;
                return newInstance;
        }

	}
	

}
