package com.plugin.lootDropStats;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LootDropStatsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LootDropStatsPlugin.class);
		RuneLite.main(args);
	}
}