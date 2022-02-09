// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppendVariableActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppendVariableActivityArgs Empty = new AppendVariableActivityArgs();

    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    @InputImport(name="value")
    private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    @InputImport(name="variableName")
    private final @Nullable Input<String> variableName;

    public Input<String> getVariableName() {
        return this.variableName == null ? Input.empty() : this.variableName;
    }

    public AppendVariableActivityArgs(
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<String> name,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties,
        @Nullable Input<Object> value,
        @Nullable Input<String> variableName) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.value = value;
        this.variableName = variableName;
    }

    private AppendVariableActivityArgs() {
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
        this.value = Input.empty();
        this.variableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppendVariableActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<String> name;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;
        private @Nullable Input<Object> value;
        private @Nullable Input<String> variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppendVariableActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
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

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public Builder setValue(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setVariableName(@Nullable Input<String> variableName) {
            this.variableName = variableName;
            return this;
        }

        public Builder setVariableName(@Nullable String variableName) {
            this.variableName = Input.ofNullable(variableName);
            return this;
        }

        public AppendVariableActivityArgs build() {
            return new AppendVariableActivityArgs(dependsOn, description, name, type, userProperties, value, variableName);
        }
    }
}
