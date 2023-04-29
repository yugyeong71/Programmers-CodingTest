package org.example.Lv0;

/*
    Lv 0. 개미 군단
*/
public class AntArmy {

    public int solution(int hp) {
        return (hp / 5) + (hp % 5) / 3 + ((hp % 5) % 3) / 1;
    }

}
