
public class Grid {
	static int m = 10;
	static int n = 10; 
	static int x;
	static int y; 
	static int [ ][ ]surface = new int [m][n];// fills surface with initial values of CLEAR or OBSTACLE 
	public static final int OBSTACLE = -1;
	// int strength; 
	 
	public static void main(String args[]) {
		//m = 10; n = 10;
		Spill(7,7,10);
		System.out.print(surface);
		
	}
	/*public Grid() {
		// TODO Auto-generated constructor stub
	}*/
	
	public static void Spill(int x, int y, int strength) {
				int cell = surface[x][y];
				if (strength == 0){
					return;
				}
				if (x<0 || x>=m ||  y<0 || y>=n){
					return;
				}
				if (cell == OBSTACLE){
					return;
				}
				if (cell < strength){
					surface[x][y] = strength;	
				}
				Spill(x-1,y-1,strength-1);
				Spill(x-1,y,strength-1);
				Spill(x-1,y+1,strength-1);
				Spill(x,y-1,strength-1);
				Spill(x,y+1,strength-1);
				Spill(x+1,y-1,strength-1);
				Spill(x+1,y,strength-1);
				Spill(x+1,y+1,strength-1);
			}

}
