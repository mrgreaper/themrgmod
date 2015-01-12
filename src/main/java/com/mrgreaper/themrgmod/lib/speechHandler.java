package com.mrgreaper.themrgmod.lib;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by david on 11/01/2015.
 */
public class speechHandler extends Thread{
    //hmmmm arghhhhhhhhhhhhhhhh
    private String message;
    private double voice;
    private float pitch;
    private float pitchRange;
    private float pitchShift;
    private String voiceName;

    public speechHandler(String messageIn,double voiceIn ,float pitchIn , float pitchRangeIn ,float pitchShiftIn){
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        this.message = messageIn;
        this.voice = voiceIn;
        this.pitch = pitchIn;
        this.pitchRange = pitchRangeIn;
        this.pitchShift = pitchShiftIn;
        if (voice==1){this.voiceName = "kevin";}else{this.voiceName = "kevin16";};
    }

    public void run(){
        Voice sayvoice;
        VoiceManager vm = VoiceManager.getInstance();
        sayvoice = vm.getVoice(this.voiceName);
        sayvoice.allocate();
        sayvoice.setPitch(this.pitch);
        sayvoice.setPitchRange(this.pitchRange);
        sayvoice.setPitchShift(this.pitchShift);
        sayvoice.speak(this.message);
    }
}
