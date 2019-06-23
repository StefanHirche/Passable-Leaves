package teamrtg.passableleaves.block;

import net.minecraft.block.BlockOldLeaf;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOldPassableLeaf extends BlockOldLeaf {
    @Override
    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean fancy) {
        leavesFancy = true;
    }
}
