package api.lang.math;
/*
 * @ Date   : 2015.05
 * @ Author : coolbeat@naver.com
 * @ Title  : java.lang.Math random()
 * @ Story  : [헤드퍼스트 예제] 세종류의 단어 목록 만들기
 * */
public class HeadFirstRandom {

    public static void main(String[] args) {
        //세종류의 단어 목록 만들기
        String[] flowerList = {"tulip", "calla", "iris", "rose" };
        String[] treeList = {"gumTree","pineTree","maple","oakTree"};
        String[] animalList = {"dog","cat","monkey","tiger"};
        //각 단어목록에 몇개가 들어있는지 확인
        System.out.println(flowerList.length);
        //난수 세개를 발생시키기
        int flowerRand = (int)(Math.random()*flowerList.length);
        int treeRand = (int)(Math.random()*treeList.length);
        int animalRand = (int)(Math.random()*flowerList.length);
        //구문작성
        String phrase = flowerList[flowerRand]+"\t" + treeList[treeRand]
                        +"\t"+ animalList[animalRand];
        System.out.println(phrase);
    }
} 