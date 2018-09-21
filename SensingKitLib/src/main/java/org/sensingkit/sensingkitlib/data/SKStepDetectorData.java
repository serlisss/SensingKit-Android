/*
 * Copyright (c) 2014. Kleomenis Katevas
 * Kleomenis Katevas, k.katevas@imperial.ac.uk
 *
 * This file is part of SensingKit-Android library.
 * For more information, please visit http://www.sensingkit.org
 *
 * SensingKit-Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SensingKit-Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with SensingKit-Android.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sensingkit.sensingkitlib.data;

import org.sensingkit.sensingkitlib.SKSensorType;

import java.util.Locale;

/**
 *  An instance of SKStepCounterData encapsulates measurements related to the Step Counter sensor.
 */
public class SKStepDetectorData extends SKAbstractData {

    @SuppressWarnings("unused")
    private static final String TAG = SKStepDetectorData.class.getName();

    /**
     * Initialize the instance
     *
     * @param timestamp Time in milliseconds (the difference between the current time and midnight, January 1, 1970 UTC)
     */
    public SKStepDetectorData(long timestamp) {

        super(SKSensorType.STEP_DETECTOR, timestamp);
    }

    /**
     * Get the csv header of the Step Counter sensor data
     *
     * @return String with a CSV formatted header that describes the data of the Step Counter sensor.
     */
    @SuppressWarnings("unused")
    public static String csvHeader() {
        return "timeIntervalSince1970";
    }

    /**
     * Get Step Detector sensor data in CSV format
     *
     * @return String in CSV format: timeIntervalSince1970
     */
    @Override
    public String getDataInCSV() {
        return String.format(Locale.US, "%d", this.timestamp);
    }

}
