package net.teamsao.mcsao.item.items;

import net.teamsao.mcsao.helper.ReferenceHelper;
import net.teamsao.mcsao.item.ItemSAO;

/**
 * Created by bfox1 on 7/25/2014.
 */
public class SAOCD extends ItemSAO{

    public SAOCD()
    {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("cartridge");
        this.setTextureName(ReferenceHelper.setItemName(this));
    }
}
