package bean;

import org.springframework.stereotype.Component;

@Component
public class OneCompactDisc implements CompactDisc {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

}
