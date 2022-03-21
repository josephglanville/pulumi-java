// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.CommissionedState;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomIPPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomIPPrefixArgs Empty = new CustomIPPrefixArgs();

    /**
     * The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     */
    @Import(name="cidr")
      private final @Nullable Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr == null ? Output.empty() : this.cidr;
    }

    /**
     * The commissioned state of the Custom IP Prefix.
     * 
     */
    @Import(name="commissionedState")
      private final @Nullable Output<Either<String,CommissionedState>> commissionedState;

    public Output<Either<String,CommissionedState>> getCommissionedState() {
        return this.commissionedState == null ? Output.empty() : this.commissionedState;
    }

    /**
     * The name of the custom IP prefix.
     * 
     */
    @Import(name="customIpPrefixName")
      private final @Nullable Output<String> customIpPrefixName;

    public Output<String> getCustomIpPrefixName() {
        return this.customIpPrefixName == null ? Output.empty() : this.customIpPrefixName;
    }

    /**
     * The extended location of the custom IP prefix.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public CustomIPPrefixArgs(
        @Nullable Output<String> cidr,
        @Nullable Output<Either<String,CommissionedState>> commissionedState,
        @Nullable Output<String> customIpPrefixName,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> zones) {
        this.cidr = cidr;
        this.commissionedState = commissionedState;
        this.customIpPrefixName = customIpPrefixName;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.zones = zones;
    }

    private CustomIPPrefixArgs() {
        this.cidr = Output.empty();
        this.commissionedState = Output.empty();
        this.customIpPrefixName = Output.empty();
        this.extendedLocation = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomIPPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidr;
        private @Nullable Output<Either<String,CommissionedState>> commissionedState;
        private @Nullable Output<String> customIpPrefixName;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomIPPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.commissionedState = defaults.commissionedState;
    	      this.customIpPrefixName = defaults.customIpPrefixName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            this.cidr = cidr;
            return this;
        }
        public Builder cidr(@Nullable String cidr) {
            this.cidr = Output.ofNullable(cidr);
            return this;
        }
        public Builder commissionedState(@Nullable Output<Either<String,CommissionedState>> commissionedState) {
            this.commissionedState = commissionedState;
            return this;
        }
        public Builder commissionedState(@Nullable Either<String,CommissionedState> commissionedState) {
            this.commissionedState = Output.ofNullable(commissionedState);
            return this;
        }
        public Builder customIpPrefixName(@Nullable Output<String> customIpPrefixName) {
            this.customIpPrefixName = customIpPrefixName;
            return this;
        }
        public Builder customIpPrefixName(@Nullable String customIpPrefixName) {
            this.customIpPrefixName = Output.ofNullable(customIpPrefixName);
            return this;
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public CustomIPPrefixArgs build() {
            return new CustomIPPrefixArgs(cidr, commissionedState, customIpPrefixName, extendedLocation, id, location, resourceGroupName, tags, zones);
        }
    }
}
