package sj224.mods.heads;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;

public class Skull {
	public static ItemStack blockHead(String block){
		if(block.equals("planks"))
			return head("01e7a0b0-cd34-44fa-9090-eeed6f93ccec","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTBlOWQyYmViODRiMzJlM2YxNWUzODBjYzJjNTUxMDY0MjkxMWE1MTIxMDVmYTJlYzY3OWJjNTQwZmQ4MTg0In19fQ==");
		if(block.equals("dirt"))
			return head("ca021f3f-5002-46b2-bf34-9857790901cf","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFiNDNiOGMzZDM0ZjEyNWU1YTNmOGI5MmNkNDNkZmQxNGM2MjQwMmMzMzI5ODQ2MWQ0ZDRkN2NlMmQzYWVhIn19fQ==");
		if(block.equals("grass"))
			return head("fe02ba7c-6fb4-458d-af7d-85a72a7e8163","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ5YzYzYmM1MDg3MjMzMjhhMTllNTk3ZjQwODYyZDI3YWQ1YzFkNTQ1NjYzYWMyNDQ2NjU4MmY1NjhkOSJ9fX0=");
		if(block.equals("snow"))
			return head("7a419c21-9074-43b7-a443-df76fd56a2c6","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDNjNTJlYWU3NDdjYWQ1YjRmZDE5YjFhMjNiMzlhMzM2YjYyZWQ0MjI3OTdhNjIyZDA0NWY0M2U1ZDM4In19fQ==");
		if(block.equals("mycelium"))
			return head("359b3739-61e7-4d35-b9d8-5f6b663ed0ea","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2ViNGM0MWY0ODFlODE2Y2Y0YjUwN2IwYTE3NTk1ZjJiYTFmMjQ2NjRkYzQzMmJlMzQ3ZDRlN2E0ZWIzIn19fQ==");
		if(block.equals("sand"))
			return head("318fe287-3b79-467b-a29e-8cec142a0f7a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDdkN2Q3MmU3OGYzNWRlY2QyYjA4ZWE5Yjc0NzkwZTVjZDdlMjY0ODRjZjI0NDliZGVjYTRmNzhiYTMifX19");
		if(block.equals("sand_red"))
			return head("0e33173e-1e75-4207-9484-8ecbe3a2d458","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGNlNDFlNjg3OWRmZjA3ODVkMTRjYjc2OTRlYTZiMGRmMTkyYjk2Yjg4MTYwMTNlYjQ1NWU3MTU1MmZjZTZhIn19fQ==");
		if(block.equals("netherrack"))
			return head("880942dd-7665-46b8-845c-5720c6b885fa","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWVjZThlODM4MzU2M2JjZWY1ZDVhZTBiMWJmZmVkMWQ2MTU4YjlhYjdjMWFjODM0NGMxOGFjNDhmNmI2YTIifX19");
		if(block.equals("nether_brick"))
			return head("9177fd08-9984-41d5-b430-c9f565db0269","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzYwYjJmOTE0NTIxNWEzYTUwNjVkY2EyZDg5YmI4YjRjYTQ0YjkyMjJkZDIyMDYwYjUxYzM4ZDliZjU4NyJ9fX0=");
		if(block.equals("spawner"))
			return head("c65047c2-45b8-424a-8461-7a28ed109686","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQ3ZTJlNWQ1NWI2ZDA0OTQzNTE5YmVkMjU1N2M2MzI5ZTMzYjYwYjkwOWRlZTg5MjNjZDg4YjExNTIxMCJ9fX0=");
		if(block.equals("ore_coal"))
			return head("6e26d558-9b39-4a63-ab0d-cc0fef72b078","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc4OGY1ZGRhZjUyYzU4NDIyODdiOTQyN2E3NGRhYzhmMDkxOWViMmZkYjFiNTEzNjVhYjI1ZWIzOTJjNDcifX19");
		if(block.equals("ore_iron"))
			return head("b584d8d1-a5e3-49cf-85db-cfc9a8142274","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGI5N2JkZjkyYjYxOTI2ZTM5ZjVjZGRmMTJmOGY3MTMyOTI5ZGVlNTQxNzcxZTBiNTkyYzhiODJjOWFkNTJkIn19fQ==");
		if(block.equals("ore_gold"))
			return head("f7639653-f9b7-41ce-b19a-decf5726b52c","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTRkZjg5MjI5M2E5MjM2ZjczZjQ4ZjllZmU5NzlmZTA3ZGJkOTFmN2I1ZDIzOWU0YWNmZDM5NGY2ZWNhIn19fQ==");
		if(block.equals("ore_diamond"))
			return head("81f4b80a-a1b2-495f-93ff-229685fcc7d8","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg4Y2Q2ZGQ1MDM1OWM3ZDU4OThjN2M3ZTNlMjYwYmZjZDNkY2IxNDkzYTg5YjllODhlOWNiZWNiZmU0NTk0OSJ9fX0=");
		if(block.equals("ore_emerald"))
			return head("e03854c8-c1b7-4cbd-a319-c62f305ccd09","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGZjNDk1ZDFlNmViNTRhMzg2MDY4YzZjYjEyMWM1ODc1ZTAzMWI3ZjYxZDcyMzZkNWYyNGI3N2RiN2RhN2YifX19");
		if(block.equals("ore_quartz"))
			return head("a606ea8d-ffb6-4b9a-a1ec-96c1b48dc0a5","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjZkZTU4ZDU4M2MxMDNjMWNkMzQ4MjQzODBjOGE0NzdlODk4ZmRlMmViOWE3NGU3MWYxYTk4NTA1M2I5NiJ9fX0=");
		if(block.equals("cobblestone"))
			return head("b966f5be-50de-4813-8233-472103ce0a51","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTk1NTM0ZTAyYzU5YjMzZWNlNTYxOTI4MDMzMTk3OTc3N2UwMjVmYTVmYTgxYWU3NWU5OWZkOGVmZGViYjgifX19");
		if(block.equals("moss_stone"))
			return head("32289766-a220-44e6-9076-1283a6c53528","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ5MjM4ZWZjOTM0OTNiMTRhNTgyNjM5ZWIwYWE4ODM0ZWFhNDhlMTBiZDRjMjM0ZWIxYTRjMzYzYjQzZDViIn19fQ==");
		if(block.equals("stone_brick"))
			return head("e56df097-718e-4961-8eb7-6a10096fe222","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzdhMmMxOGZmYTRkM2Y0MjE2YjI0MTQxNzllY2Q4OGFlNzllNmIxZTBlODljN2JmMjVkZDM1OTk0ZjdiOTYifX19");
		if(block.equals("iron_block"))
			return head("03924288-5902-412c-a6ea-a6eb036abd49","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmJhODQ1OTE0NWQ4M2ZmYzQ0YWQ1OGMzMjYwZTc0Y2E1YTBmNjM0YzdlZWI1OWExYWQzMjM0ODQ5YzkzM2MifX19");
		if(block.equals("gold_block"))
			return head("8178b3d7-b6a6-471c-bc70-15f9c5d89671","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjZkMWNlNjk3ZTlkYmFhNGNjZjY0MjUxNmFhYTU5ODEzMzJkYWMxZDMzMWFmZWUyZWUzZGNjODllZmRlZGIifX19");
		if(block.equals("diamond_block"))
			return head("676629d7-3add-440c-8017-663d29d598a6","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzAxNDYxOTczNjM0NTI1MTk2ZWNjNzU3NjkzYjE3MWFkYTRlZjI0YWE5MjgzNmY0MmVhMTFiZDc5YzNhNTAyZCJ9fX0=");
		if(block.equals("emerald_block"))
			return head("5dbeafba-01c0-4e25-bfec-1cd45dd2f068","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWYxMjFmN2MxYWIxNTY3ZmYyMTk4M2ZmN2E5ZTU1YzQwYzBiODY1ZjA1MGQzN2U1ZDM1ZGVmYmFhIn19fQ==");
		if(block.equals("redstone_block"))
			return head("4feade5d-26ec-4398-a0d8-537e6d1ee656","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDA4ZWU2ZWRmYTk4ZGI1ZWFlOWI5Yzk5MzZlOTQ0ODliMmQ0YmJiZDNkMmI0YjZiNDg4NWEzMjI0MDYxM2MifX19");
		if(block.equals("tnt"))
			return head("125c5512-a63b-4e6a-a710-e7afd3a4aa9a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI5OTRiNDFmMDdmODdiMzI4MTg2YWNmY2JkYWJjNjk5ZDViMTg0N2ZhYmIyZTQ5ZDVhYmMyNzg2NTE0M2E0ZSJ9fX0=");
		if(block.equals("pumpkin"))
			return head("280194bd-bbfa-440e-b3e1-ca38706ffe2e","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmVjNDE1ZDcwMmYzMjkyYTgyZjE0NzFjODc5NGNmNjMxMjJkNDQ5ZDI4YWI4ODZkNGRjNThmYWZkNjYifX19");
		if(block.equals("melon"))
			return head("21186685-3336-4dbd-8dda-493bc7f1aaa8","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzNmZWQ1MTRjM2UyMzhjYTdhYzFjOTRiODk3ZmY2NzExYjFkYmU1MDE3NGFmYzIzNWM4ZjgwZDAyOSJ9fX0=");
		if(block.equals("chest"))
			return head("148ce164-81e8-43d3-b057-4b21cf96d9d3","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmY2OGQ1MDliNWQxNjY5Yjk3MWRkMWQ0ZGYyZTQ3ZTE5YmNiMWIzM2JmMWE3ZmYxZGRhMjliZmM2ZjllYmYifX19");
		if(block.equals("ender_chest"))
			return head("42db67b6-9dd1-4bfe-b478-8829c1622218","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZjYzQ4NmMyYmUxY2I5ZGZjYjJlNTNkZDlhM2U5YTg4M2JmYWRiMjdjYjk1NmYxODk2ZDYwMmI0MDY3In19fQ==");
		if(block.equals("crafting_table"))
			return head("e46c1685-b94d-4785-90d5-e86f8289add6","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U3ZDhjMjQyZDJlNGY4MDI4ZjkzMGJlNzZmMzUwMTRiMjFiNTI1NTIwOGIxYzA0MTgxYjI1NzQxMzFiNzVhIn19fQ==");
		if(block.equals("cactus"))
			return head("8637acbc-b72f-4155-8115-7decc158e60a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzhjOWE3MzAyNjljZTFkZTNlOWZhMDY0YWZiMzcwY2JjZDA3NjZkNzI5ZjNlMjllNGYzMjBhNDMzYjA5OGI1In19fQ==");
		if(block.equals("sea_lantern"))
			return head("8f206973-cd58-41c7-afdf-f7eba2247856","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI0YzZmZjE3MTRlYjJjM2I4NDRkNDZkMmU1ZWEyZjI2ZDI3M2EzM2VhYWE3NDRhYmY2NDViMDYwYjQ3ZDcifX19");
		if(block.equals("redstone_lamp"))
			return head("b6864e28-93f7-4c61-b497-8f226140747b","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWFmZjkzZWJlY2MxZjhmYmQxM2JhNzgzOWVjN2JkY2RlY2FiN2MwN2ZkOGJhNzhlZTc4YWQwYmQzYWNjYmUifX19");
		if(block.equals("glowstone"))
			return head("7066e559-9f4b-4c7b-a36e-52f5bc9abbec","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjVkN2JlZDhkZjcxNGNlYTA2M2U0NTdiYTVlODc5MzExNDFkZTI5M2RkMWQ5YjkxNDZiMGY1YWIzODM4NjYifX19");
		if(block.equals("obsidian"))
			return head("4871fc40-b2c7-431d-9eb8-b54cd666dca7","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg0MGI4N2Q1MjI3MWQyYTc1NWRlZGM4Mjg3N2UwZWQzZGY2N2RjYzQyZWE0NzllYzE0NjE3NmIwMjc3OWE1In19fQ==");
		if(block.equals("beacon"))
			return head("f5271023-2f28-4fbd-9a58-167967b9bee6","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWRiZGFhNzU1MDk5ZWRkN2VmYTFmMTI4ODJjN2E1MWI1ODE1ZGI1MmUwYjE2NGFlZjZkZjlhMWY1M2VjYTIzIn19fQ==");					
		if(block.equals("dispenser"))
			return head("c08f9311-628e-4937-a9c6-b7d416d4a2f5","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTgyZTZhYTk1MDExNzM4NGViNGJmNTUyMTcyODNhNzhmNTdiOGM4NWMwODlhYWQwM2JhYzVjYWE4M2MzMDIwIn19fQ==");
		return null;
	}
	public static ItemStack mobHead(Class<? extends EntityLiving> clazz){
		if(clazz==EntitySlime.class){
			return head("9aca565d-105c-4e8c-81fc-740545cb74b2","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZhZDIwZmMyZDU3OWJlMjUwZDNkYjY1OWM4MzJkYTJiNDc4YTczYTY5OGI3ZWExMGQxOGM5MTYyZTRkOWI1In19fQ==");
		}
		if(clazz==EntitySpider.class){
			return head("8bdb71d0-4724-48b2-9344-e79480424798","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Q1NDE1NDFkYWFmZjUwODk2Y2QyNThiZGJkZDRjZjgwYzNiYTgxNjczNTcyNjA3OGJmZTM5MzkyN2U1N2YxIn19fQ==");
		}
		if(clazz==EntityCaveSpider.class){
			return head("39173a7a-c957-4ec1-ac1a-43e5a64983df","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDE2NDVkZmQ3N2QwOTkyMzEwN2IzNDk2ZTk0ZWViNWMzMDMyOWY5N2VmYzk2ZWQ3NmUyMjZlOTgyMjQifX19");
		}
		if(clazz==EntityEnderman.class){
			return head("0de98464-1274-4dd6-bba8-370efa5d41a8","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E1OWJiMGE3YTMyOTY1YjNkOTBkOGVhZmE4OTlkMTgzNWY0MjQ1MDllYWRkNGU2YjcwOWFkYTUwYjljZiJ9fX0=");
		}
		if(clazz==EntityGhast.class){
			return head("807f287f-6499-4e93-a887-0a298ab3091f","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGI2YTcyMTM4ZDY5ZmJiZDJmZWEzZmEyNTFjYWJkODcxNTJlNGYxYzk3ZTVmOTg2YmY2ODU1NzFkYjNjYzAifX19");
		}
		if(clazz==EntityPigZombie.class){
			return head("6540c046-d6ea-4aff-9766-32a54ebe6958","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRlOWM2ZTk4NTgyZmZkOGZmOGZlYjMzMjJjZDE4NDljNDNmYjE2YjE1OGFiYjExY2E3YjQyZWRhNzc0M2ViIn19fQ==");
		}
		if(clazz==EntityMagmaCube.class){
			return head("96aced64-5b85-4b99-b825-53cd7a9f9726","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzg5NTdkNTAyM2M5MzdjNGM0MWFhMjQxMmQ0MzQxMGJkYTIzY2Y3OWE5ZjZhYjM2Yjc2ZmVmMmQ3YzQyOSJ9fX0=");
		}
		if(clazz==EntityBlaze.class){
			return head("7ceb88b2-7f5f-4399-abb9-7068251baa9d","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc4ZWYyZTRjZjJjNDFhMmQxNGJmZGU5Y2FmZjEwMjE5ZjViMWJmNWIzNWE0OWViNTFjNjQ2Nzg4MmNiNWYwIn19fQ==");
		}
		if(clazz==EntityIronGolem.class){
			return head("7cb6e9a5-994f-40d5-9bfc-4ba5d796d21e","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODkwOTFkNzllYTBmNTllZjdlZjk0ZDdiYmE2ZTVmMTdmMmY3ZDQ1NzJjNDRmOTBmNzZjNDgxOWE3MTQifX19");
		}
		if(clazz==EntityVillager.class){
			return head("0a9e8efb-9191-4c81-80f5-e27ca5433156","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODIyZDhlNzUxYzhmMmZkNGM4OTQyYzQ0YmRiMmY1Y2E0ZDhhZThlNTc1ZWQzZWIzNGMxOGE4NmU5M2IifX19");
		}
		if(clazz==EntityGuardian.class){
			return head("2e9c0a67-92b3-4949-9be1-faf12318ee88","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTMyYzI0NTI0YzgyYWIzYjNlNTdjMjA1MmM1MzNmMTNkZDhjMGJlYjhiZGQwNjM2OWJiMjU1NGRhODZjMTIzIn19fQ==");
		}
		if(clazz==EntityElderGuardian.class){
			return head("f2e933a7-614f-44e0-bf18-289b102104ab","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWM3OTc0ODJhMTRiZmNiODc3MjU3Y2IyY2ZmMWI2ZTZhOGI4NDEzMzM2ZmZiNGMyOWE2MTM5Mjc4YjQzNmIifX19");
		}
		if(clazz==EntityChicken.class){
			return head("7d3a8ace-e045-4eba-ab71-71dbf525daf1","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTYzODQ2OWE1OTljZWVmNzIwNzUzNzYwMzI0OGE5YWIxMWZmNTkxZmQzNzhiZWE0NzM1YjM0NmE3ZmFlODkzIn19fQ==");
		}
		if(clazz==EntityCow.class){
			return head("97ddf3b3-9dbe-4a3b-8a0f-1b19ddeac0bd","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWQ2YzZlZGE5NDJmN2Y1ZjcxYzMxNjFjNzMwNmY0YWVkMzA3ZDgyODk1ZjlkMmIwN2FiNDUyNTcxOGVkYzUifX19");
		}
		if(clazz==EntitySheep.class){
			return head("fa234925-9dbe-4b8f-a544-7c70fb6b6ac5","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjMxZjljY2M2YjNlMzJlY2YxM2I4YTExYWMyOWNkMzNkMThjOTVmYzczZGI4YTY2YzVkNjU3Y2NiOGJlNzAifX19");
		}
		if(clazz==EntityPig.class){
			return head("e1e1c2e4-1ed2-473d-bde2-3ec718535399","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjIxNjY4ZWY3Y2I3OWRkOWMyMmNlM2QxZjNmNGNiNmUyNTU5ODkzYjZkZjRhNDY5NTE0ZTY2N2MxNmFhNCJ9fX0=");
		}
		if(clazz==EntityMooshroom.class){
			return head("e206ac29-ae69-475b-909a-fb523d894336","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBiYzYxYjk3NTdhN2I4M2UwM2NkMjUwN2EyMTU3OTEzYzJjZjAxNmU3YzA5NmE0ZDZjZjFmZTFiOGRiIn19fQ==");
		}
		if(clazz==EntitySquid.class){
			return head("f95d9504-ea2b-4b89-b2d0-d400654a7010","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDE0MzNiZTI0MjM2NmFmMTI2ZGE0MzRiODczNWRmMWViNWIzY2IyY2VkZTM5MTQ1OTc0ZTljNDgzNjA3YmFjIn19fQ==");
		}
		if(clazz==EntityHusk.class){
			return head("2e387bc6-774b-4fda-ba22-eb54a26dfd9e","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzc3MDY4MWQxYTI1NWZiNGY3NTQ3OTNhYTA1NWIyMjA0NDFjZGFiOWUxMTQxZGZhNTIzN2I0OTkzMWQ5YjkxYyJ9fX0=");
		}
		if(clazz==EntityWither.class){
			return head("119c371b-ea16-47c9-ad7f-23b3d894520a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RmNzRlMzIzZWQ0MTQzNjk2NWY1YzU3ZGRmMjgxNWQ1MzMyZmU5OTllNjhmYmI5ZDZjZjVjOGJkNDEzOWYifX19");
		}
		if(clazz==EntityStray.class){
			return head("4c26f4db-681c-4dd8-b979-971bffc308cf","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTE0Zjc4YWVkMDc3MWRhMDk1N2FhNTYzNGZmNzU0NWRjN2M3ZmMxMDEzNDI5NWYxNWRmZTI0YjZhZGRkMjNkIn19fQ==");
		}
		return null;
	}
	public static ItemStack head(String id,String tex){
		ItemStack s=new ItemStack(Items.SKULL,1,3);
		String st=String.format("{SkullOwner:{Id:\"%s\",Properties:{textures:[{Value:\"%s\"}]}}}",id,tex);
		try {
			NBTTagCompound ownerTag=(NBTTagCompound)JsonToNBT.getTagFromJson(st);
			s.setTagCompound(ownerTag);
		} catch (NBTException e) {
			e.printStackTrace(System.out);
			return new ItemStack(Blocks.COBBLESTONE);
		}
		return s;
	}
	public static ItemStack playerHead(String owner){
		ItemStack s=new ItemStack(Items.SKULL,1,3);
		String st=String.format("{SkullOwner:\"%s\"}",owner);
		try {
			NBTTagCompound ownerTag=(NBTTagCompound)JsonToNBT.getTagFromJson(st);
			s.setTagCompound(ownerTag);
			System.out.println(s.getTagCompound());
		} catch (NBTException e) {
			e.printStackTrace(System.out);
			return new ItemStack(Blocks.COBBLESTONE);
		}
		return s;
	}
}
