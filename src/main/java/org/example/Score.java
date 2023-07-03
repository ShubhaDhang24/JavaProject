package org.example;

public class Score {
    int score = 65;

    public void getScore() {

        if (score > 55 && score < 64) {
            System.out.println("You are almost there..!");
        } else if (score > 65) {
            System.out.println("Hurray,You passed..!!");
        } else {
            System.out.println("Sorry, You didn't pass");
        }

    }

}
