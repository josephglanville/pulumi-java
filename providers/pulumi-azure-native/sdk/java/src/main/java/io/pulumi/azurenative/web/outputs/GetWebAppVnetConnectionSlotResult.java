// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.VnetRouteResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppVnetConnectionSlotResult {
    private final @Nullable String certBlob;
    private final String certThumbprint;
    private final @Nullable String dnsServers;
    private final String id;
    private final @Nullable Boolean isSwift;
    private final @Nullable String kind;
    private final String name;
    private final Boolean resyncRequired;
    private final List<VnetRouteResponse> routes;
    private final String type;
    private final @Nullable String vnetResourceId;

    @OutputCustomType.Constructor({"certBlob","certThumbprint","dnsServers","id","isSwift","kind","name","resyncRequired","routes","type","vnetResourceId"})
    private GetWebAppVnetConnectionSlotResult(
        @Nullable String certBlob,
        String certThumbprint,
        @Nullable String dnsServers,
        String id,
        @Nullable Boolean isSwift,
        @Nullable String kind,
        String name,
        Boolean resyncRequired,
        List<VnetRouteResponse> routes,
        String type,
        @Nullable String vnetResourceId) {
        this.certBlob = certBlob;
        this.certThumbprint = Objects.requireNonNull(certThumbprint);
        this.dnsServers = dnsServers;
        this.id = Objects.requireNonNull(id);
        this.isSwift = isSwift;
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.resyncRequired = Objects.requireNonNull(resyncRequired);
        this.routes = Objects.requireNonNull(routes);
        this.type = Objects.requireNonNull(type);
        this.vnetResourceId = vnetResourceId;
    }

    public Optional<String> getCertBlob() {
        return Optional.ofNullable(this.certBlob);
    }
    public String getCertThumbprint() {
        return this.certThumbprint;
    }
    public Optional<String> getDnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIsSwift() {
        return Optional.ofNullable(this.isSwift);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Boolean getResyncRequired() {
        return this.resyncRequired;
    }
    public List<VnetRouteResponse> getRoutes() {
        return this.routes;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVnetResourceId() {
        return Optional.ofNullable(this.vnetResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppVnetConnectionSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certBlob;
        private String certThumbprint;
        private @Nullable String dnsServers;
        private String id;
        private @Nullable Boolean isSwift;
        private @Nullable String kind;
        private String name;
        private Boolean resyncRequired;
        private List<VnetRouteResponse> routes;
        private String type;
        private @Nullable String vnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppVnetConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certBlob = defaults.certBlob;
    	      this.certThumbprint = defaults.certThumbprint;
    	      this.dnsServers = defaults.dnsServers;
    	      this.id = defaults.id;
    	      this.isSwift = defaults.isSwift;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.routes = defaults.routes;
    	      this.type = defaults.type;
    	      this.vnetResourceId = defaults.vnetResourceId;
        }

        public Builder setCertBlob(@Nullable String certBlob) {
            this.certBlob = certBlob;
            return this;
        }

        public Builder setCertThumbprint(String certThumbprint) {
            this.certThumbprint = Objects.requireNonNull(certThumbprint);
            return this;
        }

        public Builder setDnsServers(@Nullable String dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsSwift(@Nullable Boolean isSwift) {
            this.isSwift = isSwift;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResyncRequired(Boolean resyncRequired) {
            this.resyncRequired = Objects.requireNonNull(resyncRequired);
            return this;
        }

        public Builder setRoutes(List<VnetRouteResponse> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVnetResourceId(@Nullable String vnetResourceId) {
            this.vnetResourceId = vnetResourceId;
            return this;
        }

        public GetWebAppVnetConnectionSlotResult build() {
            return new GetWebAppVnetConnectionSlotResult(certBlob, certThumbprint, dnsServers, id, isSwift, kind, name, resyncRequired, routes, type, vnetResourceId);
        }
    }
}