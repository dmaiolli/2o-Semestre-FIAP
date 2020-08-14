package ArrayList;
import java.util.function.Consumer;

public class ShowNumbers implements Consumer<Integer>{

	@Override
	public void accept(Integer numero) {
		System.out.printf("%d ", numero);
	}

}