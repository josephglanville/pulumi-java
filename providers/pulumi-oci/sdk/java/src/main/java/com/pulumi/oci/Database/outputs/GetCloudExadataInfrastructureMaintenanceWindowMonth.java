// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudExadataInfrastructureMaintenanceWindowMonth {
    /**
     * @return Name of the month of the year.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetCloudExadataInfrastructureMaintenanceWindowMonth(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Name of the month of the year.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudExadataInfrastructureMaintenanceWindowMonth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudExadataInfrastructureMaintenanceWindowMonth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetCloudExadataInfrastructureMaintenanceWindowMonth build() {
            return new GetCloudExadataInfrastructureMaintenanceWindowMonth(name);
        }
    }
}
