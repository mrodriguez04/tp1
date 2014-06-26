package org.slf4j.impl;

import ar.fiuba.tecnicas.tp1.logger.*;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class LogAdapter implements Logger{
	private Logeable log;
	
		
	public LogAdapter(String name){
		this.log = Logeable.getInstance(name);
		
	}
	/*
	public LogAdapter(Logeable master){
		this.log = master;
	}*/

	public void debug(String arg0) {
		// TODO Auto-generated method stub
		log.debug(arg0);
		
	}

	public void debug(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void debug(Marker arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void debug(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void debug(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		
	}

	public void debug(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub
		
	}

	public void error(String arg0) {
		// TODO Auto-generated method stub
		log.error(arg0);
	}

	public void error(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void error(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

	public void error(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void error(Marker arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void error(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void error(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void error(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		
	}

	public void error(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void info(String arg0) {
		// TODO Auto-generated method stub
		log.info(arg0);
		
	}

	public void info(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void info(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

	public void info(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void info(Marker arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void info(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void info(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void info(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		
	}

	public void info(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDebugEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isErrorEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInfoEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTraceEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isWarnEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void trace(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Marker arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String arg0) {
		// TODO Auto-generated method stub
		log.warn(arg0);
		
	}

	public void warn(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String arg0, Object... arg1) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String arg0, Throwable arg1) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Marker arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		
	}

	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub
		
	}
	
	

}
