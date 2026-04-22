package com.scrapyard.management.Models.Enums;

public enum UnitOfMeasure {

                KILOGRAMS(1.0),
                POUNDS(0.453592),
                TONNES(1000.0);

                private final double toKg;

                UnitOfMeasure(double toKg) {
                        this.toKg = toKg;
                }

                public double toKilograms(double value) {
                        return value * toKg;
                }

}
