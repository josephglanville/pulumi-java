// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAADDataConnectorResult {
    private final @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
    private final @Nullable String etag;
    private final String id;
    private final String kind;
    private final String name;
    private final @Nullable String tenantId;
    private final String type;

    @OutputCustomType.Constructor({"dataTypes","etag","id","kind","name","tenantId","type"})
    private GetAADDataConnectorResult(
        @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes,
        @Nullable String etag,
        String id,
        String kind,
        String name,
        @Nullable String tenantId,
        String type) {
        this.dataTypes = dataTypes;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAADDataConnectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlertsDataTypeOfDataConnectorResponse dataTypes;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String name;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAADDataConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setDataTypes(@Nullable AlertsDataTypeOfDataConnectorResponse dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetAADDataConnectorResult build() {
            return new GetAADDataConnectorResult(dataTypes, etag, id, kind, name, tenantId, type);
        }
    }
}
