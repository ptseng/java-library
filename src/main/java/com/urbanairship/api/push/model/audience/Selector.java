/*
 * Copyright 2013 Urban Airship and Contributors
 */

package com.urbanairship.api.push.model.audience;

import com.urbanairship.api.push.model.DeviceTypeData;

/**
 * The root of all selector expressions.
 */
public interface Selector {
    SelectorType getType();
    DeviceTypeData getApplicableDeviceTypes();
    void accept(SelectorVisitor visitor);
}
