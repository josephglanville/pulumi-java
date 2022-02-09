// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSwiftVirtualNetworkConnectionSlotResult {
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final @Nullable String subnetResourceId;
    private final @Nullable Boolean swiftSupported;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"id","kind","name","subnetResourceId","swiftSupported","systemData","type"})
    private GetWebAppSwiftVirtualNetworkConnectionSlotResult(
        String id,
        @Nullable String kind,
        String name,
        @Nullable String subnetResourceId,
        @Nullable Boolean swiftSupported,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.subnetResourceId = subnetResourceId;
        this.swiftSupported = swiftSupported;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getSubnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }
    public Optional<Boolean> getSwiftSupported() {
        return Optional.ofNullable(this.swiftSupported);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSwiftVirtualNetworkConnectionSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String subnetResourceId;
        private @Nullable Boolean swiftSupported;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSwiftVirtualNetworkConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.swiftSupported = defaults.swiftSupported;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
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

        public Builder setSubnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }

        public Builder setSwiftSupported(@Nullable Boolean swiftSupported) {
            this.swiftSupported = swiftSupported;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebAppSwiftVirtualNetworkConnectionSlotResult build() {
            return new GetWebAppSwiftVirtualNetworkConnectionSlotResult(id, kind, name, subnetResourceId, swiftSupported, systemData, type);
        }
    }
}
