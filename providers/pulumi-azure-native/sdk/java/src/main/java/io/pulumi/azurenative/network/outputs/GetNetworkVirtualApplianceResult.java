// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualApplianceNicPropertiesResponse;
import io.pulumi.azurenative.network.outputs.VirtualApplianceSkuPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkVirtualApplianceResult {
    private final String addressPrefix;
    private final @Nullable List<String> bootStrapConfigurationBlobs;
    private final @Nullable String cloudInitConfiguration;
    private final @Nullable List<String> cloudInitConfigurationBlobs;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable ManagedServiceIdentityResponse identity;
    private final List<SubResourceResponse> inboundSecurityRules;
    private final @Nullable String location;
    private final String name;
    private final @Nullable VirtualApplianceSkuPropertiesResponse nvaSku;
    private final String provisioningState;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable Double virtualApplianceAsn;
    private final List<VirtualApplianceNicPropertiesResponse> virtualApplianceNics;
    private final List<SubResourceResponse> virtualApplianceSites;
    private final @Nullable SubResourceResponse virtualHub;

    @OutputCustomType.Constructor({"addressPrefix","bootStrapConfigurationBlobs","cloudInitConfiguration","cloudInitConfigurationBlobs","etag","id","identity","inboundSecurityRules","location","name","nvaSku","provisioningState","tags","type","virtualApplianceAsn","virtualApplianceNics","virtualApplianceSites","virtualHub"})
    private GetNetworkVirtualApplianceResult(
        String addressPrefix,
        @Nullable List<String> bootStrapConfigurationBlobs,
        @Nullable String cloudInitConfiguration,
        @Nullable List<String> cloudInitConfigurationBlobs,
        String etag,
        @Nullable String id,
        @Nullable ManagedServiceIdentityResponse identity,
        List<SubResourceResponse> inboundSecurityRules,
        @Nullable String location,
        String name,
        @Nullable VirtualApplianceSkuPropertiesResponse nvaSku,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable Double virtualApplianceAsn,
        List<VirtualApplianceNicPropertiesResponse> virtualApplianceNics,
        List<SubResourceResponse> virtualApplianceSites,
        @Nullable SubResourceResponse virtualHub) {
        this.addressPrefix = Objects.requireNonNull(addressPrefix);
        this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
        this.cloudInitConfiguration = cloudInitConfiguration;
        this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.identity = identity;
        this.inboundSecurityRules = Objects.requireNonNull(inboundSecurityRules);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.nvaSku = nvaSku;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualApplianceAsn = virtualApplianceAsn;
        this.virtualApplianceNics = Objects.requireNonNull(virtualApplianceNics);
        this.virtualApplianceSites = Objects.requireNonNull(virtualApplianceSites);
        this.virtualHub = virtualHub;
    }

    public String getAddressPrefix() {
        return this.addressPrefix;
    }
    public List<String> getBootStrapConfigurationBlobs() {
        return this.bootStrapConfigurationBlobs == null ? List.of() : this.bootStrapConfigurationBlobs;
    }
    public Optional<String> getCloudInitConfiguration() {
        return Optional.ofNullable(this.cloudInitConfiguration);
    }
    public List<String> getCloudInitConfigurationBlobs() {
        return this.cloudInitConfigurationBlobs == null ? List.of() : this.cloudInitConfigurationBlobs;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public List<SubResourceResponse> getInboundSecurityRules() {
        return this.inboundSecurityRules;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public Optional<VirtualApplianceSkuPropertiesResponse> getNvaSku() {
        return Optional.ofNullable(this.nvaSku);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Double> getVirtualApplianceAsn() {
        return Optional.ofNullable(this.virtualApplianceAsn);
    }
    public List<VirtualApplianceNicPropertiesResponse> getVirtualApplianceNics() {
        return this.virtualApplianceNics;
    }
    public List<SubResourceResponse> getVirtualApplianceSites() {
        return this.virtualApplianceSites;
    }
    public Optional<SubResourceResponse> getVirtualHub() {
        return Optional.ofNullable(this.virtualHub);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkVirtualApplianceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressPrefix;
        private @Nullable List<String> bootStrapConfigurationBlobs;
        private @Nullable String cloudInitConfiguration;
        private @Nullable List<String> cloudInitConfigurationBlobs;
        private String etag;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private List<SubResourceResponse> inboundSecurityRules;
        private @Nullable String location;
        private String name;
        private @Nullable VirtualApplianceSkuPropertiesResponse nvaSku;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Double virtualApplianceAsn;
        private List<VirtualApplianceNicPropertiesResponse> virtualApplianceNics;
        private List<SubResourceResponse> virtualApplianceSites;
        private @Nullable SubResourceResponse virtualHub;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkVirtualApplianceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.bootStrapConfigurationBlobs = defaults.bootStrapConfigurationBlobs;
    	      this.cloudInitConfiguration = defaults.cloudInitConfiguration;
    	      this.cloudInitConfigurationBlobs = defaults.cloudInitConfigurationBlobs;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.inboundSecurityRules = defaults.inboundSecurityRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nvaSku = defaults.nvaSku;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualApplianceAsn = defaults.virtualApplianceAsn;
    	      this.virtualApplianceNics = defaults.virtualApplianceNics;
    	      this.virtualApplianceSites = defaults.virtualApplianceSites;
    	      this.virtualHub = defaults.virtualHub;
        }

        public Builder setAddressPrefix(String addressPrefix) {
            this.addressPrefix = Objects.requireNonNull(addressPrefix);
            return this;
        }

        public Builder setBootStrapConfigurationBlobs(@Nullable List<String> bootStrapConfigurationBlobs) {
            this.bootStrapConfigurationBlobs = bootStrapConfigurationBlobs;
            return this;
        }

        public Builder setCloudInitConfiguration(@Nullable String cloudInitConfiguration) {
            this.cloudInitConfiguration = cloudInitConfiguration;
            return this;
        }

        public Builder setCloudInitConfigurationBlobs(@Nullable List<String> cloudInitConfigurationBlobs) {
            this.cloudInitConfigurationBlobs = cloudInitConfigurationBlobs;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInboundSecurityRules(List<SubResourceResponse> inboundSecurityRules) {
            this.inboundSecurityRules = Objects.requireNonNull(inboundSecurityRules);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNvaSku(@Nullable VirtualApplianceSkuPropertiesResponse nvaSku) {
            this.nvaSku = nvaSku;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualApplianceAsn(@Nullable Double virtualApplianceAsn) {
            this.virtualApplianceAsn = virtualApplianceAsn;
            return this;
        }

        public Builder setVirtualApplianceNics(List<VirtualApplianceNicPropertiesResponse> virtualApplianceNics) {
            this.virtualApplianceNics = Objects.requireNonNull(virtualApplianceNics);
            return this;
        }

        public Builder setVirtualApplianceSites(List<SubResourceResponse> virtualApplianceSites) {
            this.virtualApplianceSites = Objects.requireNonNull(virtualApplianceSites);
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceResponse virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public GetNetworkVirtualApplianceResult build() {
            return new GetNetworkVirtualApplianceResult(addressPrefix, bootStrapConfigurationBlobs, cloudInitConfiguration, cloudInitConfigurationBlobs, etag, id, identity, inboundSecurityRules, location, name, nvaSku, provisioningState, tags, type, virtualApplianceAsn, virtualApplianceNics, virtualApplianceSites, virtualHub);
        }
    }
}