// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set value for a Variable.
 * 
 */
public final class SetVariableActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final SetVariableActivityResponse Empty = new SetVariableActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'SetVariable'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    /**
     * Value to be set. Could be a static value or Expression
     * 
     */
    @InputImport(name="value")
      private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    /**
     * Name of the variable whose value needs to be set.
     * 
     */
    @InputImport(name="variableName")
      private final @Nullable String variableName;

    public Optional<String> getVariableName() {
        return this.variableName == null ? Optional.empty() : Optional.ofNullable(this.variableName);
    }

    public SetVariableActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        String name,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable Object value,
        @Nullable String variableName) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.value = value;
        this.variableName = variableName;
    }

    private SetVariableActivityResponse() {
        this.dependsOn = List.of();
        this.description = null;
        this.name = null;
        this.type = null;
        this.userProperties = List.of();
        this.value = null;
        this.variableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetVariableActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object value;
        private @Nullable String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(SetVariableActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }

        public Builder setVariableName(@Nullable String variableName) {
            this.variableName = variableName;
            return this;
        }
        public SetVariableActivityResponse build() {
            return new SetVariableActivityResponse(dependsOn, description, name, type, userProperties, value, variableName);
        }
    }
}
