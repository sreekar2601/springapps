package com.springapps_springcore.locations;

import java.util.Properties;

public class locations {
	private Properties dialect;

	public Properties getDialect() {
		return dialect;
	}

	public void setDialect(Properties dialect) {
		this.dialect = dialect;
	}

	@Override
	public String toString() {
		return "locations [dialect=" + dialect + "]";
	}

}
