/*
 * Copyright 2013 Urban Airship and Contributors
 */

package com.urbanairship.api.push.model.audience.location;

import org.joda.time.DateTime;

public interface DateRange {
    DateTime getStart();
    DateTime getEnd();
    DateRangeUnit getResolution();
    PresenceTimeframe getTimeframe();
}
