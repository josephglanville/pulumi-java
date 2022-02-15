// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookResourceSystemDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotebookResourceSystemDataArgs Empty = new NotebookResourceSystemDataArgs();

    @InputImport(name="createdAt")
    private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    @InputImport(name="createdBy")
    private final @Nullable Input<String> createdBy;

    public Input<String> getCreatedBy() {
        return this.createdBy == null ? Input.empty() : this.createdBy;
    }

    @InputImport(name="createdByType")
    private final @Nullable Input<String> createdByType;

    public Input<String> getCreatedByType() {
        return this.createdByType == null ? Input.empty() : this.createdByType;
    }

    @InputImport(name="lastModifiedAt")
    private final @Nullable Input<String> lastModifiedAt;

    public Input<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Input.empty() : this.lastModifiedAt;
    }

    @InputImport(name="lastModifiedBy")
    private final @Nullable Input<String> lastModifiedBy;

    public Input<String> getLastModifiedBy() {
        return this.lastModifiedBy == null ? Input.empty() : this.lastModifiedBy;
    }

    @InputImport(name="lastModifiedByType")
    private final @Nullable Input<String> lastModifiedByType;

    public Input<String> getLastModifiedByType() {
        return this.lastModifiedByType == null ? Input.empty() : this.lastModifiedByType;
    }

    public NotebookResourceSystemDataArgs(
        @Nullable Input<String> createdAt,
        @Nullable Input<String> createdBy,
        @Nullable Input<String> createdByType,
        @Nullable Input<String> lastModifiedAt,
        @Nullable Input<String> lastModifiedBy,
        @Nullable Input<String> lastModifiedByType) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
    }

    private NotebookResourceSystemDataArgs() {
        this.createdAt = Input.empty();
        this.createdBy = Input.empty();
        this.createdByType = Input.empty();
        this.lastModifiedAt = Input.empty();
        this.lastModifiedBy = Input.empty();
        this.lastModifiedByType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookResourceSystemDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> createdBy;
        private @Nullable Input<String> createdByType;
        private @Nullable Input<String> lastModifiedAt;
        private @Nullable Input<String> lastModifiedBy;
        private @Nullable Input<String> lastModifiedByType;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookResourceSystemDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setCreatedBy(@Nullable Input<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = Input.ofNullable(createdBy);
            return this;
        }

        public Builder setCreatedByType(@Nullable Input<String> createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = Input.ofNullable(createdByType);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable Input<String> lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = Input.ofNullable(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(@Nullable Input<String> lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = Input.ofNullable(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedByType(@Nullable Input<String> lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = Input.ofNullable(lastModifiedByType);
            return this;
        }

        public NotebookResourceSystemDataArgs build() {
            return new NotebookResourceSystemDataArgs(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}