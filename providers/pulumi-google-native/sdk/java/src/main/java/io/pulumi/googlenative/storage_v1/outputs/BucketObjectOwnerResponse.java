// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketObjectOwnerResponse {
    /**
     * The entity, in the form user-userId.
     * 
     */
    private final String entity;
    /**
     * The ID for the entity.
     * 
     */
    private final String entityId;

    @CustomType.Constructor
    private BucketObjectOwnerResponse(
        @CustomType.Parameter("entity") String entity,
        @CustomType.Parameter("entityId") String entityId) {
        this.entity = entity;
        this.entityId = entityId;
    }

    /**
     * The entity, in the form user-userId.
     * 
    */
    public String getEntity() {
        return this.entity;
    }
    /**
     * The ID for the entity.
     * 
    */
    public String getEntityId() {
        return this.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectOwnerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entity;
        private String entityId;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectOwnerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
        }

        public Builder entity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }
        public Builder entityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }        public BucketObjectOwnerResponse build() {
            return new BucketObjectOwnerResponse(entity, entityId);
        }
    }
}
