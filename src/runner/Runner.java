package runner;

import math.Matrix4;
import math.Quaternion;
import math.Vector2;
import math.Vector3;
import math.Vector4;
import renderEngine.Display;

public class Runner {

	Display display;
	
	public Runner() {
		display = new Display(720, 720);
		display.clearBackBuffer(0, 0, 0, 1);
		//display.renderTriangle(new Vector2(1f, 0f), new Vector2(-1f, 0f), new Vector2(0f, 1f), new Vector4(255f, 0, 0, 255f));		
		display.swapBuffers();
		Matrix4 mat4Up = new Matrix4(1);
		//mat4Up.matrix[0][3] = .5f;
		//display.renderTransformedTriangle(mat4Up,new Vector2(.5f, 0f), new Vector2(-.5f, 0f), new Vector2(0f, .5f), new Vector4(255f, 0, 0, 255f));

		//display.swapBuffers();
		float r =0;
	while(true) {
		//for (int i = 1; i < 360; i++) {
			display.clearBackBuffer(0, 0, 0, 1);
			
			//Good:
			Quaternion q = Quaternion.rotationToQuaternion(new Vector3(0,0,1), r);
			r+= 0.01f;
			if(r >= 360) 
			{
				r = 0;
			}
			//Bad?:
			mat4Up = q.toMatrix();
	
			//Bad?:
			display.renderTransformedTriangle(mat4Up,new Vector3(.5f, 0f,0f), new Vector3(-.5f, 0f,0f), new Vector3(0f, .5f,0f), new Vector4(255f, 0, 0, 255f));

			display.swapBuffers();
		}
		
		
	
		//}
		//Matrix4 mat4Up = new Matrix4(1);
		//new float[][] {new float[]{1,0,0,0}, new float[]{0,1,0,0}, new float[]{0,0,1,0}, new float[]{0,0,0,1}};
		//mat4Up.matrix[3][1] = .5f;
		
		//display.renderTransformedTriangle(mat4Up,new Vector2(.5f, 0f), new Vector2(-.5f, 0f), new Vector2(0f, .5f), new Vector4(255f, 0, 0, 255f));
		
		//display.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Runner();
	}
	
}