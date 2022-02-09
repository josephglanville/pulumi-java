// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGuestConfigurationHCRPAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGuestConfigurationHCRPAssignmentArgs Empty = new GetGuestConfigurationHCRPAssignmentArgs();

    @InputImport(name="guestConfigurationAssignmentName", required=true)
    private final String guestConfigurationAssignmentName;

    public String getGuestConfigurationAssignmentName() {
        return this.guestConfigurationAssignmentName;
    }

    @InputImport(name="machineName", required=true)
    private final String machineName;

    public String getMachineName() {
        return this.machineName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGuestConfigurationHCRPAssignmentArgs(
        String guestConfigurationAssignmentName,
        String machineName,
        String resourceGroupName) {
        this.guestConfigurationAssignmentName = Objects.requireNonNull(guestConfigurationAssignmentName, "expected parameter 'guestConfigurationAssignmentName' to be non-null");
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGuestConfigurationHCRPAssignmentArgs() {
        this.guestConfigurationAssignmentName = null;
        this.machineName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestConfigurationHCRPAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String guestConfigurationAssignmentName;
        private String machineName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestConfigurationHCRPAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestConfigurationAssignmentName = defaults.guestConfigurationAssignmentName;
    	      this.machineName = defaults.machineName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGuestConfigurationAssignmentName(String guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = Objects.requireNonNull(guestConfigurationAssignmentName);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetGuestConfigurationHCRPAssignmentArgs build() {
            return new GetGuestConfigurationHCRPAssignmentArgs(guestConfigurationAssignmentName, machineName, resourceGroupName);
        }
    }
}
