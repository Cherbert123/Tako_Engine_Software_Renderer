package math;

public class Vector3 {

	public float x;
	public float y;
	public float z;

	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void add(Vector3 v) {
		x += v.x;
		y += v.y;
		z += v.z;
	}

	public void sub(Vector3 v) {
		x -= v.x;
		y -= v.y;
		z -= v.z;
	}

	public void mult(Vector3 v) {
		x *= v.x;
		y *= v.y;
		z *= v.z;
	}

	public void div(Vector3 v) {
		x /= v.x;
		y /= v.y;
		z /= v.z;
	}

	public float length() {
		return (float) Math.sqrt(x * x + y * y + z * z);
	}

	public void normalize() {
		this.x = x / length();
		this.y = y / length();
		this.z = z / length();

	}

}
