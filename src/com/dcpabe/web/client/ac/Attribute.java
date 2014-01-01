package com.dcpabe.web.client.ac;

public class Attribute extends TreeNode {
	private static final long serialVersionUID = 1L;
	private String name;
	private int x;
	
	public Attribute(){}
	
	public Attribute(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + x;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Attribute))
			return false;
		Attribute other = (Attribute) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (x != other.x)
			return false;
		return true;
	}
}
