package api.lang.string;
/*
 * @ Date   : 2015.05
 * @ Author : coolbeat@naver.com
 * @ Title  : endWith(s) 
 * @ Story  : java.lang.String 
 * 				endWith(s) : s 로 끝나는 지 여부 체크
 * */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
			"Hello.txt".endsWith("txt") ? "txt 파일입니다." : "txt 파일이 아닙니다."	
				);
	}
}
