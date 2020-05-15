package com.jkt.training.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Leave implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int used,remaining;
	String type;
	
	public Leave() {}
	
	public Leave(int used, int remaining, String type) 
	{
		this.used = used;
		this.remaining = remaining;
		this.type = type;
	}
	
	public int getUsed() {
		return used;
	}

	public int getRemaining() {
		return remaining;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + remaining;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + used;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leave other = (Leave) obj;
		if (remaining != other.remaining)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (used != other.used)
			return false;
		return true;
	}
	
	
}
