package versachi;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Numsort 
{
	public static void main(String[] args) 
    {
        
        Integer[] arr = {1,8,3,2,4};
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
