// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager;

import io.pulumi.azurenative.deploymentmanager.inputs.HealthCheckStepPropertiesArgs;
import io.pulumi.azurenative.deploymentmanager.inputs.WaitStepPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StepArgs extends io.pulumi.resources.ResourceArgs {

    public static final StepArgs Empty = new StepArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The properties that define the step.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs>> properties;

    public Output<Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs>> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the deployment step.
     * 
     */
    @Import(name="stepName")
      private final @Nullable Output<String> stepName;

    public Output<String> getStepName() {
        return this.stepName == null ? Output.empty() : this.stepName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StepArgs(
        @Nullable Output<String> location,
        Output<Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs>> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> stepName,
        @Nullable Output<Map<String,String>> tags) {
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.stepName = stepName;
        this.tags = tags;
    }

    private StepArgs() {
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.stepName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs>> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> stepName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.stepName = defaults.stepName;
    	      this.tags = defaults.tags;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder properties(Output<Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(Either<HealthCheckStepPropertiesArgs,WaitStepPropertiesArgs> properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder stepName(@Nullable Output<String> stepName) {
            this.stepName = stepName;
            return this;
        }
        public Builder stepName(@Nullable String stepName) {
            this.stepName = Output.ofNullable(stepName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public StepArgs build() {
            return new StepArgs(location, properties, resourceGroupName, stepName, tags);
        }
    }
}
