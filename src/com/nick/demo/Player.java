package com.nick.demo;

// TODO - GET / SET within the actual class!

public class Player {

    private int score;

    public void addFivePoints(){
        // score += 5;
        setScore(score+5);
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {

        if(score >= 500){
            System.out.println("Score is way too high");
            return;
        }

        this.score = score;
    }
}
