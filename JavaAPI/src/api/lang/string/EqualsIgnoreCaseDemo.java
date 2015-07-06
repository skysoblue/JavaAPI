package api.lang.string;
/*
 * @ Date   : 2015.05
 * @ Author : coolbeat@naver.com
 * @ Title  : equalsIgnoreCase(s)
 * @ Story  : java.lang.String 의 메소드로
 * 				대소문자 구분없이 비교하라
 * */
public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		// 비교 대상이 대소문자 차이점까지 비교한다.
		System.out.println(
				"Hello".equals("hello") ? "같습니다." : "다릅니다."
				);
		// 비교 대상의 대소문자 차이를 두지 않는다.
		// 대소문자 구별이 없다.
		System.out.println(
				"Hello".equalsIgnoreCase("hello") ? "같습니다." : "다릅니다."
				);
	}
}
