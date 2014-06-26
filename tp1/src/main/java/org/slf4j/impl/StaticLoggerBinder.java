package org.slf4j.impl;
import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {
	 private final ILoggerFactory loggerFactory;

     private static final String loggerFactoryClassStr = LogFactory.class.getName();

     private StaticLoggerBinder() {
             loggerFactory = new LogFactory();
     }
     
     
     
     public ILoggerFactory getLoggerFactory() {
             return loggerFactory;
     }


     public String getLoggerFactoryClassStr() {
             return loggerFactoryClassStr;
     }
	

}
