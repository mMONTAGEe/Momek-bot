/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.montage.bot;

import com.romvoid.config.COption;

public class Config {
	
	@COption
	public static String BOT_TOKEN = "";
	
	@COption
	public static String BOT_COMMAND_PREFIX = "!";
	
	@COption
	public static String WEBHOOK_URL = "place-url-here";
	
	@COption
	public static String PATTERN = "[%d{HH:mm:ss}] [%level] %logger{0}: %msg%n";
	
	@COption
	public static boolean WEBOOK_CONSOLE = false;
	
	@COption
	public static String BOT_GUILD_ID = "NOT-USED-YET";
	
	@COption
	public static String JOIN_CHANNEL_ID = "join-channel-id";
	
	@COption
	public static String LEAVE_CHANNEL_ID = "leave-channel-id";
}