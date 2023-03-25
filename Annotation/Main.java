import java.lang.reflect.Method;
import java.lang.annotation.*;
import annotations.RequestMapping;
import annotations.RestController;

public class Main{
	public String execute() throws Throwable{
		Class<CustomController> controller = CustomController.class;
		RestController restController = controller.getAnnotation(RestController.class);

		if(restController != null){
			Method[] methods = controller.getMethods();
			for(Method method : methods){
				RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
				if(requestMapping.invoke()){
					if(requestMapping != null){
						method.invoke(controller.newInstance());	
					}
				}
			}
		}
		return null;
	}

	public static void main(String... args){
		try{
			new Main().execute();
		}catch(Throwable e){

		}
	}
}