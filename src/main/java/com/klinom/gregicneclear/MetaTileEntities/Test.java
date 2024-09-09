package com.klinom.gregicneclear.MetaTileEntities;

import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;

public class Test {
    private Object metaTileEntityId;

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new MetaTileEntityElectricImplosionCompressor(this.metaTileEntityId);
    }
}
