// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.azurenative.management.outputs.ManagementGroupPathElementResponse;
import io.pulumi.azurenative.management.outputs.ParentGroupInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagementGroupDetailsResponse {
    private final @Nullable ParentGroupInfoResponse parent;
    private final @Nullable List<ManagementGroupPathElementResponse> path;
    private final @Nullable String updatedBy;
    private final @Nullable String updatedTime;
    private final @Nullable Double version;

    @OutputCustomType.Constructor({"parent","path","updatedBy","updatedTime","version"})
    private ManagementGroupDetailsResponse(
        @Nullable ParentGroupInfoResponse parent,
        @Nullable List<ManagementGroupPathElementResponse> path,
        @Nullable String updatedBy,
        @Nullable String updatedTime,
        @Nullable Double version) {
        this.parent = parent;
        this.path = path;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.version = version;
    }

    public Optional<ParentGroupInfoResponse> getParent() {
        return Optional.ofNullable(this.parent);
    }
    public List<ManagementGroupPathElementResponse> getPath() {
        return this.path == null ? List.of() : this.path;
    }
    public Optional<String> getUpdatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }
    public Optional<String> getUpdatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }
    public Optional<Double> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ParentGroupInfoResponse parent;
        private @Nullable List<ManagementGroupPathElementResponse> path;
        private @Nullable String updatedBy;
        private @Nullable String updatedTime;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.path = defaults.path;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedTime = defaults.updatedTime;
    	      this.version = defaults.version;
        }

        public Builder setParent(@Nullable ParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPath(@Nullable List<ManagementGroupPathElementResponse> path) {
            this.path = path;
            return this;
        }

        public Builder setUpdatedBy(@Nullable String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder setUpdatedTime(@Nullable String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }

        public ManagementGroupDetailsResponse build() {
            return new ManagementGroupDetailsResponse(parent, path, updatedBy, updatedTime, version);
        }
    }
}
