// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EntityKeyResponse {
    /**
     * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private EntityKeyResponse(@CustomType.Parameter("namespace") String namespace) {
        this.namespace = namespace;
    }

    /**
     * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public EntityKeyResponse build() {
            return new EntityKeyResponse(namespace);
        }
    }
}
