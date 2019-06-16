package math;

public class Quaternion {
	
	public float q0;
	public float q1;
	public float q2;
	public float q3;
	
	//Build Quaternion
	public Quaternion(float x, float y, float z, float w)
	{
		//Sets 'q' values to values recieved when a Quaternion is created
		this.q0 = x; this.q1 = y; this.q2 = z; this.q3 = w;
	}
	
	public static Quaternion multiply(Quaternion q1, Quaternion q2)
	{
		// Multiply q1's 'q' variables by q2's 'q' variables (Do not touch please!)
		float w = q1.q3 * q2.q3 - q1.q0 * q2.q0 - q1.q1 * q2.q1 - q1.q2 * q2.q2;
		float x = q1.q3 * q2.q0 + q1.q0 * q2.q3 + q1.q1 * q2.q2 - q1.q2 * q2.q1;
		float y = q1.q3 * q2.q1 - q1.q0 * q2.q2 + q1.q1 * q2.q3 + q1.q2 * q2.q0;
		float z = q1.q3 * q2.q2 + q1.q0 * q2.q1 - q1.q1 * q2.q0 + q1.q2 * q2.q3;
		
		return new Quaternion(x,y,z,w);
	}
	
	public static Quaternion add(Quaternion q1, Quaternion q2)
	{
		return new Quaternion(q1.q0 + q2.q0,q1.q1 + q2.q1,q1.q2 + q2.q2,q1.q3 + q2.q3);
	}
	public Quaternion add(Quaternion q1) {
        return add(this, q1);
    }
	
	public static Quaternion subtract(Quaternion q1, Quaternion q2)
	{
		return new Quaternion(q1.q0 - q2.q0,q1.q1 - q2.q1,q1.q2 - q2.q2,q1.q3 - q2.q3);
	}
	public Quaternion subtract(Quaternion q1) {
        return subtract(this, q1);
    }
	
	
	public float length()
	{
		return (float)Math.sqrt(q0 * q0 + q1 * q1 + q2 * q2 + q3 *q3);
	}
	
	public void normalize()
	{
		float length = length();
		if (length == 0) {
            return;
        }
		q0 = q0 / length; q1 = q1 / length; q2 = q2 / length; q3 = q3 / length;
	
	}
	
	
}
