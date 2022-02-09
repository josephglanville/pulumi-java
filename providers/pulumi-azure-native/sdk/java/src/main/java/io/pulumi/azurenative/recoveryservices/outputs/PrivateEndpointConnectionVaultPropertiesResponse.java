// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.VaultPrivateEndpointConnectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateEndpointConnectionVaultPropertiesResponse {
    private final String id;
    private final VaultPrivateEndpointConnectionResponse properties;

    @OutputCustomType.Constructor({"id","properties"})
    private PrivateEndpointConnectionVaultPropertiesResponse(
        String id,
        VaultPrivateEndpointConnectionResponse properties) {
        this.id = Objects.requireNonNull(id);
        this.properties = Objects.requireNonNull(properties);
    }

    public String getId() {
        return this.id;
    }
    public VaultPrivateEndpointConnectionResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private VaultPrivateEndpointConnectionResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProperties(VaultPrivateEndpointConnectionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public PrivateEndpointConnectionVaultPropertiesResponse build() {
            return new PrivateEndpointConnectionVaultPropertiesResponse(id, properties);
        }
    }
}
