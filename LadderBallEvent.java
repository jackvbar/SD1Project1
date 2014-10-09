package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class LadderBallEvent extends Event{
    int numRungs;

    public LadderBallEvent(String name, int playTo, boolean isPlayToExact, int playDistance) {
        super(name, playTo, isPlayToExact, playDistance);
    }

    public LadderBallEvent(){
        super("LadderBall", 21, true, 15);
    }
    @Override public String getExtraInfo(){
        return "One player on each team stands at each end of the playing area, the playing area is roughly 15 feet from\n" +
                "ladder to ladder. Each player tosses bolas toward the opposite ladder to score points until one team \n" +
                "reaches exactly 21 points. To determine which team goes first a quick game of rock-paper-scissors is \n" +
                "played. After the game has started the team that scored the last good point tosses first.";

}}


