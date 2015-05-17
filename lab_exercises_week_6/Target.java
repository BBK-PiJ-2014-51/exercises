import java.io.BufferedReader;
import java.io.InputStreamReader;

class Target{
	int[][][] cube;
	int dimens;
	int targetX;
	int targetY;
	int targetZ;
	
	public Target(int dimens){
		cube = new int[dimens][dimens][dimens];
		this.dimens = dimens;
		init();
		
	}
	
	public Result fire(int x, int y, int z){
		
		if (x > dimens || y > dimens || z > dimens){
			return Result.OUT_OF_RANGE;
		} else if (x != targetX){
			return (x > targetX) ? Result.FAIL_RIGHT : Result.FAIL_LEFT;
		} else if ( y != targetY){
			return (y > targetY) ? Result.FAIL_LONG : Result.FAIL_SHORT;
		} else if (z != targetZ){
			return (z > targetZ) ? Result.FAIL_HIGH : Result.FAIL_LOW;	
		}
		return Result.HIT;
	}
	
	private void init(){
		for (int i = 0; i < dimens; i++){
			for (int j = 0; j < dimens; j++){
				for (int k = 0; k < dimens; k++){
					cube[i][j][k] = 0;
				}
			}
		}
		targetX = (int) Math.abs(dimens * Math.random());
		targetY = (int) Math.abs(dimens * Math.random());
		targetZ = (int) Math.abs(dimens * Math.random());
		cube[targetX][targetY][targetZ] = 1;
	}
}