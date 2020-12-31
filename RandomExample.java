
public class RandomExample {

	public static void main(String[] args) {
		
		//난수 (랜덤값)을 발생시키는 메서드 random()
		//0.0이상 1.0미만의 랜덤 실수값을  (real value) 가져옴. 
		double r = Math.random();
		System.out.println("랜덤값: " + r);
		
		//정수 난수 생성하기
		int rn = (int)(r * 10);
		System.out.println("정수 난수값: " + rn);
		System.out.println("-------------------");
		
		System.out.println("*** 신년 여행지 선정! ***");
		if (r > 0.66) {
			System.out.println("모로코로 갑시다!!");
		} else if (r > 0.33) {
			System.out.println("상하이로 갑시다!!");
		} else {
			System.out.println("집에서 놉시다!!");
		}

	}

}
