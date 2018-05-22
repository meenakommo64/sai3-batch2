package com.sageit.cloning;

public class ManagerService implements Cloneable {

	public ManagerService() {
		// TODO Auto-generated constructor stub
	}

	public void assignTasks() {

		Employee mark = new Employee();
		mark.setName("Mark");

		Task t1 = new Task();
		t1.setName("packing");
		t1.setStatus("NOTSTARTED");
		
		t1.setE(mark);

		Task t2 = (Task) t1.clone();

		t2.getE().setName("Rob");

		t2.setName("TidyUp");
		
		System.out.println("Original Task..." + t1 + "Cloned Task is.." + t2);

	}

	public static void main(String arg[]) throws CloneNotSupportedException {
		ManagerService ms = new ManagerService();
		/*ManagerService ms1 = (ManagerService) ms.clone();

		System.out.println("Original MS..." + ms + "Cloned MS is.." + ms1);*/

		ms.assignTasks();
	}

}
