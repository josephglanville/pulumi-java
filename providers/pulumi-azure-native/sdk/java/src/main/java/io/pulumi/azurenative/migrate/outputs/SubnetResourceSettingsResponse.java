// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.NsgReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubnetResourceSettingsResponse {
    /**
     * Gets or sets address prefix for the subnet.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * Gets or sets the Subnet name.
     * 
     */
    private final @Nullable String name;
    /**
     * Defines reference to NSG.
     * 
     */
    private final @Nullable NsgReferenceResponse networkSecurityGroup;

    @CustomType.Constructor
    private SubnetResourceSettingsResponse(
        @CustomType.Parameter("addressPrefix") @Nullable String addressPrefix,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("networkSecurityGroup") @Nullable NsgReferenceResponse networkSecurityGroup) {
        this.addressPrefix = addressPrefix;
        this.name = name;
        this.networkSecurityGroup = networkSecurityGroup;
    }

    /**
     * Gets or sets address prefix for the subnet.
     * 
    */
    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * Gets or sets the Subnet name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Defines reference to NSG.
     * 
    */
    public Optional<NsgReferenceResponse> getNetworkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable String name;
        private @Nullable NsgReferenceResponse networkSecurityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder networkSecurityGroup(@Nullable NsgReferenceResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }        public SubnetResourceSettingsResponse build() {
            return new SubnetResourceSettingsResponse(addressPrefix, name, networkSecurityGroup);
        }
    }
}
