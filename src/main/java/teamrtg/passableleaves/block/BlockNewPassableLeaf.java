package teamrtg.passableleaves.block;

import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.state.IBlockState;

public class BlockNewPassableLeaf extends BlockNewLeaf
{
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
