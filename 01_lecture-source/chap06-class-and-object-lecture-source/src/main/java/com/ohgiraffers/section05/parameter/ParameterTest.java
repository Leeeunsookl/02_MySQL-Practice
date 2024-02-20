package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testParameterPrimaryType(int num) {

        System.out.println("매개변수로 전달 받은 값 : " + num);

    }

    public void testParameterPrimaryTypeArray(int[] iarr) {

        /* 필기.
        *   배열의 주소가 전달 될 것이다.
        *   즉 인자로 전달하는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열을 가리킨다.(얕은 복사)
        *  */
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testParameterClassType(RectAngle rectAngle) {

        /* 필기.
        *   인스턴스도 주소가 전달된다.
        *   즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는 동일한
        *   인스턴스를 가리킨다. (얕은 복사)
        *  */

        System.out.println("매개변수로 전달 받은 값 : " + rectAngle);



    }



}
