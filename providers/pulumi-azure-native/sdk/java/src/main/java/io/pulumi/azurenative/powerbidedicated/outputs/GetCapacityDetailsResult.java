// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbidedicated.outputs;

import io.pulumi.azurenative.powerbidedicated.outputs.CapacitySkuResponse;
import io.pulumi.azurenative.powerbidedicated.outputs.DedicatedCapacityAdministratorsResponse;
import io.pulumi.azurenative.powerbidedicated.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCapacityDetailsResult {
    private final @Nullable DedicatedCapacityAdministratorsResponse administration;
    private final String friendlyName;
    private final String id;
    private final String location;
    private final @Nullable String mode;
    private final String name;
    private final String provisioningState;
    private final CapacitySkuResponse sku;
    private final String state;
    private final @Nullable SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String tenantId;
    private final String type;

    @OutputCustomType.Constructor({"administration","friendlyName","id","location","mode","name","provisioningState","sku","state","systemData","tags","tenantId","type"})
    private GetCapacityDetailsResult(
        @Nullable DedicatedCapacityAdministratorsResponse administration,
        String friendlyName,
        String id,
        String location,
        @Nullable String mode,
        String name,
        String provisioningState,
        CapacitySkuResponse sku,
        String state,
        @Nullable SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String tenantId,
        String type) {
        this.administration = administration;
        this.friendlyName = Objects.requireNonNull(friendlyName);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.mode = mode;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = Objects.requireNonNull(sku);
        this.state = Objects.requireNonNull(state);
        this.systemData = systemData;
        this.tags = tags;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<DedicatedCapacityAdministratorsResponse> getAdministration() {
        return Optional.ofNullable(this.administration);
    }
    public String getFriendlyName() {
        return this.friendlyName;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public CapacitySkuResponse getSku() {
        return this.sku;
    }
    public String getState() {
        return this.state;
    }
    public Optional<SystemDataResponse> getSystemData() {
        return Optional.ofNullable(this.systemData);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DedicatedCapacityAdministratorsResponse administration;
        private String friendlyName;
        private String id;
        private String location;
        private @Nullable String mode;
        private String name;
        private String provisioningState;
        private CapacitySkuResponse sku;
        private String state;
        private @Nullable SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administration = defaults.administration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAdministration(@Nullable DedicatedCapacityAdministratorsResponse administration) {
            this.administration = administration;
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
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

        public Builder setSku(CapacitySkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSystemData(@Nullable SystemDataResponse systemData) {
            this.systemData = systemData;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCapacityDetailsResult build() {
            return new GetCapacityDetailsResult(administration, friendlyName, id, location, mode, name, provisioningState, sku, state, systemData, tags, tenantId, type);
        }
    }
}
