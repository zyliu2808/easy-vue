package bean;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Aspectdecla {
	
	@Pointcut("execution(* com.bean.compach.play(int)) && args(count)")
	public void perfor(int count){};
	
	@Around("perfor(int count)")
	public void do_per(int count) {
		
	}
	
	@DeclareParents(value="com.aa+",defaultImpl=CdPlayer.class)
	public static CdPlayer cdPlayers;

}
