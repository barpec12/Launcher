/*
 * SK's Minecraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher.model.modpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class RequireAny implements Condition {

    private List<Feature> features = new ArrayList<Feature>();

    public RequireAny() {
    }

    public RequireAny(List<Feature> features) {
        this.features = features;
    }

    public RequireAny(Feature... feature) {
        features.addAll(Arrays.asList(feature));
    }

    @Override
    public boolean matches() {
        if (features == null) {
            return true;
        }

        for (Feature feature : features) {
            if (feature.isSelected()) {
                return true;
            }
        }

        return false;
    }

}
