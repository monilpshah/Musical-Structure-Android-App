package com.example.pc.mtmusicplayer;



public class playlist_class {

    private String msinger;
    private String msongname;

    public playlist_class(String songname,String singer) {
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
