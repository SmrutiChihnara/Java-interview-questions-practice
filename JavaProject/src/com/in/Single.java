package com.in;

import java.io.Serializable;
abstract class Demo
{
	final public abstract void getadat();
}
public class Single implements Serializable {
	public static Single getInstance;

	private Single() {
		if (getInstance != null) {
			throw new IllegalStateException("Object can not create using refecction");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new CloneNotSupportedException();
	}

	private Object readResolve() {
		return getInstance;
	}

	public static Single getInstance() {
		if (getInstance == null) {
			getInstance = new Single();
			return getInstance;
		} else {
			return getInstance;
		}
	}
}
