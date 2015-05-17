
public class ArrayCopier {

	public static int[] copy(int[] src, int[] dst){
		
		for (int i = 0; i < dst.length; i++){
			if (i < src.length){
				dst[i] = src[i];
			} else {
				dst[i] = 0;
			}
		}
		return dst;
	}
	
}
