package kr.ac.hansung.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
		@Pointcut("execution(void kr.ac.hansung.spring.aop.*.sound())")
		private void selectSound(){ // 함수 이름이 곧 Bean.xml에서 포인트컷의 id값 (Signature)
		}
		
		@Before("selectSound()") //Before Advice
		public void aboutToSound() {
			System.out.println("before: about to sound");
		}
}
