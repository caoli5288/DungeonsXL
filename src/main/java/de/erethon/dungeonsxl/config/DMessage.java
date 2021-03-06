/*
 * Copyright (C) 2012-2019 Frank Baumann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.erethon.dungeonsxl.config;

import de.erethon.commons.config.Message;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * An enumeration of all messages. The values are fetched from the language file.
 *
 * @author Daniel Saukel
 */
public enum DMessage implements Message {

    ANNOUNCER_CLICK("Announcer_Click", "&4&l=> &6CLICK HERE TO JOIN &4&l<="),
    CMD_BREAK_PROTECTED_MODE("Cmd_Break_ProtectedMode", "&6You may not break blocks protected by DungeonsXL anymore."),
    CMD_BREAK_BREAK_MODE("Cmd_Break_BreakMode", "&6You may break a block protected by DungeonsXL."),
    CMD_CHAT_DUNGEON_CHAT("Cmd_Chat_DungeonChat", "&6You have entered the dungeon chat"),
    CMD_CHAT_NORMAL_CHAT("Cmd_Chat_NormalChat", "&6You are now in the public chat"),
    CMD_CHATSPY_STOPPED("Cmd_Chatspy_Stopped", "&6You stopped to spy the dungeon chat."),
    CMD_CHATSPY_START("Cmd_Chatspy_Start", "&6You started to spy the dungeon chat."),
    CMD_DELETE_BACKUPS("Cmd_Delete_Backups", "&6Do you wish to delete all saved backups as well?"),
    CMD_DELETE_SUCCESS("Cmd_Delete_Success", "&6Successfully deleted the map &4&v1&6."),
    CMD_DUNGEON_ITEM_INFO_DUNGEON("Cmd_DungeonItem_Info_Dungeon", "&6This item is a &4dungeon item&6."),
    CMD_DUNGEON_ITEM_INFO_GLOBAL("Cmd_DungeonItem_Info_Global", "&6This item is a &4global item&6."),
    CMD_DUNGEON_ITEM_SET_DUNGEON("Cmd_DungeonItem_Set_Dungeon", "&6Successfully made this item a &4dungeon item&6."),
    CMD_DUNGEON_ITEM_SET_GLOBAL("Cmd_DungeonItem_Set_Global", "&6Successfully made this item a &4global item&6."),
    CMD_ENTER_SUCCESS("Cmd_Enter", "&6The group &4&v1 &6successfully entered the game of the group &4&v2&6."),
    CMD_IMPORT_SUCCESS("Cmd_Import", "&6Successfully imported the world &4&v1&6."),
    CMD_INVITE_SUCCESS("Cmd_Invite_Success", "&6Player &4&v1&6 was successfully invited to edit the map &4&v2&6."),
    CMD_KICK_SUCCESS("Cmd_Kick_Success", "&6Successfully attempted to kick &4&v1&6."),
    CMD_LEAVE_SUCCESS("Cmd_Leave_Success", "&6You have successfully left your group!"),
    CMD_LIVES_GROUP("Cmd_Lives_Group", "&4&v1 &6have &4&v2 &6lives left."),
    CMD_LIVES_PLAYER("Cmd_Lives_Player", "&4&v1 &6has &4&v2 &6lives left."),
    CMD_MAIN_WELCOME("Cmd_Main_Welcome", "&7Welcome to &4Dungeons&fXL"),
    CMD_MAIN_LOADED("Cmd_Main_Loaded", "&eMaps: &o[&v1] &eDungeons: &o[&v2] &eLoaded: &o[&v3] &ePlayers: &o[&v4]"),
    CMD_MAIN_COMPATIBILITY("Cmd_Main_Compatibility", "&eInternals: &o[&v1] &eVault: &o[&v2] &eItemsXL: &o[&v3]"),
    CMD_MAIN_HELP("Cmd_Main_Help", "&7Type in &o/dxl help&r&7 for further information."),
    CMD_MSG_ADDED("Cmd_Msg_Added", "&6New Messages (&4&v1&6) added!"),
    CMD_MSG_UPDATED("Cmd_Msg_Updated", "&6Messages (&4&v1&6) updated!"),
    CMD_RELOAD_DONE("Cmd_Reload_Done", "&7Successfully reloaded DungeonsXL."),
    CMD_RELOAD_PLAYERS("Cmd_Reload_Players", "&4Warning: If you reload the plugin, all players will get kicked out of their game."),
    CMD_RENAME_SUCCESS("Cmd_Rename_Success", "&6Successfully renamed the map &4&v1&6 to &4&v2&6."),
    CMD_SAVE_SUCCESS("Cmd_Save_Success", "&6Map saved!"),
    CMD_UNINVITE_SUCCESS("Cmd_Uninvite_Success", "&4&v1&6's permission to edit the map &4&v2&6 has been removed successfully."),
    ERROR_BED("Error_Bed", "&4You cannot use a bed while in a dungeon!"),
    ERROR_CHEST_IS_OPENED("Error_ChestIsOpened", "&4This chest has already been opened."),
    ERROR_CMD("Error_Cmd", "&4Commands are not allowed while in a dungeon!"),
    ERROR_CMD_NOT_EXIST_1("Error_CmdNotExist1", "&4Command &6&v1&4 does not exist!"),
    ERROR_CMD_NOT_EXIST_2("Error_CmdNotExist2", "&4Please enter &6/dxl help&4 for help!"),
    ERROR_COOLDOWN("Error_Cooldown", "&4You can only enter this dungeon every &6&v1&4 hours!"),
    ERROR_DISPENSER("Error_Dispenser", "&4You cannot access this dispenser!"),
    ERROR_DROP("Error_Drop", "&4You cannot drop safe items"),
    ERROR_DUNGEON_NOT_EXIST("Error_DungeonNotExist", "&4This dungeon does not exist."),
    ERROR_ENDERCHEST("Error_Enderchest", "&4You cannot use an enderchest while in a dungeon!"),
    ERROR_IN_GROUP("Error_InGroup", "&4The player &6&v1&4 is already member of a group."),
    ERROR_JOIN_GROUP("Error_JoinGroup", "&4You have to join a group first!"),
    ERROR_LEAVE_DUNGEON("Error_LeaveDungeon", "&4You have to leave your current dungeon first!"),
    ERROR_LEAVE_GAME("Error_LeaveGame", "&4You have to leave your current game first!"),
    ERROR_LEAVE_GROUP("Error_LeaveGroup", "&4You have to leave your group first!"),
    ERROR_MSG_ID_NOT_EXIST("Error_MsgIdNotExist", "&4Messages with Id &6&v1&4 does not exist!"),
    ERROR_MSG_FORMAT("Error_MsgFormat", "&4Please use &6\" &4to mark the beginning and the end of the message!"),
    ERROR_MSG_NO_INT("Error_MsgNoInt", "&4The argument [id] has to include a number!"),
    ERROR_NAME_IN_USE("Error_NameInUse", "&4The name &6&v1 &4is already in use."),
    ERROR_NAME_TO_LONG("Error_NameToLong", "&4The name may not be longer than 15 characters!"),
    ERROR_NO_CONSOLE_COMMAND("Error_NoConsoleCommand", "&6/dxl &v1&4 cannot be executed as console!"),
    ERROR_NO_GAME("Error_NoGame", "&4You currently do not take part in a game."),
    ERROR_NO_ITEM_IN_MAIN_HAND("Error_NoItemInMainHand", "&4You do not have an item in your main hand."),
    ERROR_NO_LEAVE_IN_TUTORIAL("Error_NoLeaveInTutorial", "&4You cannot use this command in the tutorial!"),
    ERROR_NO_PERMISSIONS("Error_NoPermissions", "&4You do not have permission to do this!"),
    ERROR_NO_PLAYER_COMMAND("Error_NoPlayerCommand", "&6/dxl &v1&4 cannot be executed as player!"),
    ERROR_NO_PROTECTED_BLOCK("Error_NoDXLBlock", "&4This is not a block protected by DungeonsXL!"),
    ERROR_NO_REWARDS_LEFT("Error_NoRewardsLeft", "&4You do not have any item rewards left."),
    ERROR_NO_REWARDS_TIME("error.noRewardsTime", "&4You cannot receive rewards before &6&v1&4."),
    ERROR_NO_SUCH_GROUP("Error_NoSuchGroup", "&4The group &6&v1&4 does not exist!"),
    ERROR_NO_SUCH_MAP("Error_NoSuchMap", "&4The world &6&v1&4 does not exist!"),
    ERROR_NO_SUCH_PLAYER("Error_NoSuchPlayer", "&4The player &6&v1&4 does not exist!"),
    ERROR_NO_SUCH_RESOURCE_PACK("Error_NoSuchResourcePack", "&4The resource pack &6&v1 &4is not registered in the main configuration file!"),
    ERROR_NO_SUCH_SHOP("Error_NoSuchShop", "&4Shop &v1 &4not found..."),
    ERROR_NOT_CAPTAIN("Error_NotCaptain", "&4You are not the captain of your group!"),
    ERROR_NOT_IN_DUNGEON("Error_NotInDungeon", "&4You are not in a dungeon!"),
    ERROR_NOT_IN_GAME("Error_NotInGame", "&4The group &6&v1&4 is not member of a game."),
    ERROR_NOT_IN_GROUP("Error_NotInGroup", "&4The player &6&v1&4 is not member of the group &6&v2&v4."),
    ERROR_NOT_INVITED("Error_NotInvited", "&4You are not invited to the group &6&v1&4."),
    ERROR_NOT_SAVED("Error_NotSaved", "&4The map &6&v1&4 has not been saved to the &6DungeonsXL/maps/ &4folder yet!"),
    ERROR_BLOCK_OWN_TEAM("Error_BlockOwnTeam", "&4This block belongs to your own group."),
    ERROR_READY("Error_Ready", "&4Choose your class first!"),
    ERROR_REQUIREMENTS("Error_Requirements", "&4You don't fulfill the requirements for this dungeon!"),
    ERROR_SIGN_WRONG_FORMAT("Error_SignWrongFormat", "&4The sign is not written correctly!"),
    ERROR_TOO_MANY_INSTANCES("Error_TooManyInstances", "&4There are currently too many maps instantiated. Try it again in a few minutes!"),
    ERROR_TOO_MANY_TUTORIALS("Error_TooManyTutorials", "&4There are currently too many tutorials running. Try it again in a few minutes!"),
    ERROR_TUTORIAL_NOT_EXIST("Error_TutorialNotExist", "&4Tutorial dungeon does not exist!"),
    HELP_CMD_BREAK("Help_Cmd_Break", "/dxl break - Break a block protected by DungeonsXL"),
    HELP_CMD_CHAT("Help_Cmd_Chat", "/dxl chat - Change the chat mode"),
    HELP_CMD_CHATSPY("Help_Cmd_Chatspy", "/dxl chatspy - Dis/enables the spymode"),
    HELP_CMD_CREATE("Help_Cmd_Create", "/dxl create [name] - Creates a new dungeon map"),
    HELP_CMD_DELETE("Help_Cmd_Delete", "/dxl delete [name] - Deletes a dungeon map"),
    HELP_CMD_DUNGEON_ITEM("Help_Cmd_DungeonItem", "/dxl dungeonItem [true|false|info] - Sets the item stack in the player's hand to be one that cannot be taken out of a dungeon"),
    HELP_CMD_EDIT("Help_Cmd_Edit", "/dxl edit [map] - Edit an existing dungeon map"),
    HELP_CMD_ENTER("Help_Cmd_Enter", "/dxl enter ([joining group]) [target group] - Let the joining group enter the game of the target group"),
    HELP_CMD_ESCAPE("Help_Cmd_Escape", "/dxl escape - Leaves the current edit world without saving"),
    HELP_CMD_GAME("Help_Cmd_Game", "/dxl game - Shows information about the current game session"),
    HELP_CMD_GROUP("Help_Cmd_Group", "/dxl group - Shows group command help"),
    HELP_CMD_GROUP_CREATE("Help_Cmd_GroupCreate", "/dxl group create [group] - Creates a new group"),
    HELP_CMD_GROUP_DISBAND("Help_Cmd_GroupDisband", "/dxl group disband ([group]) - Disbands a group"),
    HELP_CMD_GROUP_INVITE("Help_Cmd_GroupInvite", "/dxl group invite [player]- Invites someone to your group"),
    HELP_CMD_GROUP_UNINVITE("Help_Cmd_GroupUninvite", "/dxl group uninvite [player] - Takes back an invitation to your group"),
    HELP_CMD_GROUP_JOIN("Help_Cmd_GroupJoin", "/dxl group join [group]- Join a group"),
    HELP_CMD_GROUP_KICK("Help_Cmd_GroupKick", "/dxl group kick [player] - Kicks a player"),
    HELP_CMD_GROUP_SHOW("Help_Cmd_GroupShow", "/dxl group show [group] - Shows a group"),
    HELP_CMD_HELP("Help_Cmd_Help", "/dxl help [page] - Shows the help page"),
    HELP_CMD_IMPORT("Help_Cmd_Import", "/dxl import [world] - Imports a world from the world container as a dungeon map"),
    HELP_CMD_INVITE("Help_Cmd_Invite", "/dxl invite [player] [dungeon] - Invite a player to edit a dungeon"),
    HELP_CMD_JOIN("Help_Cmd_Join", "/dxl join [announcement] - Opens the GUI to join a group in an upcoming game"),
    HELP_CMD_KICK("Help_Cmd_Kick", "/dxl kick [player] - Kicks the player out of his group and dungeon"),
    HELP_CMD_LEAVE("Help_Cmd_Leave", "/dxl leave - Leaves the current group and dungeon or edit world"),
    HELP_CMD_LIST("Help_Cmd_List", "/dxl list ([dungeon|map|loaded]) ([dungeon]) - Lists all dungeons"),
    HELP_CMD_LIVES("Help_Cmd_Lives", "/dxl lives [player] - Shows the lives a player has left"),
    HELP_CMD_MAIN("Help_Cmd_Main", "/dxl - General status information"),
    HELP_CMD_MSG("Help_Cmd_Msg", "/dxl msg [id] '[msg]' - Show or edit a message"),
    HELP_CMD_PLAY("Help_Cmd_Play", "/dxl play [name] - Allows the player to play a dungeon without a portal"),
    HELP_CMD_PORTAL("Help_Cmd_Portal", "/dxl portal ([material=portal])- Creates a portal that leads into a dungeon"),
    HELP_CMD_RELOAD("Help_Cmd_Reload", "/dxl reload - Reloads the plugin"),
    HELP_CMD_RENAME("Help_Cmd_Rename", "/dxl rename [old name] [new name] - Changes the name of a map to the new one. This command does NOT break dungeons that include this map."),
    HELP_CMD_REWARDS("Help_Cmd_Rewards", "/dxl rewards - Gives all left item rewards to the player"),
    HELP_CMD_RESOURCE_PACK("Help_Cmd_ResourcePack", "/dxl resourcepack [ID] - Downloads a resourcepack registered in the main configuration file; use 'reset' to reset"),
    HELP_CMD_SAVE("Help_Cmd_Save", "/dxl save - Saves the current dungeon"),
    HELP_CMD_STATUS("Help_Cmd_Status", "/dxl status - Shows the technical status of DungeonsXL"),
    HELP_CMD_SETTINGS("Help_Cmd_Settings", "/dxl settings ([edit|global|player])- Opens the settings menu"),
    HELP_CMD_TEST("Help_Cmd_Test", "/dxl test - Starts the game in test mode"),
    HELP_CMD_UNINVITE("Help_Cmd_Uninvite", "/dxl uninvite [player] [dungeon] - Uninvite a player to edit a dungeon"),
    HELP_DUNGEON_ITEM("Help_DungeonItem", "&6After finishing a game, &4dungeon items &6are removed from the player's inventory even if the respective dungeon setup in general allows to keep it."),
    HELP_GLOBAL_ITEM("Help_GlobalItem", "&6After finishing a game, &4global items &6can be taken out of dungeons if the respective dungeon setup in general allows to keep the inventory."),
    GROUP_BED_DESTROYED("Group_BedDestroyed", "&6The bed of the group &4&v1 &6has been destroyed by &4&v2&6!"),
    GROUP_CONGRATS("Group_Congrats", "&6Congratulations!"),
    GROUP_CONGRATS_SUB("Group_CongratsSub", "&l&4Your group &v1 &4won the match!"),
    GROUP_CREATED("Group_Created", "&4&v1&6 created the group &4&v2&6!"),
    GROUP_DEATH("Group_Death", "&4&v1 &6died. &4&v2 &6have &4&v3 &6lives left."),
    GROUP_DEATH_KICK("Group_DeathKick", "&4&v1 &6was kicked because &4&v2 &6have no lives left."),
    GROUP_DEFEATED("Group_Defeated", "&4The group &4v1 &6is defeated because it lost its last score point."),
    GROUP_DISBANDED("Group_Disbanded", "&4&v1&6 disbanded the group &4&v2&6."),
    GROUP_FLAG_CAPTURED("Group_FlagCaptured", "&4&v1&6 has captured the flag of the group &4&v2&6!"),
    GROUP_FLAG_LOST("Group_FlagLost", "&4&v1&6 died and lost &4&v2&6's flag."),
    GROUP_FLAG_STEALING("Group_FlagStealing", "&4&v1&6 is stealing the flag of the group &4&v2&6!"),
    GROUP_INVITED_PLAYER("Group_InvitedPlayer", "&4&v1&6 invited the player &4&v2&6 to the group &4&v3&6."),
    GROUP_JOINED_GAME("Group_JoinedGame", "&6Your group successfully joined the game."),
    GROUP_KILLED("Group_Killed", "&4&v1 &6was killed by &4&v2&6. &4&v3&6 have &4&v4 &6lives left."),
    GROUP_KILLED_KICK("Group_KilledKick", "&4&v1&6 was killed by &4&v2&6. &4&v3 have no lives left."),
    GROUP_LIVES_ADDED("Group_LivesAdded", "&6Your group received a bonus of &4&v1&6 lives."),
    GROUP_LIVES_REMOVED("Group_LivesRemoved", "&6Your group lost &4&v1&6 lives!"),
    GROUP_UNINVITED_PLAYER("Group_UninvitedPlayer", "&4&v1&6 took back the invitation for &4&v2&6 to the group &4&v3&6."),
    GROUP_KICKED_PLAYER("Group_KickedPlayer", "&4&v1&6 kicked the player &4&v2&6 from the group &4&v3&6."),
    GROUP_PLAYER_JOINED("Group_PlayerJoined", "&6Player &4&v1&6 has joined the group!"),
    GROUP_REWARD_CHEST("group.rewardChest", "&6Your group has found a reward chest."),
    GROUP_WAVE_FINISHED("Group_WaveFinished", "&6Your group finished wave no. &4&v1&6. The next one is going to start in &4&v2&6 seconds."),
    LOG_ERROR_DUNGEON_SETUP("Log_Error_DungeonSetup", "&4The setup of dungeon &6&v1&4 is incorrect. See https://github.com/DRE2N/DungeonsXL/wiki/dungeon-configuration for reference."),
    LOG_ERROR_MOB_ENCHANTMENT("Log_Error_MobEnchantment", "&4An error occurred while loading mob.yml: Enchantment &6&v1&4 doesn't exist!"),
    LOG_ERROR_MOBTYPE("Log_Error_MobType", "&4Error at loading mob.yml: Mob &6&v1&4 doesn't exist!"),
    LOG_ERROR_NO_CONSOLE_COMMAND("Log_Error_NoConsoleCommand", "&6/dxl &v1&4 can not be executed as console!"),
    LOG_ERROR_SIGN_SETUP("Log_Error_SignSetup", "&4A sign at &6&v1&4 is erroneous!"),
    LOG_GENERATE_NEW_WORLD("Log_GenerateNewWorld", "&6Generating new world..."),
    LOG_IMPORT_WORLD("Log_ImportWorld", "&6Importing world..."),
    LOG_KILLED_CORRUPTED_PLAYER("Log_KilledCorruptedPlayer", "&4Killed player &6&v1 &4because the data to restore his main inventory is corrupted :("),
    LOG_NEW_MAP("Log_NewDungeon", "&6Creating new map."),
    LOG_NEW_PLAYER_DATA("Log_NewPlayerData", "&6A new player data file has been created and saved as &v1."),
    LOG_WORLD_GENERATION_FINISHED("Log_WorldGenerationFinished", "&6World generation finished!"),
    MISC_NEXT_PAGE("Misc_NextPage", "&6&lNEXT PAGE"),
    MISC_NO("Misc_No", "&4[ NO ]"),
    MISC_OKAY("Misc_Okay", "&a[ OK ]"),
    MISC_PREVIOUS_PAGE("Misc_PreviousPage", "&6&lPREVIOUS PAGE"),
    MISC_UNLIMITED("Misc_Unlimited", "unlimited"),
    MISC_YES("Misc_Yes", "&a[ YES ]"),
    PLAYER_BLOCK_INFO("Player_BlockInfo", "&6Block ID: &2&v1"),
    PLAYER_CHECKPOINT_REACHED("Player_CheckpointReached", "&6Checkpoint reached!"),
    PLAYER_DEATH("Player_Death", "&4&v1 &6died and has &4&v2 &6lives left."),
    PLAYER_DEATH_KICK("Player_DeathKick", "&2&v1 &6lost his last life and was kicked."),
    PLAYER_FINISHED_DUNGEON("Player_FinishedDungeon", "&6You successfully finished the dungeon!"),
    PLAYER_FINISHED_FLOOR("Player_Finished_Floor", "&6You successfully finished the floor."),
    PLAYER_INVITED("Player_Invited", "&4&v1&6 invited you to the group &4&v2&6."),
    PLAYER_UNINVITED("Player_Uninvited", "&4&v1&6 took back your invitation to the group &4&v2&6."),
    PLAYER_JOIN_GROUP("Player_JoinGroup", "&6You successfully joined the group!"),
    PLAYER_KICKED("Player_Kicked", "&4You have been kicked out of the group &6&v1&4."),
    PLAYER_KILLED("Player_Killed", "&4&v1 &6was killed by &4&v2 &6and has &4&v3 &6lives left."),
    PLAYER_KILLED_KICK("Player_KilledKick", "&4&v1&6 was killed by &4&v2 &6and lost his last life."),
    PLAYER_LEAVE_GROUP("Player_LeaveGroup", "&6You have successfully left your group!"),
    PLAYER_LEFT_GROUP("Player_LeftGroup", "&6Player &4&v1&6 has left the Group!"),
    PLAYER_LIVES_ADDED("Player_LivesAdded", "&6Received a bonus of &4&v1&6 lives."),
    PLAYER_LIVES_REMOVED("Player_LivesRemoved", "&6You lost &4&v1&6 lives!"),
    PLAYER_LOOT_ADDED("Player_LootAdded", "&4&v1&6 have been added to your reward inventory!"),
    PLAYER_NEW_CAPTAIN("Player_NewCaptain", "&6You are now the new captain of your group."),
    PLAYER_OFFLINE("Player_Offline", "&Player &4&v1&6 went offline. In &4&v2&6 seconds he will autmatically be kicked from the dungeon!"),
    PLAYER_OFFLINE_NEVER("Player_OfflineNever", "&6The player &4&v1&6 went offline. He will &4not&6 be kicked from the dungeon automatically!"),
    PLAYER_PORTAL_ABORT("Player_PortalAbort", "&6Portal creation cancelled!"),
    PLAYER_PORTAL_INTRODUCTION("Player_PortalIntroduction", "&6Click the two edges of the portal with the wooden sword!"),
    PLAYER_PORTAL_CREATED("Player_PortalCreated", "&6Portal created!"),
    PLAYER_PORTAL_PROGRESS("Player_PortalProgress", "&6First edge successfully marked. You may now click at the other edge."),
    PLAYER_PROTECTED_BLOCK_DELETED("Player_ProtectedBlockDeleted", "&6Successfully removed the protection."),
    PLAYER_READY("Player_Ready", "&6You are now ready to start the dungeon."),
    PLAYER_SIGN_CREATED("Player_SignCreated", "&6Successfully created a dungeon sign."),
    PLAYER_SIGN_COPIED("Player_SignCopied", "&6Sign data copied."),
    PLAYER_TIME_LEFT("Player_TimeLeft", "&v1You have &6&v2 &v1seconds left to finish the dungeon!"),
    PLAYER_TIME_KICK("Player_TimeKick", "&2&v1&6's time expired."),
    PLAYER_TREASURES("Player_Treasures", "&1Treasures"),
    PLAYER_WAIT_FOR_OTHER_PLAYERS("Player_WaitForOtherPlayers", "&6Waiting for team members..."),
    REQUIREMENT_FEE("Requirement_Fee", "&6You have been charged &4&v1 &6for entering the dungeon."),
    REWARD_GENERAL("Reward_General", "&6You received &4&v1 &6for finishing the dungeon."),
    SETTINGS_ANNOUNCEMENTS_1("Settings_Announcements1", "&fToggles personal"),
    SETTINGS_ANNOUNCEMENTS_2("Settings_Announcements2", "&fgame announcements."),
    SETTINGS_BREAK_1("Settings_Break1", "&fAllows you to break blocks"),
    SETTINGS_BREAK_2("Settings_Break2", "&fprotected by DungeonsXL."),
    SETTINGS_CHAT_SPY1("Settings_ChatSpy1", "&fAllows you to receive"),
    SETTINGS_CHAT_SPY2("Settings_ChatSpy2", "&fall dungeon chat messages."),
    SETTINGS_TITLE("Settings_Title", "&4Settings: &o"),
    SETTINGS_TITLE_EDIT("Settings_Title_Edit", "Dungeon Setup"),
    SETTINGS_TITLE_GLOBAL("Settings_Title_Global", "Global Configuration"),
    SETTINGS_TITLE_PLAYER("Settings_Title_Player", "Player"),
    SIGN_END("sign.end", "&2END"),
    SIGN_FLOOR_1("sign.floor.1", "&2ENTER"),
    SIGN_FLOOR_2("sign.floor.2", "&2NEXT FLOOR"),
    SIGN_GLOBAL_FULL("sign.global.full", "&4FULL"),
    SIGN_GLOBAL_IS_PLAYING("sign.global.isPlaying", "&4IS PLAYING"),
    SIGN_GLOBAL_JOIN_GAME("sign.global.joinGame", "&2JOIN GAME"),
    SIGN_GLOBAL_JOIN_GROUP("sign.global.joinGroup", "&2JOIN GROUP"),
    SIGN_GLOBAL_NEW_GAME("sign.global.newGame", "&2NEW GAME"),
    SIGN_GLOBAL_NEW_GROUP("sign.global.newGroup", "&2NEW GROUP"),
    SIGN_LEAVE("sign.leave", "&2LEAVE"),
    SIGN_READY("sign.ready", "&2READY"),
    SIGN_RESOURCE_PACK("sign.resourcePack", "&2DOWNLOAD"),
    SIGN_WAVE_1("sign.wave.1", "&2START"),
    SIGN_WAVE_2("sign.wave.2", "&2NEXT WAVE");

    private String identifier;
    private String message;

    DMessage(String identifier, String message) {
        this.identifier = identifier;
        this.message = message;
    }

    /* Getters and setters */
    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getRaw() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    /* Statics */
    /**
     * @param identifier the identifier to set
     * @return the message
     */
    public static Message getByIdentifier(String identifier) {
        for (Message message : values()) {
            if (message.getIdentifier().equals(identifier)) {
                return message;
            }
        }
        return null;
    }

    /**
     * @return a FileConfiguration containing all messages
     */
    public static FileConfiguration toConfig() {
        FileConfiguration config = new YamlConfiguration();
        for (DMessage message : values()) {
            config.set(message.getIdentifier(), message.message);
        }
        return config;
    }

}
