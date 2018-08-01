package com.example.pc.mtmusicplayer;



public class PlayListClass  {

    private String msinger;
    private String msongname;

    public PlayListClass (String songname,String singer) {
        msinger = singer;
        msongname = songname;
    }

    public String getsongname() {
        return msongname;
    }

    public String getsinger() {
        return msinger;
    }
}
