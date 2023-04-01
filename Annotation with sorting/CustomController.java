import java.util.*;
import annotations.*; 

@RestController(number=10)
public class CustomController {

	@sort(strategy="merge")
	List<Integer> list= new ArrayList<Integer>(Arrays.asList(1,5,2,3,9,0));

	// @RequestMapping(invoke = true)
	// public String method(){
	// 	System.out.println("Sairam0");
	// 	return "Sairam";
	// }

	// @RequestMapping
	// public String method1(){
	// 	System.out.println("Sairam8");
	// 	return "Sairam";
	// }

	// @RequestMapping(invoke = true)
	// public String method2(){
	// 	System.out.println("Sairam99");
	// 	return "Sairam";
	// }

}