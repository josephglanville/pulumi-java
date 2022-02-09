// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteResponse {
    private final @Nullable String addressPrefix;
    private final String etag;
    private final @Nullable Boolean hasBgpOverride;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable String nextHopIpAddress;
    private final String nextHopType;
    private final String provisioningState;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"addressPrefix","etag","hasBgpOverride","id","name","nextHopIpAddress","nextHopType","provisioningState","type"})
    private RouteResponse(
        @Nullable String addressPrefix,
        String etag,
        @Nullable Boolean hasBgpOverride,
        @Nullable String id,
        @Nullable String name,
        @Nullable String nextHopIpAddress,
        String nextHopType,
        String provisioningState,
        @Nullable String type) {
        this.addressPrefix = addressPrefix;
        this.etag = Objects.requireNonNull(etag);
        this.hasBgpOverride = hasBgpOverride;
        this.id = id;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
        this.nextHopType = Objects.requireNonNull(nextHopType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = type;
    }

    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<Boolean> getHasBgpOverride() {
        return Optional.ofNullable(this.hasBgpOverride);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getNextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }
    public String getNextHopType() {
        return this.nextHopType;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String etag;
        private @Nullable Boolean hasBgpOverride;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String nextHopIpAddress;
        private String nextHopType;
        private String provisioningState;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.etag = defaults.etag;
    	      this.hasBgpOverride = defaults.hasBgpOverride;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
    	      this.nextHopType = defaults.nextHopType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHasBgpOverride(@Nullable Boolean hasBgpOverride) {
            this.hasBgpOverride = hasBgpOverride;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public RouteResponse build() {
            return new RouteResponse(addressPrefix, etag, hasBgpOverride, id, name, nextHopIpAddress, nextHopType, provisioningState, type);
        }
    }
}
