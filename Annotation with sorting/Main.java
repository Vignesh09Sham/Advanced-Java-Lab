import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.annotation.*;
import annotations.RequestMapping;
import annotations.RestController;
import annotations.sort;

public class Main{

	public String sorter() throws Throwable{
		Class<CustomController> controller = CustomController.class;
		Field[] fields = controller.getDeclaredFields();
		for(Field field : fields){
			sort sort = field.getAnnotation(sort.class);
			if(sort != null){
				CustomController obj = new CustomController();
				System.out.println(field.get(obj));
				System.out.println(sort.strategy());
			}
		}
		return null;
	}


	public static void main(String... args){
		try{
			new Main().sorter();
		}catch(Throwable e){

		}
	}

}