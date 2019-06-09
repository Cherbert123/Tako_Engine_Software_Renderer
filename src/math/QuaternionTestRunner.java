package math;

public class QuaternionTestRunner {
//Not for Use, Charlie will Delete me soon
	public static void main(String[] args) {
		QuaternionTestRunner runner = new QuaternionTestRunner();
		runner.run();
	}
	public void run() 
	{
		Quaternion q1 = new Quaternion(1,1,2,1);
		Quaternion q2 = new Quaternion(1,1,1,1);
		System.out.println(Quaternion.multiply(q1, q2).q0);
		System.out.println(Quaternion.multiply(q1, q2).q1);
		System.out.println(Quaternion.multiply(q1, q2).q2);
		System.out.println(Quaternion.multiply(q1, q2).q3);
	}
}
