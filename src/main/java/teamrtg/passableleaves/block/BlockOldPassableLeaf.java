package teamrtg.passableleaves.block;

import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.state.IBlockState;

public class BlockOldPassableLeaf extends BlockOldLeaf
{
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
