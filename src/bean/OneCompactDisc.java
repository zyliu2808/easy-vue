package bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import annotation.Cold;

@Component(value="cd1")
@Primary
@Cold
public class OneCompactDisc implements CompactDisc {

	private String name;
	
	public OneCompactDisc(String name) {
		super();
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

}
