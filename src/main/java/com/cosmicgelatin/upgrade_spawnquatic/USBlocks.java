package com.cosmicgelatin.upgrade_spawnquatic;

import com.ninni.spawn.registry.SpawnBlocks;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.upgrade_aquatic.common.block.coralstone.CoralstoneBlock;
import com.teamabnormals.upgrade_aquatic.common.block.coralstone.CoralstoneSlabBlock;
import com.teamabnormals.upgrade_aquatic.common.block.coralstone.CoralstoneStairsBlock;
import com.teamabnormals.upgrade_aquatic.common.block.coralstone.CoralstoneWallBlock;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import static net.minecraft.world.item.CreativeModeTabs.BUILDING_BLOCKS;
import static net.minecraft.world.item.crafting.Ingredient.of;

public class USBlocks {
    public static final BlockSubRegistryHelper BLOCKS = UpgradeSpawnquatic.REGISTRY_HELPER.getBlockSubHelper();

    //  Wax
    public static final DeferredBlock<Block> WAX_CORALSTONE = BLOCKS.createBlock("wax_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, false, new Block[]{SpawnBlocks.WAX_CORAL.get(), SpawnBlocks.WAX_CORAL_FAN.get(), SpawnBlocks.WAX_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> CHISELED_WAX_CORALSTONE = BLOCKS.createBlock("chiseled_wax_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, true, new Block[]{SpawnBlocks.WAX_CORAL.get(), SpawnBlocks.WAX_CORAL_FAN.get(), SpawnBlocks.WAX_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> WAX_CORALSTONE_SLAB = BLOCKS.createBlock("wax_coralstone_slab", () -> new CoralstoneSlabBlock(UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.WAX_CORAL.get(), SpawnBlocks.WAX_CORAL_FAN.get(), SpawnBlocks.WAX_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> WAX_CORALSTONE_STAIRS = BLOCKS.createBlock("wax_coralstone_stairs", () -> new CoralstoneStairsBlock(() -> WAX_CORALSTONE.get().defaultBlockState(), UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.WAX_CORAL.get(), SpawnBlocks.WAX_CORAL_FAN.get(), SpawnBlocks.WAX_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> WAX_CORALSTONE_WALL = BLOCKS.createBlock("wax_coralstone_wall", () -> new CoralstoneWallBlock(UABlocks.UAProperties.CORALSTONE));

    //  Thorn
    public static final DeferredBlock<Block> THORN_CORALSTONE = BLOCKS.createBlock("thorn_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, false, new Block[]{SpawnBlocks.THORN_CORAL.get(), SpawnBlocks.THORN_CORAL_FAN.get(), SpawnBlocks.THORN_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> CHISELED_THORN_CORALSTONE = BLOCKS.createBlock("chiseled_thorn_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, true, new Block[]{SpawnBlocks.THORN_CORAL.get(), SpawnBlocks.THORN_CORAL_FAN.get(), SpawnBlocks.THORN_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> THORN_CORALSTONE_SLAB = BLOCKS.createBlock("thorn_coralstone_slab", () -> new CoralstoneSlabBlock(UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.THORN_CORAL.get(), SpawnBlocks.THORN_CORAL_FAN.get(), SpawnBlocks.THORN_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> THORN_CORALSTONE_STAIRS = BLOCKS.createBlock("thorn_coralstone_stairs", () -> new CoralstoneStairsBlock(() -> THORN_CORALSTONE.get().defaultBlockState(), UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.THORN_CORAL.get(), SpawnBlocks.THORN_CORAL_FAN.get(), SpawnBlocks.THORN_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> THORN_CORALSTONE_WALL = BLOCKS.createBlock("thorn_coralstone_wall", () -> new CoralstoneWallBlock(UABlocks.UAProperties.CORALSTONE));

    //  Spike
    public static final DeferredBlock<Block> SPIKE_CORALSTONE = BLOCKS.createBlock("spike_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, false, new Block[]{SpawnBlocks.SPIKE_CORAL.get(), SpawnBlocks.SPIKE_CORAL_FAN.get(), SpawnBlocks.SPIKE_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> CHISELED_SPIKE_CORALSTONE = BLOCKS.createBlock("chiseled_spike_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, true, new Block[]{SpawnBlocks.SPIKE_CORAL.get(), SpawnBlocks.SPIKE_CORAL_FAN.get(), SpawnBlocks.SPIKE_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> SPIKE_CORALSTONE_SLAB = BLOCKS.createBlock("spike_coralstone_slab", () -> new CoralstoneSlabBlock(UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.SPIKE_CORAL.get(), SpawnBlocks.SPIKE_CORAL_FAN.get(), SpawnBlocks.SPIKE_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> SPIKE_CORALSTONE_STAIRS = BLOCKS.createBlock("spike_coralstone_stairs", () -> new CoralstoneStairsBlock(() -> SPIKE_CORALSTONE.get().defaultBlockState(), UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.SPIKE_CORAL.get(), SpawnBlocks.SPIKE_CORAL_FAN.get(), SpawnBlocks.SPIKE_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> SPIKE_CORALSTONE_WALL = BLOCKS.createBlock("spike_coralstone_wall", () -> new CoralstoneWallBlock(UABlocks.UAProperties.CORALSTONE));

    //  Heart
    public static final DeferredBlock<Block> HEART_CORALSTONE = BLOCKS.createBlock("heart_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, false, new Block[]{SpawnBlocks.HEART_CORAL.get(), SpawnBlocks.HEART_CORAL_FAN.get(), SpawnBlocks.HEART_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> CHISELED_HEART_CORALSTONE = BLOCKS.createBlock("chiseled_heart_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, true, new Block[]{SpawnBlocks.HEART_CORAL.get(), SpawnBlocks.HEART_CORAL_FAN.get(), SpawnBlocks.HEART_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> HEART_CORALSTONE_SLAB = BLOCKS.createBlock("heart_coralstone_slab", () -> new CoralstoneSlabBlock(UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.HEART_CORAL.get(), SpawnBlocks.HEART_CORAL_FAN.get(), SpawnBlocks.HEART_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> HEART_CORALSTONE_STAIRS = BLOCKS.createBlock("heart_coralstone_stairs", () -> new CoralstoneStairsBlock(() -> HEART_CORALSTONE.get().defaultBlockState(), UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.HEART_CORAL.get(), SpawnBlocks.HEART_CORAL_FAN.get(), SpawnBlocks.HEART_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> HEART_CORALSTONE_WALL = BLOCKS.createBlock("heart_coralstone_wall", () -> new CoralstoneWallBlock(UABlocks.UAProperties.CORALSTONE));

    //  Reed
    public static final DeferredBlock<Block> REED_CORALSTONE = BLOCKS.createBlock("reed_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, false, new Block[]{SpawnBlocks.REED_CORAL.get(), SpawnBlocks.REED_CORAL_FAN.get(), SpawnBlocks.REED_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> CHISELED_REED_CORALSTONE = BLOCKS.createBlock("chiseled_reed_coralstone", () -> new CoralstoneBlock(UABlocks.UAProperties.CORALSTONE, true, new Block[]{SpawnBlocks.REED_CORAL.get(), SpawnBlocks.REED_CORAL_FAN.get(), SpawnBlocks.REED_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> REED_CORALSTONE_SLAB = BLOCKS.createBlock("reed_coralstone_slab", () -> new CoralstoneSlabBlock(UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.REED_CORAL.get(), SpawnBlocks.REED_CORAL_FAN.get(), SpawnBlocks.REED_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> REED_CORALSTONE_STAIRS = BLOCKS.createBlock("reed_coralstone_stairs", () -> new CoralstoneStairsBlock(() -> REED_CORALSTONE.get().defaultBlockState(), UABlocks.UAProperties.CORALSTONE, new Block[]{SpawnBlocks.REED_CORAL.get(), SpawnBlocks.REED_CORAL_FAN.get(), SpawnBlocks.REED_CORAL_WALL_FAN.get()}));
    public static final DeferredBlock<Block> REED_CORALSTONE_WALL = BLOCKS.createBlock("reed_coralstone_wall", () -> new CoralstoneWallBlock(UABlocks.UAProperties.CORALSTONE));

    public static void setupTabEditors() {
        CreativeModeTabContentsPopulator.mod(UpgradeSpawnquatic.MODID)
                .tab(BUILDING_BLOCKS)
                .addItemsAfter(of(UABlocks.CHISELED_ELDER_PRISMARINE_CORALSTONE),
                        WAX_CORALSTONE, WAX_CORALSTONE_STAIRS, WAX_CORALSTONE_SLAB, WAX_CORALSTONE_WALL, CHISELED_WAX_CORALSTONE,
                        THORN_CORALSTONE, THORN_CORALSTONE_STAIRS, THORN_CORALSTONE_SLAB, THORN_CORALSTONE_WALL, CHISELED_THORN_CORALSTONE,
                        SPIKE_CORALSTONE, SPIKE_CORALSTONE_STAIRS, SPIKE_CORALSTONE_SLAB, SPIKE_CORALSTONE_WALL, CHISELED_SPIKE_CORALSTONE,
                        HEART_CORALSTONE, HEART_CORALSTONE_STAIRS, HEART_CORALSTONE_SLAB, HEART_CORALSTONE_WALL, CHISELED_HEART_CORALSTONE,
                        REED_CORALSTONE, REED_CORALSTONE_STAIRS, REED_CORALSTONE_SLAB, REED_CORALSTONE_WALL, CHISELED_REED_CORALSTONE
                );
    }
}
