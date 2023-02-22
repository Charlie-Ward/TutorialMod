package info.charlieward.tutorialmod.event;

import info.charlieward.tutorialmod.TutorialMod;
import info.charlieward.tutorialmod.block.ModBlocks;
import info.charlieward.tutorialmod.block.custom.JumpBlock;
import info.charlieward.tutorialmod.item.ModItems;
import info.charlieward.tutorialmod.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.TOOLSMITH){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.EIGHT_BALL.get(), 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    stack, 10, 8, 0.02F));
        }
        if(event.getType() == ModVillagers.ZIRCON_MASTER.get()){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack blueberry = new ItemStack(ModItems.BLUEBERRY.get(), 5);
            ItemStack ball_of_water = new ItemStack(ModItems.BALL_OF_WATER.get(), 1);

            ItemStack zircon_nuggets = new ItemStack(ModItems.ZIRCON_NUGGET.get(), 27);
            ItemStack raw_zircon = new ItemStack(ModItems.RAW_ZIRCON.get(), 3);

            ItemStack zircon = new ItemStack(ModItems.ZIRCON.get(), 3);
            ItemStack jump_block = new ItemStack(ModBlocks.JUMP_BLOCK.get(), 3);

            ItemStack zircon_lamp = new ItemStack(ModBlocks.ZIRCON_LAMP.get(), 4);
            ItemStack jump_block_2 = new ItemStack(ModBlocks.JUMP_BLOCK_TIER_2.get(), 2);

            ItemStack zircon_block = new ItemStack(ModBlocks.ZIRCON_BLOCK.get(), 1);
            ItemStack jump_block_3 = new ItemStack(ModBlocks.JUMP_BLOCK_TIER_3.get(), 1);
            ItemStack eight_ball = new ItemStack(ModItems.EIGHT_BALL.get(), 1);

            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    blueberry, 12, 12, 0.02F));
            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    ball_of_water, 1, 1, 0.02F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    zircon_nuggets, 7, 7, 0.04F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    raw_zircon, 7, 7, 0.04F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    zircon, 5, 5, 0.05F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    jump_block, 6, 6, 0.05F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    zircon_lamp, 4, 4, 0.06F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    jump_block_2, 3, 3, 0.06F));
            trades.get(5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    zircon_block, 2, 2, 0.07F));
            trades.get(5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    jump_block_3, 3, 3, 0.07F));
            trades.get(5).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 25),
                    eight_ball, 1, 1, 0.07F));
        }
    }

}
