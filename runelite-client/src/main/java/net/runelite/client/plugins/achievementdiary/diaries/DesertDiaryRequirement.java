/*
 * Copyright (c) 2018, Marshall <https://github.com/marshdevs>
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.achievementdiary.diaries;

import net.runelite.api.Skill;
import net.runelite.client.plugins.achievementdiary.GenericDiaryRequirement;
import net.runelite.client.plugins.achievementdiary.SkillRequirement;

public class DesertDiaryRequirement extends GenericDiaryRequirement
{
	public DesertDiaryRequirement()
	{
		// EASY
		add("Catch a Golden Warbler.",
			new SkillRequirement(Skill.HUNTER, 5));
		add("Mine 5 clay in the north-eastern desert.",
			new SkillRequirement(Skill.MINING, 5));
		add("Open the Sarcophagus in the first room of Pyramid Plunder.",
			new SkillRequirement(Skill.THIEVING, 21));

		// MEDIUM
		add("Climb to the summit of the Agility Pyramid.",
			new SkillRequirement(Skill.AGILITY, 30));
		add("Slay a desert lizard.",
			new SkillRequirement(Skill.SLAYER, 22));
		add("Catch an Orange Salamander.",
			new SkillRequirement(Skill.HUNTER, 47));
		add("Steal a feather from the Desert Phoenix.",
			new SkillRequirement(Skill.THIEVING, 25));
		add("Create a combat potion in the desert.",
			new SkillRequirement(Skill.HERBLORE, 36));
		add("Teleport to Pollnivneach with a redirected teleport to house tablet.",
			new SkillRequirement(Skill.CONSTRUCTION, 20));
		add("Chop some Teak logs near Uzer.",
			new SkillRequirement(Skill.WOODCUTTING, 35));

		// HARD
		add("Knock out and pickpocket a Menaphite Thug.",
			new SkillRequirement(Skill.THIEVING, 65));
		add("Mine some Granite.",
			new SkillRequirement(Skill.MINING, 45));
		add("Refill your waterskins in the Desert using Lunar magic.",
			new SkillRequirement(Skill.MAGIC, 68));
		add("Complete a lap of the Pollnivneach agility course.",
			new SkillRequirement(Skill.AGILITY, 70));
		add("Slay a Dust Devil with a Slayer helmet equipped.",
			new SkillRequirement(Skill.SLAYER, 65),
			new SkillRequirement(Skill.DEFENCE, 10),
			new SkillRequirement(Skill.CRAFTING, 55));
		add("Defeat a Locust Rider with Keris.",
			new SkillRequirement(Skill.ATTACK, 50));
		add("Burn some yew logs on the Nardah Mayor's balcony.",
			new SkillRequirement(Skill.FIREMAKING, 60));
		add("Create a Mithril Platebody in Nardah.",
			new SkillRequirement(Skill.SMITHING, 68));

		// ELITE
		add("Bake a wild pie at the Nardah Clay Oven.",
			new SkillRequirement(Skill.COOKING, 85));
		add("Cast Ice Barrage against a foe in the Desert.",
			new SkillRequirement(Skill.MAGIC, 94));
		add("Fletch some Dragon darts at the Bedabin Camp.",
			new SkillRequirement(Skill.FLETCHING, 95));
		add("Speak to the KQ head in your POH.",
			new SkillRequirement(Skill.CONSTRUCTION, 78));
		add("Steal from the Grand Gold Chest in the final room of Pyramid Plunder.",
			new SkillRequirement(Skill.THIEVING, 91));
		add("Restore at least 85 Prayer points when praying at the Altar in Sophanem.",
			new SkillRequirement(Skill.PRAYER, 85));
	}
}
