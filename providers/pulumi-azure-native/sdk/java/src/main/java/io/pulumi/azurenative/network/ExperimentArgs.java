// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.State;
import io.pulumi.azurenative.network.inputs.ExperimentEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    /**
     * The description of the details or intents of the Experiment
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The state of the Experiment
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,State>> enabledState;

    public Output<Either<String,State>> getEnabledState() {
        return this.enabledState == null ? Output.empty() : this.enabledState;
    }

    /**
     * The endpoint A of an experiment
     * 
     */
    @Import(name="endpointA")
      private final @Nullable Output<ExperimentEndpointArgs> endpointA;

    public Output<ExperimentEndpointArgs> getEndpointA() {
        return this.endpointA == null ? Output.empty() : this.endpointA;
    }

    /**
     * The endpoint B of an experiment
     * 
     */
    @Import(name="endpointB")
      private final @Nullable Output<ExperimentEndpointArgs> endpointB;

    public Output<ExperimentEndpointArgs> getEndpointB() {
        return this.endpointB == null ? Output.empty() : this.endpointB;
    }

    /**
     * The Experiment identifier associated with the Experiment
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<String> experimentName;

    public Output<String> getExperimentName() {
        return this.experimentName == null ? Output.empty() : this.experimentName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The Profile identifier associated with the Tenant and Partner
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
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

    public ExperimentArgs(
        @Nullable Output<String> description,
        @Nullable Output<Either<String,State>> enabledState,
        @Nullable Output<ExperimentEndpointArgs> endpointA,
        @Nullable Output<ExperimentEndpointArgs> endpointB,
        @Nullable Output<String> experimentName,
        @Nullable Output<String> location,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.enabledState = enabledState;
        this.endpointA = endpointA;
        this.endpointB = endpointB;
        this.experimentName = experimentName;
        this.location = location;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExperimentArgs() {
        this.description = Output.empty();
        this.enabledState = Output.empty();
        this.endpointA = Output.empty();
        this.endpointB = Output.empty();
        this.experimentName = Output.empty();
        this.location = Output.empty();
        this.profileName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,State>> enabledState;
        private @Nullable Output<ExperimentEndpointArgs> endpointA;
        private @Nullable Output<ExperimentEndpointArgs> endpointB;
        private @Nullable Output<String> experimentName;
        private @Nullable Output<String> location;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabledState = defaults.enabledState;
    	      this.endpointA = defaults.endpointA;
    	      this.endpointB = defaults.endpointB;
    	      this.experimentName = defaults.experimentName;
    	      this.location = defaults.location;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,State>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,State> enabledState) {
            this.enabledState = Output.ofNullable(enabledState);
            return this;
        }
        public Builder endpointA(@Nullable Output<ExperimentEndpointArgs> endpointA) {
            this.endpointA = endpointA;
            return this;
        }
        public Builder endpointA(@Nullable ExperimentEndpointArgs endpointA) {
            this.endpointA = Output.ofNullable(endpointA);
            return this;
        }
        public Builder endpointB(@Nullable Output<ExperimentEndpointArgs> endpointB) {
            this.endpointB = endpointB;
            return this;
        }
        public Builder endpointB(@Nullable ExperimentEndpointArgs endpointB) {
            this.endpointB = Output.ofNullable(endpointB);
            return this;
        }
        public Builder experimentName(@Nullable Output<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = Output.ofNullable(experimentName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ExperimentArgs build() {
            return new ExperimentArgs(description, enabledState, endpointA, endpointB, experimentName, location, profileName, resourceGroupName, tags);
        }
    }
}
