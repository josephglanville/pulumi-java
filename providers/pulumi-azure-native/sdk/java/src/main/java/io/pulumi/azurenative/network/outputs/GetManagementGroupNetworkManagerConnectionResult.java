// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagementGroupNetworkManagerConnectionResult {
    private final @Nullable String description;
    private final String etag;
    private final String id;
    private final String name;
    private final @Nullable String networkManagerId;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"description","etag","id","name","networkManagerId","systemData","type"})
    private GetManagementGroupNetworkManagerConnectionResult(
        @Nullable String description,
        String etag,
        String id,
        String name,
        @Nullable String networkManagerId,
        SystemDataResponse systemData,
        String type) {
        this.description = description;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.networkManagerId = networkManagerId;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNetworkManagerId() {
        return Optional.ofNullable(this.networkManagerId);
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

    public static Builder builder(GetManagementGroupNetworkManagerConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String etag;
        private String id;
        private String name;
        private @Nullable String networkManagerId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupNetworkManagerConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkManagerId = defaults.networkManagerId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkManagerId(@Nullable String networkManagerId) {
            this.networkManagerId = networkManagerId;
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

        public GetManagementGroupNetworkManagerConnectionResult build() {
            return new GetManagementGroupNetworkManagerConnectionResult(description, etag, id, name, networkManagerId, systemData, type);
        }
    }
}
