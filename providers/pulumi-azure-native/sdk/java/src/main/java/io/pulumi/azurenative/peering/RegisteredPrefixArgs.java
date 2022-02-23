// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegisteredPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegisteredPrefixArgs Empty = new RegisteredPrefixArgs();

    /**
     * The name of the peering.
     * 
     */
    @InputImport(name="peeringName", required=true)
      private final Input<String> peeringName;

    public Input<String> getPeeringName() {
        return this.peeringName;
    }

    /**
     * The customer's prefix from which traffic originates.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * The name of the registered prefix.
     * 
     */
    @InputImport(name="registeredPrefixName")
      private final @Nullable Input<String> registeredPrefixName;

    public Input<String> getRegisteredPrefixName() {
        return this.registeredPrefixName == null ? Input.empty() : this.registeredPrefixName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public RegisteredPrefixArgs(
        Input<String> peeringName,
        @Nullable Input<String> prefix,
        @Nullable Input<String> registeredPrefixName,
        Input<String> resourceGroupName) {
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.prefix = prefix;
        this.registeredPrefixName = registeredPrefixName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private RegisteredPrefixArgs() {
        this.peeringName = Input.empty();
        this.prefix = Input.empty();
        this.registeredPrefixName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegisteredPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> peeringName;
        private @Nullable Input<String> prefix;
        private @Nullable Input<String> registeredPrefixName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegisteredPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringName = defaults.peeringName;
    	      this.prefix = defaults.prefix;
    	      this.registeredPrefixName = defaults.registeredPrefixName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPeeringName(Input<String> peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Input.of(Objects.requireNonNull(peeringName));
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setRegisteredPrefixName(@Nullable Input<String> registeredPrefixName) {
            this.registeredPrefixName = registeredPrefixName;
            return this;
        }

        public Builder setRegisteredPrefixName(@Nullable String registeredPrefixName) {
            this.registeredPrefixName = Input.ofNullable(registeredPrefixName);
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
        public RegisteredPrefixArgs build() {
            return new RegisteredPrefixArgs(peeringName, prefix, registeredPrefixName, resourceGroupName);
        }
    }
}
