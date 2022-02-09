// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.outputs;

import io.pulumi.azurenative.customproviders.outputs.CustomRPActionRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPResourceTypeRouteDefinitionResponse;
import io.pulumi.azurenative.customproviders.outputs.CustomRPValidationsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCustomResourceProviderResult {
    private final @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
    private final String id;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<CustomRPValidationsResponse> validations;

    @OutputCustomType.Constructor({"actions","id","location","name","provisioningState","resourceTypes","tags","type","validations"})
    private GetCustomResourceProviderResult(
        @Nullable List<CustomRPActionRouteDefinitionResponse> actions,
        String id,
        String location,
        String name,
        String provisioningState,
        @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<CustomRPValidationsResponse> validations) {
        this.actions = actions;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceTypes = resourceTypes;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.validations = validations;
    }

    public List<CustomRPActionRouteDefinitionResponse> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<CustomRPResourceTypeRouteDefinitionResponse> getResourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<CustomRPValidationsResponse> getValidations() {
        return this.validations == null ? List.of() : this.validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomResourceProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<CustomRPValidationsResponse> validations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomResourceProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validations = defaults.validations;
        }

        public Builder setActions(@Nullable List<CustomRPActionRouteDefinitionResponse> actions) {
            this.actions = actions;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceTypes(@Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes) {
            this.resourceTypes = resourceTypes;
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

        public Builder setValidations(@Nullable List<CustomRPValidationsResponse> validations) {
            this.validations = validations;
            return this;
        }

        public GetCustomResourceProviderResult build() {
            return new GetCustomResourceProviderResult(actions, id, location, name, provisioningState, resourceTypes, tags, type, validations);
        }
    }
}
