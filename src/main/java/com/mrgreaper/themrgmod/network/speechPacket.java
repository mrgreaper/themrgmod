package com.mrgreaper.themrgmod.network;

import com.mrgreaper.themrgmod.themrgmod;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by david on 11/01/2015.
 */
public class speechPacket implements IMessage {
    private String message;
    private double voice;
    private float pitch;
    private float pitchRange;
    private float pitchShift;
    //private String voiceName;

    public speechPacket(){} //without this blank one the packet crashes ...why do we need it? arghhhhhhhhhh



    public speechPacket(String message,double voice,float pitch, float pitchRange, float pitchShift ){
        this.message=message;
        this.voice=voice;
        this.pitchRange = pitchRange;
        this.pitch = pitch;
        this.pitchShift= pitchShift;
    }

    @Override
    public void fromBytes(ByteBuf buf) { // so we will need an nbt tag to store the info we want to send...here we read it
        NBTTagCompound tag = ByteBufUtils.readTag(buf);
        message = tag.getString("message");
        voice = tag.getDouble("voice");
        pitch = tag.getFloat("pitch");
        pitchRange = tag.getFloat("pitchRange");
        pitchShift = tag.getFloat("pitchShift");

    }

    @Override
    public void toBytes(ByteBuf buf) { //and here we create it
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("message",message);
        tag.setDouble("voice",voice);
        tag.setFloat("pitch",pitch);
        tag.setFloat("pitchRange",pitchRange);
        tag.setFloat("pitchShift",pitchShift);
        ByteBufUtils.writeTag(buf, tag);
    }

    public static class speechPacketHandler implements IMessageHandler <speechPacket,IMessage> { //so dont lile classes inside classes but everything i read suggests this is the way to go...still grrrrrr
        @Override
        public IMessage onMessage(speechPacket message, MessageContext ctx) {
            themrgmod.proxy.speechCreate(message.message,message.voice,message.pitch,message.pitchRange,message.pitchShift);
            return null;
        }
    }
}
