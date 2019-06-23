package teamrtg.passableleaves.block;

import net.minecraft.block.BlockNewLeaf;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNewPassableLeaf extends BlockNewLeaf {
    @Override
    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean fancy) {
        leavesFancy = true;
    }
}
