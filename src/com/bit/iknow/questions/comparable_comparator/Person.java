package com.bit.iknow.questions.comparable_comparator;

public class Person implements Comparable {
	private int id;
	private String name;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 */
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", " + (name != null ? "name=" + name : "") + "]";
	}

	@Override
	public int compareTo(Object object) {
		Person person = (Person) object;
		return (this.id < person.id) ? -1 : (this.id > person.id) ? 1 : 0;
	}

}
