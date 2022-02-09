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
public final class GetSecurityUserConfigurationResult {
    private final @Nullable String deleteExistingNSGs;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final String etag;
    private final String id;
    private final String name;
    private final String provisioningState;
    private final @Nullable String securityType;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"deleteExistingNSGs","description","displayName","etag","id","name","provisioningState","securityType","systemData","type"})
    private GetSecurityUserConfigurationResult(
        @Nullable String deleteExistingNSGs,
        @Nullable String description,
        @Nullable String displayName,
        String etag,
        String id,
        String name,
        String provisioningState,
        @Nullable String securityType,
        SystemDataResponse systemData,
        String type) {
        this.deleteExistingNSGs = deleteExistingNSGs;
        this.description = description;
        this.displayName = displayName;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.securityType = securityType;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDeleteExistingNSGs() {
        return Optional.ofNullable(this.deleteExistingNSGs);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
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
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSecurityType() {
        return Optional.ofNullable(this.securityType);
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

    public static Builder builder(GetSecurityUserConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteExistingNSGs;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable String securityType;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityUserConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteExistingNSGs = defaults.deleteExistingNSGs;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityType = defaults.securityType;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDeleteExistingNSGs(@Nullable String deleteExistingNSGs) {
            this.deleteExistingNSGs = deleteExistingNSGs;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecurityType(@Nullable String securityType) {
            this.securityType = securityType;
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

        public GetSecurityUserConfigurationResult build() {
            return new GetSecurityUserConfigurationResult(deleteExistingNSGs, description, displayName, etag, id, name, provisioningState, securityType, systemData, type);
        }
    }
}
