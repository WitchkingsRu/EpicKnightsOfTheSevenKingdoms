package net.ekotsk.screen;

import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;


public class QohorySmelteryMenu extends AbstractContainerMenu {
    private final Level level;
    private final ContainerData data;
    private final Container container;

    public QohorySmelteryMenu(int containerId, Inventory inv) {
        this(containerId, inv, new SimpleContainer(3), new SimpleContainerData(4));
    }

    public QohorySmelteryMenu(int containerId, Inventory inv, Container Container, ContainerData data) {
        super(ModMenuTypes.QOHORY_SMELTERY_MENU.get(), containerId);
        checkContainerSize(Container, 3);
        checkContainerDataCount(data, 4);
        this.level = inv.player.level();
        this.container = Container;
        this.data = data;
        this.addSlot(new Slot(Container, 0, 56, 17));
        this.addSlot(new Slot(container, 1, 116, 35) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return AbstractFurnaceBlockEntity.isFuel(stack);
            }
        });
        this.addSlot(new Slot(container, 2, 56, 53) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }
        });

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
        addDataSlots(data);
    }

    public boolean isCrafting() {
        return data.get(2) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(2);
        int maxProgress = this.data.get(3);
        int progressArrowSize = 37;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }
    public boolean isBurning() {
        return data.get(0) > 0;
    }

    public int getScaledBurnProgress() {
        int burnTime = this.data.get(0);
        int burnTotal = this.data.get(1);
        if (burnTotal == 0 || burnTime == 0) {
            return 0;
        }
        int flameHeight = 13;

        return burnTime * flameHeight / burnTotal;
    }
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    private static final int TE_INVENTORY_SLOT_COUNT = 3;
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
