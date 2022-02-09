// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLinkedServerResult {
    private final String id;
    private final String linkedRedisCacheId;
    private final String linkedRedisCacheLocation;
    private final String name;
    private final String provisioningState;
    private final String serverRole;
    private final String type;

    @OutputCustomType.Constructor({"id","linkedRedisCacheId","linkedRedisCacheLocation","name","provisioningState","serverRole","type"})
    private GetLinkedServerResult(
        String id,
        String linkedRedisCacheId,
        String linkedRedisCacheLocation,
        String name,
        String provisioningState,
        String serverRole,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.linkedRedisCacheId = Objects.requireNonNull(linkedRedisCacheId);
        this.linkedRedisCacheLocation = Objects.requireNonNull(linkedRedisCacheLocation);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.serverRole = Objects.requireNonNull(serverRole);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getLinkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }
    public String getLinkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getServerRole() {
        return this.serverRole;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String linkedRedisCacheId;
        private String linkedRedisCacheLocation;
        private String name;
        private String provisioningState;
        private String serverRole;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedRedisCacheId = defaults.linkedRedisCacheId;
    	      this.linkedRedisCacheLocation = defaults.linkedRedisCacheLocation;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serverRole = defaults.serverRole;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkedRedisCacheId(String linkedRedisCacheId) {
            this.linkedRedisCacheId = Objects.requireNonNull(linkedRedisCacheId);
            return this;
        }

        public Builder setLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
            this.linkedRedisCacheLocation = Objects.requireNonNull(linkedRedisCacheLocation);
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

        public Builder setServerRole(String serverRole) {
            this.serverRole = Objects.requireNonNull(serverRole);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetLinkedServerResult build() {
            return new GetLinkedServerResult(id, linkedRedisCacheId, linkedRedisCacheLocation, name, provisioningState, serverRole, type);
        }
    }
}
