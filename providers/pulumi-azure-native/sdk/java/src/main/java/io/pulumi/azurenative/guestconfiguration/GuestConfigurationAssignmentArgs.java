// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration;

import io.pulumi.azurenative.guestconfiguration.inputs.GuestConfigurationAssignmentPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestConfigurationAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationAssignmentArgs Empty = new GuestConfigurationAssignmentArgs();

    @InputImport(name="guestConfigurationAssignmentName")
    private final @Nullable Input<String> guestConfigurationAssignmentName;

    public Input<String> getGuestConfigurationAssignmentName() {
        return this.guestConfigurationAssignmentName == null ? Input.empty() : this.guestConfigurationAssignmentName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="properties")
    private final @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties;

    public Input<GuestConfigurationAssignmentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="vmName", required=true)
    private final Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName;
    }

    public GuestConfigurationAssignmentArgs(
        @Nullable Input<String> guestConfigurationAssignmentName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> vmName) {
        this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GuestConfigurationAssignmentArgs() {
        this.guestConfigurationAssignmentName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.vmName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> guestConfigurationAssignmentName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestConfigurationAssignmentName = defaults.guestConfigurationAssignmentName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmName = defaults.vmName;
        }

        public Builder setGuestConfigurationAssignmentName(@Nullable Input<String> guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
            return this;
        }

        public Builder setGuestConfigurationAssignmentName(@Nullable String guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = Input.ofNullable(guestConfigurationAssignmentName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable GuestConfigurationAssignmentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVmName(Input<String> vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Input.of(Objects.requireNonNull(vmName));
            return this;
        }

        public GuestConfigurationAssignmentArgs build() {
            return new GuestConfigurationAssignmentArgs(guestConfigurationAssignmentName, location, name, properties, resourceGroupName, vmName);
        }
    }
}
