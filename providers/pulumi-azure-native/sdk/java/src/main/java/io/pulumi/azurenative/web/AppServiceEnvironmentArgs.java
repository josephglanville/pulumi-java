// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.LoadBalancingMode;
import io.pulumi.azurenative.web.inputs.NameValuePairArgs;
import io.pulumi.azurenative.web.inputs.VirtualNetworkProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppServiceEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServiceEnvironmentArgs Empty = new AppServiceEnvironmentArgs();

    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    @Import(name="clusterSettings")
      private final @Nullable Output<List<NameValuePairArgs>> clusterSettings;

    public Output<List<NameValuePairArgs>> getClusterSettings() {
        return this.clusterSettings == null ? Codegen.empty() : this.clusterSettings;
    }

    /**
     * DNS suffix of the App Service Environment.
     * 
     */
    @Import(name="dnsSuffix")
      private final @Nullable Output<String> dnsSuffix;

    public Output<String> getDnsSuffix() {
        return this.dnsSuffix == null ? Codegen.empty() : this.dnsSuffix;
    }

    /**
     * Scale factor for front-ends.
     * 
     */
    @Import(name="frontEndScaleFactor")
      private final @Nullable Output<Integer> frontEndScaleFactor;

    public Output<Integer> getFrontEndScaleFactor() {
        return this.frontEndScaleFactor == null ? Codegen.empty() : this.frontEndScaleFactor;
    }

    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    @Import(name="internalLoadBalancingMode")
      private final @Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode;

    public Output<Either<String,LoadBalancingMode>> getInternalLoadBalancingMode() {
        return this.internalLoadBalancingMode == null ? Codegen.empty() : this.internalLoadBalancingMode;
    }

    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    @Import(name="ipsslAddressCount")
      private final @Nullable Output<Integer> ipsslAddressCount;

    public Output<Integer> getIpsslAddressCount() {
        return this.ipsslAddressCount == null ? Codegen.empty() : this.ipsslAddressCount;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
     */
    @Import(name="multiSize")
      private final @Nullable Output<String> multiSize;

    public Output<String> getMultiSize() {
        return this.multiSize == null ? Codegen.empty() : this.multiSize;
    }

    /**
     * Name of the App Service Environment.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
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
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * User added ip ranges to whitelist on ASE db
     * 
     */
    @Import(name="userWhitelistedIpRanges")
      private final @Nullable Output<List<String>> userWhitelistedIpRanges;

    public Output<List<String>> getUserWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges == null ? Codegen.empty() : this.userWhitelistedIpRanges;
    }

    /**
     * Description of the Virtual Network.
     * 
     */
    @Import(name="virtualNetwork", required=true)
      private final Output<VirtualNetworkProfileArgs> virtualNetwork;

    public Output<VirtualNetworkProfileArgs> getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public AppServiceEnvironmentArgs(
        @Nullable Output<List<NameValuePairArgs>> clusterSettings,
        @Nullable Output<String> dnsSuffix,
        @Nullable Output<Integer> frontEndScaleFactor,
        @Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode,
        @Nullable Output<Integer> ipsslAddressCount,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> multiSize,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<String>> userWhitelistedIpRanges,
        Output<VirtualNetworkProfileArgs> virtualNetwork) {
        this.clusterSettings = clusterSettings;
        this.dnsSuffix = dnsSuffix;
        this.frontEndScaleFactor = frontEndScaleFactor;
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        this.ipsslAddressCount = ipsslAddressCount;
        this.kind = kind;
        this.location = location;
        this.multiSize = multiSize;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        this.virtualNetwork = Objects.requireNonNull(virtualNetwork, "expected parameter 'virtualNetwork' to be non-null");
    }

    private AppServiceEnvironmentArgs() {
        this.clusterSettings = Codegen.empty();
        this.dnsSuffix = Codegen.empty();
        this.frontEndScaleFactor = Codegen.empty();
        this.internalLoadBalancingMode = Codegen.empty();
        this.ipsslAddressCount = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.multiSize = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.userWhitelistedIpRanges = Codegen.empty();
        this.virtualNetwork = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NameValuePairArgs>> clusterSettings;
        private @Nullable Output<String> dnsSuffix;
        private @Nullable Output<Integer> frontEndScaleFactor;
        private @Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode;
        private @Nullable Output<Integer> ipsslAddressCount;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> multiSize;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<String>> userWhitelistedIpRanges;
        private Output<VirtualNetworkProfileArgs> virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.frontEndScaleFactor = defaults.frontEndScaleFactor;
    	      this.internalLoadBalancingMode = defaults.internalLoadBalancingMode;
    	      this.ipsslAddressCount = defaults.ipsslAddressCount;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.multiSize = defaults.multiSize;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.userWhitelistedIpRanges = defaults.userWhitelistedIpRanges;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder clusterSettings(@Nullable Output<List<NameValuePairArgs>> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }
        public Builder clusterSettings(@Nullable List<NameValuePairArgs> clusterSettings) {
            this.clusterSettings = Codegen.ofNullable(clusterSettings);
            return this;
        }
        public Builder clusterSettings(NameValuePairArgs... clusterSettings) {
            return clusterSettings(List.of(clusterSettings));
        }
        public Builder dnsSuffix(@Nullable Output<String> dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }
        public Builder dnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = Codegen.ofNullable(dnsSuffix);
            return this;
        }
        public Builder frontEndScaleFactor(@Nullable Output<Integer> frontEndScaleFactor) {
            this.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }
        public Builder frontEndScaleFactor(@Nullable Integer frontEndScaleFactor) {
            this.frontEndScaleFactor = Codegen.ofNullable(frontEndScaleFactor);
            return this;
        }
        public Builder internalLoadBalancingMode(@Nullable Output<Either<String,LoadBalancingMode>> internalLoadBalancingMode) {
            this.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }
        public Builder internalLoadBalancingMode(@Nullable Either<String,LoadBalancingMode> internalLoadBalancingMode) {
            this.internalLoadBalancingMode = Codegen.ofNullable(internalLoadBalancingMode);
            return this;
        }
        public Builder ipsslAddressCount(@Nullable Output<Integer> ipsslAddressCount) {
            this.ipsslAddressCount = ipsslAddressCount;
            return this;
        }
        public Builder ipsslAddressCount(@Nullable Integer ipsslAddressCount) {
            this.ipsslAddressCount = Codegen.ofNullable(ipsslAddressCount);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder multiSize(@Nullable Output<String> multiSize) {
            this.multiSize = multiSize;
            return this;
        }
        public Builder multiSize(@Nullable String multiSize) {
            this.multiSize = Codegen.ofNullable(multiSize);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userWhitelistedIpRanges(@Nullable Output<List<String>> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = userWhitelistedIpRanges;
            return this;
        }
        public Builder userWhitelistedIpRanges(@Nullable List<String> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = Codegen.ofNullable(userWhitelistedIpRanges);
            return this;
        }
        public Builder userWhitelistedIpRanges(String... userWhitelistedIpRanges) {
            return userWhitelistedIpRanges(List.of(userWhitelistedIpRanges));
        }
        public Builder virtualNetwork(Output<VirtualNetworkProfileArgs> virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }
        public Builder virtualNetwork(VirtualNetworkProfileArgs virtualNetwork) {
            this.virtualNetwork = Output.of(Objects.requireNonNull(virtualNetwork));
            return this;
        }        public AppServiceEnvironmentArgs build() {
            return new AppServiceEnvironmentArgs(clusterSettings, dnsSuffix, frontEndScaleFactor, internalLoadBalancingMode, ipsslAddressCount, kind, location, multiSize, name, resourceGroupName, tags, userWhitelistedIpRanges, virtualNetwork);
        }
    }
}
