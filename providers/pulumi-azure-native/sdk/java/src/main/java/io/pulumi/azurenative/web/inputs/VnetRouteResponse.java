// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VnetRouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final VnetRouteResponse Empty = new VnetRouteResponse();

    @InputImport(name="endAddress")
    private final @Nullable String endAddress;

    public Optional<String> getEndAddress() {
        return this.endAddress == null ? Optional.empty() : Optional.ofNullable(this.endAddress);
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="kind")
    private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="routeType")
    private final @Nullable String routeType;

    public Optional<String> getRouteType() {
        return this.routeType == null ? Optional.empty() : Optional.ofNullable(this.routeType);
    }

    @InputImport(name="startAddress")
    private final @Nullable String startAddress;

    public Optional<String> getStartAddress() {
        return this.startAddress == null ? Optional.empty() : Optional.ofNullable(this.startAddress);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public VnetRouteResponse(
        @Nullable String endAddress,
        String id,
        @Nullable String kind,
        String name,
        @Nullable String routeType,
        @Nullable String startAddress,
        String type) {
        this.endAddress = endAddress;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routeType = routeType;
        this.startAddress = startAddress;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VnetRouteResponse() {
        this.endAddress = null;
        this.id = null;
        this.kind = null;
        this.name = null;
        this.routeType = null;
        this.startAddress = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endAddress;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String routeType;
        private @Nullable String startAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAddress = defaults.endAddress;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routeType = defaults.routeType;
    	      this.startAddress = defaults.startAddress;
    	      this.type = defaults.type;
        }

        public Builder setEndAddress(@Nullable String endAddress) {
            this.endAddress = endAddress;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setRouteType(@Nullable String routeType) {
            this.routeType = routeType;
            return this;
        }

        public Builder setStartAddress(@Nullable String startAddress) {
            this.startAddress = startAddress;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VnetRouteResponse build() {
            return new VnetRouteResponse(endAddress, id, kind, name, routeType, startAddress, type);
        }
    }
}
