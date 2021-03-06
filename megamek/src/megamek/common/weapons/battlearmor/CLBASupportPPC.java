/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.AmmoType;
import megamek.common.TechConstants;
import megamek.common.weapons.PPCWeapon;

/**
 * @author Sebastian Brocks
 */
public class CLBASupportPPC extends PPCWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 2062417699006705116L;

    /**
     *
     */
    public CLBASupportPPC() {
        super();
        techLevel.put(3071, TechConstants.T_CLAN_TW);
        name = "BA Support PPC";
        setInternalName("BA Support PPC");
        addLookupName("CLBASupportPPC");
        damage = 2;
        ammoType = AmmoType.T_NA;
        shortRange = 2;
        mediumRange = 5;
        longRange = 7;
        extremeRange = 10;
        bv = 14;
        flags = flags.or(F_BA_WEAPON).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        setModes(new String[] { "Field Inhibitor ON", "Field Inhibitor OFF" });
        cost = 14000;
        introDate = 2470;
        techLevel.put(2470, techLevel.get(3071));
        availRating = new int[] { RATING_X, RATING_B, RATING_A };
        techRating = RATING_D;
    }
}
