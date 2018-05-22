package com.sageit.cloning;

public class Task implements Cloneable {

	private Employee e;

	private String name;

	private String status;

	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() {

		Task task = null;

		try {
			task = (Task) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		task.e = (Employee) e.clone();

		return task;

	}

	@Override
	public String toString() {
		return "Task [e=" + e + ", name=" + name + ", status=" + status + "]";
	}

}
