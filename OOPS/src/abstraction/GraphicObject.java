package abstraction;

public abstract class GraphicObject {
	
	int x,y;
	void moveTo(int newX,int newY)
	
	{
	System.out.println("move to X:"+x+ "move to y : " +y);
	}
	
	abstract void draw();
	abstract void resize();

}
