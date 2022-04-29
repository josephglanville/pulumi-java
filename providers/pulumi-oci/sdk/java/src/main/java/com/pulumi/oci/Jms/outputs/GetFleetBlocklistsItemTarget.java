// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFleetBlocklistsItemTarget {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    private final String fleetId;
    /**
     * @return The unique identifier for the installation of Java Runtime at a specific path on a specific operating system.
     * 
     */
    private final String installationKey;
    /**
     * @return The Fleet-unique identifier of the related managed instance.
     * 
     */
    private final String managedInstanceId;

    @CustomType.Constructor
    private GetFleetBlocklistsItemTarget(
        @CustomType.Parameter("fleetId") String fleetId,
        @CustomType.Parameter("installationKey") String installationKey,
        @CustomType.Parameter("managedInstanceId") String managedInstanceId) {
        this.fleetId = fleetId;
        this.installationKey = installationKey;
        this.managedInstanceId = managedInstanceId;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    public String fleetId() {
        return this.fleetId;
    }
    /**
     * @return The unique identifier for the installation of Java Runtime at a specific path on a specific operating system.
     * 
     */
    public String installationKey() {
        return this.installationKey;
    }
    /**
     * @return The Fleet-unique identifier of the related managed instance.
     * 
     */
    public String managedInstanceId() {
        return this.managedInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetBlocklistsItemTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetId;
        private String installationKey;
        private String managedInstanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetBlocklistsItemTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
    	      this.installationKey = defaults.installationKey;
    	      this.managedInstanceId = defaults.managedInstanceId;
        }

        public Builder fleetId(String fleetId) {
            this.fleetId = Objects.requireNonNull(fleetId);
            return this;
        }
        public Builder installationKey(String installationKey) {
            this.installationKey = Objects.requireNonNull(installationKey);
            return this;
        }
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = Objects.requireNonNull(managedInstanceId);
            return this;
        }        public GetFleetBlocklistsItemTarget build() {
            return new GetFleetBlocklistsItemTarget(fleetId, installationKey, managedInstanceId);
        }
    }
}
