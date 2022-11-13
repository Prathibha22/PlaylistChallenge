package io.zipcoder;

import java.util.*;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
       int forwardCount=0;
       int backwardCount=0;
        int index=startIndex;
        while(forwardCount<this.playList.length){
            if(this.playList[index].equals(selection))  break;
            forwardCount++;
            index++;
            if(index>playList.length-1) index=0;
        }
         index=startIndex;
        while(backwardCount<this.playList.length){
            if(this.playList[index].equals(selection))  break;
            backwardCount++;
            index--;
            if(index<0) index=playList.length-1;
        }
        if(forwardCount<=backwardCount) return forwardCount;
        return backwardCount;
    }
}
