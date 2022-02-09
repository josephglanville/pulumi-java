// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SystemDataResponse {
    private final @Nullable String createdAt;
    private final @Nullable String createdBy;
    private final @Nullable String createdByType;
    private final @Nullable String lastModifiedAt;
    private final @Nullable String lastModifiedBy;
    private final @Nullable String lastModifiedByType;

    @OutputCustomType.Constructor({"createdAt","createdBy","createdByType","lastModifiedAt","lastModifiedBy","lastModifiedByType"})
    private SystemDataResponse(
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

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public Optional<String> getCreatedByType() {
        return Optional.ofNullable(this.createdByType);
    }
    public Optional<String> getLastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    public Optional<String> getLastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
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

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public SystemDataResponse build() {
            return new SystemDataResponse(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}
