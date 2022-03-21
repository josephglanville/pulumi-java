// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This activity suspends pipeline execution for the specified interval.
 * 
 */
public final class WaitActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final WaitActivityArgs Empty = new WaitActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'Wait'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    /**
     * Duration in seconds.
     * 
     */
    @Import(name="waitTimeInSeconds", required=true)
      private final Output<Object> waitTimeInSeconds;

    public Output<Object> getWaitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    public WaitActivityArgs(
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        Output<String> name,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties,
        Output<Object> waitTimeInSeconds) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.waitTimeInSeconds = Objects.requireNonNull(waitTimeInSeconds, "expected parameter 'waitTimeInSeconds' to be non-null");
    }

    private WaitActivityArgs() {
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
        this.waitTimeInSeconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;
        private Output<Object> waitTimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitTimeInSeconds = defaults.waitTimeInSeconds;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Output.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder waitTimeInSeconds(Output<Object> waitTimeInSeconds) {
            this.waitTimeInSeconds = Objects.requireNonNull(waitTimeInSeconds);
            return this;
        }
        public Builder waitTimeInSeconds(Object waitTimeInSeconds) {
            this.waitTimeInSeconds = Output.of(Objects.requireNonNull(waitTimeInSeconds));
            return this;
        }        public WaitActivityArgs build() {
            return new WaitActivityArgs(dependsOn, description, name, type, userProperties, waitTimeInSeconds);
        }
    }
}
