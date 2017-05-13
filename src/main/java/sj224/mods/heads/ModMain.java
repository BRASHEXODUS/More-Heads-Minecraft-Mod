package sj224.mods.heads;

import static sj224.mods.heads.Skull.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = ModMain.MODID, version = ModMain.VERSION)
public class ModMain
{
    public static final String MODID = "heads";
    public static final String VERSION = "1.0";
    public static final CreativeTabs tabHeads = new CreativeTabs("heads") {
	    @Override
		public void displayAllRelevantItems(NonNullList<ItemStack> it) {
			super.displayAllRelevantItems(it);
			//MOB HEADS
			it.add(new ItemStack(Items.SKULL,1,0));
			it.add(new ItemStack(Items.SKULL,1,1));
			it.add(new ItemStack(Items.SKULL,1,2));
			it.add(new ItemStack(Items.SKULL,1,3));
			it.add(head("b158db28-5a13-4c67-9160-785d56f641a1","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNiMDk4OTY3MzQwZGFhYzUyOTI5M2MyNGUwNDkxMDUwOWIyMDhlN2I5NDU2M2MzZWYzMWRlYzdiMzc1MCJ9fX0="));
			it.add(new ItemStack(Items.SKULL,1,4));
			it.add(new ItemStack(Items.SKULL,1,5));
			//MORE MOB HEADS
			it.add(mobHead(EntityHusk.class));
			it.add(mobHead(EntityStray.class));
			it.add(mobHead(EntitySpider.class));
			it.add(mobHead(EntityCaveSpider.class));
			it.add(mobHead(EntitySlime.class));
			it.add(mobHead(EntityEnderman.class));
			it.add(mobHead(EntityBlaze.class));
			it.add(mobHead(EntityGhast.class));
			it.add(mobHead(EntityPigZombie.class));		
			it.add(mobHead(EntityMagmaCube.class));
			it.add(mobHead(EntityVillager.class));
			it.add(mobHead(EntityIronGolem.class));
			it.add(mobHead(EntityGuardian.class));
			it.add(mobHead(EntityElderGuardian.class));
			it.add(mobHead(EntityWither.class));
			it.add(mobHead(EntityPig.class));
			it.add(mobHead(EntitySheep.class));
			it.add(mobHead(EntityChicken.class));
			it.add(mobHead(EntityCow.class));
			it.add(mobHead(EntityMooshroom.class));
			//COLORED HEADS
			it.add(head("530c5043-eb73-459b-aaf9-9f91d4924e8b","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzE0ODJiNzU1ODU4NjU3ZmI1MWI3ZDNmYmY0Y2Q4YzA5MGMwNWUzNWJkOGNkYmE5OGIxOTQ5OWQ3ODMzYWNiMiJ9fX0="));
			it.add(head("41227d46-3350-4aea-b3e1-4c7480d891f7","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDg5Y2U4OTUyNmZjMTI2MjQ2NzhmMzA1NDkzYWE2NWRhOGExYjM2MDU0NmE1MDVkMTE4ZWIxZmFkNzc1In19fQ=="));
			it.add(head("76ee0c4a-0a78-4ebb-ab14-31a49227a388","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2QzMWQyMWNiNTQyOTRlZTNhMjA1NjEzN2QxMjNiNTc2Zjc4YmZjNDg3OGNkODE0NGNkNTFlMTkzMWMzOWI1In19fQ=="));
			it.add(head("aa5f432b-59ee-4db5-b58e-0138280f2860","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzYxZTViMzMzYzJhMzg2OGJiNmE1OGI2Njc0YTI2MzkzMjM4MTU3MzhlNzdlMDUzOTc3NDE5YWYzZjc3In19fQ=="));
			it.add(head("c8fee7ee-b067-48cb-80c8-337a63edd0b1","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZmNjlmN2I3NTM4YjQxZGMzNDM5ZjM2NThhYmJkNTlmYWNjYTM2NmYxOTBiY2YxZDZkMGEwMjZjOGY5NiJ9fX0="));
			it.add(head("1924b74f-48e6-4b7b-be04-c2e6a815630e","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2FkMDE1OTJjYTQ0MTg5ZjhhYmFkMGMyZWZhM2NhZTZhYWZhZTc2ZGFhYTdlYTQ2NjU1Y2MxMjkzNDg5ZmYifX19"));
			it.add(head("0c711a43-7034-4c36-8126-972e9a0e5449","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg1ZmM5N2M3ZGYyNGE2YWE5YzBhYzg5ZmNiMjJiODE3MDBmNTk5ZjQ1YzMyYzdlMzE3OGI0NDQxNzJkZiJ9fX0="));
			it.add(head("b3ff2b89-e304-40c1-b210-471ccd2d8b5b","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWNmM2U0MjJiMzIyYjFlOTI0NWI0YjM2ODQzMzA0NWM3YjQzYzkwOWU1ZGQ2Yzc5MmU0YjZiZWRhNTQzMDNjIn19fQ=="));
			it.add(head("58e8acf3-20df-4127-b3e3-d680769f4485","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDQ1YjQ0ZmQxOWQ3MmZiM2Q2ZTE4OWM0OTc4YjFjYTY4N2RiZDY1ODBiMThkZGQ4YWE3MTBlZGZmYTUifX19"));
			it.add(head("969fce41-6900-4877-8529-169ea6065a8d","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRjNDE0MWMxZWRmM2Y3ZTQxMjM2YmQ2NThjNWJjN2I1YWE3YWJmN2UyYTg1MmI2NDcyNTg4MThhY2Q3MGQ4In19fQ=="));
			it.add(head("95dfc63f-0278-4f2e-8094-db1ecf6abdc8","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNjZGIxNmFiYjE3NTFkMWE0ODFlZDg3YjU3ZGIzYjg4M2U5OTYxZGEyZjlkNDg1YTI5ODY0ODdlMiJ9fX0="));
			it.add(head("6ed54d22-7274-4ab1-8c2c-aed1395b7633","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmVhNTkwYjY4MTU4OWZiOWIwZTg2NjRlZTk0NWI0MWViMzg1MWZhZjY2YWFmNDg1MjVmYmExNjljMzQyNzAifX19"));
			it.add(head("f1498cf1-42ff-42fe-83a9-5bab71771c82","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGJhYzc3NTIwYjllZWU2NTA2OGVmMWNkOGFiZWFkYjAxM2I0ZGUzOTUzZmQyOWFjNjhlOTBlNDg2NjIyNyJ9fX0="));
			it.add(head("0738e42f-b6aa-4f22-a444-5717a63de4a4","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTdjMWYxZWFkNGQ1MzFjYWE0YTViMGQ2OWVkYmNlMjlhZjc4OWEyNTUwZTVkZGJkMjM3NzViZTA1ZTJkZjJjNCJ9fX0="));
			it.add(head("27b2c930-daca-4574-a51b-df4f3332396e","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Y0NmMzMWQ2ZWU2ZWE2MTlmNzJlNzg1MjMyY2IwNDhhYjI3MDQ2MmRiMGNiMTQ1NDUxNDQzNjI1MWMxYSJ9fX0="));
			it.add(head("dadfc3b3-f981-47ab-851c-f14404c7bebb","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTEwMTRlNGY0MWQ3NzI5OTI4ZjIxNTU1NWRhMmVhZjE1OGNlODNkOWUwYzk5NjFiZWY1ZWI3NjEzZDM3ZSJ9fX0="));
			it.add(head("2a83c29f-748a-4298-aa11-e5022fc62be0","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IxOWRjNGQ0Njc4ODJkYmNhMWI1YzM3NDY1ZjBjZmM3MGZmMWY4MjllY2Y0YTg2NTc5NmI4ZTVjMjgwOWEifX19"));
			it.add(head("28408049-4255-46b8-936b-85bc87f68492","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmMzNWY3MzA5OGQ1ZjViNDkyYWY4N2Q5YzU3ZmQ4ZGFhMWM4MmNmN2Y5YTdlYjljMzg0OTgxYmQ3NmRkOSJ9fX0="));
			it.add(head("79b607e4-be76-4e16-9d12-7cb7d3e905ee","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjgzOWUzODFkOWZlZGFiNmY4YjU5Mzk2YTI3NjQyMzhkY2ViMmY3ZWVhODU2ZGM2ZmM0NDc2N2RhMzgyZjEifX19"));
			it.add(head("0d2d7296-5e2e-409e-8d15-c01c8229b83d","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzk2NTQwY2U3NjIxMjVlMzk4Y2E1M2Q0Y2Q5YjY2ODM5NmQwNDY3ZTEyOGIzMGRhNWFhNjJiZTljZTA2MCJ9fX0="));
			it.add(head("fcd3e296-6099-4f47-8e86-021d306c0f47","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjc4NGMxNTJiZmMzZTJlMzEzZWYyM2ZjNDZkNDRmY2U0MWU0YWRhZDk0MjFiYWMyZGEzODk0NTExY2MwM2IifX19"));
			it.add(head("c64e7996-3e23-48b5-b900-5af87b52bd93","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTIzMDZhOTg3ODdlNTI2Y2U5NzNiZDU2MTI0ZTY0NWEyZTIzMjlkNTYzZGNmYTY4YTFiZTY1NzY3ZjI5YjUifX19"));
			it.add(head("40939ac8-3abb-40b8-b059-b805db2fd397","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTkzNTJiY2FiZmMyN2VkYjQ0Y2ViNTFiMDQ3ODY1NDJmMjZhMjk5YTA1Mjk0NzUzNDYxODZlZTk0NzM4ZiJ9fX0="));
			it.add(head("6780703e-48af-4651-b0ff-e611b1fdaa2a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODU1NjU0YjNmMWJmYjJjZGYwZjRiNTJkNjM2MGEwM2QzMWRkYWZjNzEwZjhhZmFlYTk5ZmJhNjY3ZTQ4MmRmIn19fQ=="));
			it.add(head("309c9299-c87a-4b3f-9472-b5df4536b1a0","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzM2ZhNTJkZDc0ZDcxMWU1Mzc0N2RhOTYzYjhhZGVjZjkyZGI5NDZiZTExM2I1NmMzOGIzZGMyNzBlZWIzIn19fQ=="));
			it.add(head("05df5069-4ee7-4069-a42c-77a1070ab91b","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA3MzI2ZDMxODU4ZWE1N2U3YmM1NWYzZTc1ZTZjODViMzRmZjRiZmQyODA4OGY5NGYxMWViOGUwZDFjZiJ9fX0="));
			it.add(head("afc2f4ae-3e05-43fc-846c-8894310d0ed7","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY3NjI5NDAxMWNiZGNkMmU5Mjk0MWRhZmU2YjM3MjZkZmYwMmMzZTFmODRkZmE1N2M2YWJhYjZmYzMzY2U2In19fQ=="));
			it.add(head("a2a9b5b9-da35-40b8-80ce-aee3df9cf70b","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkNTk4M2RjYWJjOTMxYWI2YTQ5ZDJmYjg4NzllYmM1Mjk1Y2I1YmEyZjI3OGUzYzhhM2RhN2JjOGI0NzgifX19"));
			it.add(head("db7c4d90-c6af-4227-9eb2-507b1c649bea","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDU3NGE0Njc3MzcyOTViZDlkZGM4MjU0NWExYTRlMTQ2YTk0M2QwNWVjYzgyMWY5Y2M2YTU0M2ZmZTk5MzRhIn19fQ=="));
			it.add(head("47160e62-9eef-4c69-ab91-1ba1fa5dc883","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTVhNzcwZTdlNDRiM2ExZTZjM2I4M2E5N2ZmNjk5N2IxZjViMjY1NTBlOWQ3YWE1ZDUwMjFhMGMyYjZlZSJ9fX0="));
			it.add(head("bfef85fc-9c34-48f8-8b29-51c74e8f44d1","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzFjNDVhNTk1NTAxNDNhNDRlZDRlODdjZTI5NTVlNGExM2U5NGNkZmQ0YzY0ZGVlODgxZGZiNDhkZDkyZSJ9fX0="));
			it.add(head("9b7d4a9f-4dfe-43eb-a4d3-bd75db1ee42a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjJmMDg1YzZiM2NiMjI4ZTViYTgxZGY1NjJjNDc4Njc2MmYzYzI1NzEyN2U5NzI1Yzc3YjdmZDMwMWQzNyJ9fX0="));
			it.add(head("78bc0b40-5eba-474d-81c1-b0f6b87a26c3","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWRkZWJiYjA2MmY2YTM4NWE5MWNhMDVmMThmNWMwYWNiZTMzZTJkMDZlZTllNzQxNmNlZjZlZTQzZGZlMmZiIn19fQ=="));
			//BLOCKS
			it.add(blockHead("planks"));
			it.add(blockHead("dirt"));
			it.add(blockHead("grass"));
			it.add(blockHead("snow"));
			it.add(blockHead("mycelium"));
			it.add(blockHead("sand"));
			it.add(blockHead("sand_red"));
			it.add(blockHead("netherrack"));
			it.add(blockHead("nether_brick"));
			it.add(blockHead("obsidian"));
			it.add(blockHead("ore_coal"));
			it.add(blockHead("ore_iron"));
			it.add(blockHead("ore_gold"));
			it.add(blockHead("ore_diamond"));
			it.add(blockHead("ore_emerald"));
			it.add(blockHead("ore_quartz"));
			it.add(blockHead("cobblestone"));
			it.add(blockHead("moss_stone"));
			it.add(blockHead("stone_brick"));
			it.add(blockHead("iron_block"));
			it.add(blockHead("gold_block"));
			it.add(blockHead("diamond_block"));
			it.add(blockHead("emerald_block"));
			it.add(blockHead("redstone_block"));
			it.add(blockHead("pumpkin"));
			it.add(blockHead("melon"));
			it.add(blockHead("cactus"));
			it.add(blockHead("crafting_table"));
			it.add(blockHead("chest"));
			it.add(blockHead("ender_chest"));
			it.add(blockHead("glowstone"));
			it.add(blockHead("redstone_lamp"));
			it.add(blockHead("sea_lantern"));
			it.add(blockHead("beacon"));
			it.add(blockHead("tnt"));
			it.add(blockHead("dispenser"));
			it.add(blockHead("spawner"));
			//CHARACTER HEADS
			it.add(head("c1ec7470-4cff-467e-b560-6864bdd1646a","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWVhMTkxNjczZTFjODkxMjI5ZmMxODM4OTllNjdlZDQwOWM0ZmYyMmZkZTcxMmRkNmQ1YmU0YTRmNzJlNCJ9fX0="));//Santa claus
			it.add(head("d0b15454-36fa-43e4-a247-f882bb9fe288","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOThiN2NhM2M3ZDMxNGE2MWFiZWQ4ZmMxOGQ3OTdmYzMwYjZlZmM4NDQ1NDI1YzRlMjUwOTk3ZTUyZTZjYiJ9fX0="));//Herobrine
			it.add(head("822833e6-c3ec-457e-aeef-1fac97799e5f","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzAyZTIyZjY1MDNjMzYzZGY2OWJmOWU5NDQ4ZmU4OWQyZjA1YmFlMzA1MzRiOGJiMTlkMjY4ZjA5ODliOTYifX19"));//Astronaut
			//MISCELLANEOUS
			it.add(head("5a929f7f-1a74-4d25-860d-40ff532acfbe","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTg2ZjcyYzE2YjFlOWZlNmUwOTllNzZiNWY3YTg4NGZiNzgyY2ZjYzU4OGM5NWM0ZTM4M2RjNTI3ZDFiODQifX19"));//Computer
			it.add(head("11ad1a4f-ddba-4550-abd7-14288f367d90","eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTQ5N2IxNDdjZmFlNTIyMDU1OTdmNzJlM2M0ZWY1MjUxMmU5Njc3MDIwZTRiNGZhNzUxMmMzYzZhY2RkOGMxIn19fQ=="));//Popcorn
			System.out.println(it.size()+" heads");
		}

		@Override public ItemStack getTabIconItem() {
	        return new ItemStack(Items.SKULL,1,3);
	        
	    }
	};
}
