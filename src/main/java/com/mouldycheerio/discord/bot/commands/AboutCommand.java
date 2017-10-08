package com.mouldycheerio.discord.bot.commands;

import com.mouldycheerio.discord.bot.MyBot;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IMessage;

public class AboutCommand extends BotCommand {
    public AboutCommand() {
        setName("about");
        setDescription(new CommandDescription("about", "Info About The Bot And Owners Of The Bot.", "about"));
    }

    public void onCommand(MyBot orangepeel, IDiscordClient client, IMessage commandMessage, String[] args) {
        commandMessage.getChannel().sendMessage("Adii-Bot. This is a bot, created by Adii#8807, and davidovski#8648. Contact them for help or further info.");

    }
}
