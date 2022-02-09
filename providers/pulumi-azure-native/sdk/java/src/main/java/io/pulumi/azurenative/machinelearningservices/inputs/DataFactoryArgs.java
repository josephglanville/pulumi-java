// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataFactoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataFactoryArgs Empty = new DataFactoryArgs();

    @InputImport(name="computeLocation")
    private final @Nullable Input<String> computeLocation;

    public Input<String> getComputeLocation() {
        return this.computeLocation == null ? Input.empty() : this.computeLocation;
    }

    @InputImport(name="computeType", required=true)
    private final Input<String> computeType;

    public Input<String> getComputeType() {
        return this.computeType;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public DataFactoryArgs(
        @Nullable Input<String> computeLocation,
        Input<String> computeType,
        @Nullable Input<String> description,
        @Nullable Input<String> resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.resourceId = resourceId;
    }

    private DataFactoryArgs() {
        this.computeLocation = Input.empty();
        this.computeType = Input.empty();
        this.description = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFactoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> computeLocation;
        private Input<String> computeType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFactoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setComputeLocation(@Nullable Input<String> computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }

        public Builder setComputeLocation(@Nullable String computeLocation) {
            this.computeLocation = Input.ofNullable(computeLocation);
            return this;
        }

        public Builder setComputeType(Input<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Input.of(Objects.requireNonNull(computeType));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public DataFactoryArgs build() {
            return new DataFactoryArgs(computeLocation, computeType, description, resourceId);
        }
    }
}
