// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata pertaining to creation and last modification of the resource.
 * 
 */
public final class SystemDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final SystemDataResponse Empty = new SystemDataResponse();

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Import(name="createdAt")
      private final @Nullable String createdAt;

    public Optional<String> getCreatedAt() {
        return this.createdAt == null ? Optional.empty() : Optional.ofNullable(this.createdAt);
    }

    /**
     * The identity that created the resource.
     * 
     */
    @Import(name="createdBy")
      private final @Nullable String createdBy;

    public Optional<String> getCreatedBy() {
        return this.createdBy == null ? Optional.empty() : Optional.ofNullable(this.createdBy);
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @Import(name="createdByType")
      private final @Nullable String createdByType;

    public Optional<String> getCreatedByType() {
        return this.createdByType == null ? Optional.empty() : Optional.ofNullable(this.createdByType);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedAt")
      private final @Nullable String lastModifiedAt;

    public Optional<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedAt);
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedBy")
      private final @Nullable String lastModifiedBy;

    public Optional<String> getLastModifiedBy() {
        return this.lastModifiedBy == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedBy);
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Import(name="lastModifiedByType")
      private final @Nullable String lastModifiedByType;

    public Optional<String> getLastModifiedByType() {
        return this.lastModifiedByType == null ? Optional.empty() : Optional.ofNullable(this.lastModifiedByType);
    }

    public SystemDataResponse(
        @Nullable String createdAt,
        @Nullable String createdBy,
        @Nullable String createdByType,
        @Nullable String lastModifiedAt,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedByType) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
    }

    private SystemDataResponse() {
        this.createdAt = null;
        this.createdBy = null;
        this.createdByType = null;
        this.lastModifiedAt = null;
        this.lastModifiedBy = null;
        this.lastModifiedByType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }        public SystemDataResponse build() {
            return new SystemDataResponse(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}
