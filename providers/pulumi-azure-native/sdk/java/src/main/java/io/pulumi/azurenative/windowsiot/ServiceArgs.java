// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsiot;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Windows IoT Device Service OEM AAD domain
     * 
     */
    @InputImport(name="adminDomainName")
      private final @Nullable Input<String> adminDomainName;

    public Input<String> getAdminDomainName() {
        return this.adminDomainName == null ? Input.empty() : this.adminDomainName;
    }

    /**
     * Windows IoT Device Service ODM AAD domain
     * 
     */
    @InputImport(name="billingDomainName")
      private final @Nullable Input<String> billingDomainName;

    public Input<String> getBillingDomainName() {
        return this.billingDomainName == null ? Input.empty() : this.billingDomainName;
    }

    /**
     * The name of the Windows IoT Device Service.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * The Azure Region where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Windows IoT Device Service notes.
     * 
     */
    @InputImport(name="notes")
      private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * Windows IoT Device Service device allocation,
     * 
     */
    @InputImport(name="quantity")
      private final @Nullable Input<Double> quantity;

    public Input<Double> getQuantity() {
        return this.quantity == null ? Input.empty() : this.quantity;
    }

    /**
     * The name of the resource group that contains the Windows IoT Device Service.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceArgs(
        @Nullable Input<String> adminDomainName,
        @Nullable Input<String> billingDomainName,
        @Nullable Input<String> deviceName,
        @Nullable Input<String> location,
        @Nullable Input<String> notes,
        @Nullable Input<Double> quantity,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.adminDomainName = adminDomainName;
        this.billingDomainName = billingDomainName;
        this.deviceName = deviceName;
        this.location = location;
        this.notes = notes;
        this.quantity = quantity;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ServiceArgs() {
        this.adminDomainName = Input.empty();
        this.billingDomainName = Input.empty();
        this.deviceName = Input.empty();
        this.location = Input.empty();
        this.notes = Input.empty();
        this.quantity = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adminDomainName;
        private @Nullable Input<String> billingDomainName;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> notes;
        private @Nullable Input<Double> quantity;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminDomainName = defaults.adminDomainName;
    	      this.billingDomainName = defaults.billingDomainName;
    	      this.deviceName = defaults.deviceName;
    	      this.location = defaults.location;
    	      this.notes = defaults.notes;
    	      this.quantity = defaults.quantity;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAdminDomainName(@Nullable Input<String> adminDomainName) {
            this.adminDomainName = adminDomainName;
            return this;
        }

        public Builder setAdminDomainName(@Nullable String adminDomainName) {
            this.adminDomainName = Input.ofNullable(adminDomainName);
            return this;
        }

        public Builder setBillingDomainName(@Nullable Input<String> billingDomainName) {
            this.billingDomainName = billingDomainName;
            return this;
        }

        public Builder setBillingDomainName(@Nullable String billingDomainName) {
            this.billingDomainName = Input.ofNullable(billingDomainName);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
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

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setQuantity(@Nullable Input<Double> quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setQuantity(@Nullable Double quantity) {
            this.quantity = Input.ofNullable(quantity);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(adminDomainName, billingDomainName, deviceName, location, notes, quantity, resourceGroupName, tags);
        }
    }
}
