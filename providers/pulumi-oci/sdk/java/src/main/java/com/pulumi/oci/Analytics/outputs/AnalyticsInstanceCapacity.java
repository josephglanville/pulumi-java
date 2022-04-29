// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Analytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsInstanceCapacity {
    /**
     * @return The capacity model to use.
     * 
     */
    private final String capacityType;
    /**
     * @return (Updatable) The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the number of CPUs, amount of memory or other resources allocated to the instance.
     * 
     */
    private final Integer capacityValue;

    @CustomType.Constructor
    private AnalyticsInstanceCapacity(
        @CustomType.Parameter("capacityType") String capacityType,
        @CustomType.Parameter("capacityValue") Integer capacityValue) {
        this.capacityType = capacityType;
        this.capacityValue = capacityValue;
    }

    /**
     * @return The capacity model to use.
     * 
     */
    public String capacityType() {
        return this.capacityType;
    }
    /**
     * @return (Updatable) The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the number of CPUs, amount of memory or other resources allocated to the instance.
     * 
     */
    public Integer capacityValue() {
        return this.capacityValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsInstanceCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityType;
        private Integer capacityValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsInstanceCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityType = defaults.capacityType;
    	      this.capacityValue = defaults.capacityValue;
        }

        public Builder capacityType(String capacityType) {
            this.capacityType = Objects.requireNonNull(capacityType);
            return this;
        }
        public Builder capacityValue(Integer capacityValue) {
            this.capacityValue = Objects.requireNonNull(capacityValue);
            return this;
        }        public AnalyticsInstanceCapacity build() {
            return new AnalyticsInstanceCapacity(capacityType, capacityValue);
        }
    }
}
