// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for a Python environment.
 * 
 */
public final class ModelEnvironmentDefinitionPythonArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionPythonArgs Empty = new ModelEnvironmentDefinitionPythonArgs();

    @InputImport(name="baseCondaEnvironment")
      private final @Nullable Input<String> baseCondaEnvironment;

    public Input<String> getBaseCondaEnvironment() {
        return this.baseCondaEnvironment == null ? Input.empty() : this.baseCondaEnvironment;
    }

    /**
     * A JObject containing Conda dependencies.
     * 
     */
    @InputImport(name="condaDependencies")
      private final @Nullable Input<Object> condaDependencies;

    public Input<Object> getCondaDependencies() {
        return this.condaDependencies == null ? Input.empty() : this.condaDependencies;
    }

    /**
     * The python interpreter path to use if an environment build is not required. The path specified gets used to call the user script.
     * 
     */
    @InputImport(name="interpreterPath")
      private final @Nullable Input<String> interpreterPath;

    public Input<String> getInterpreterPath() {
        return this.interpreterPath == null ? Input.empty() : this.interpreterPath;
    }

    /**
     * True means that AzureML reuses an existing python environment; False means that AzureML will create a python environment based on the Conda dependencies specification.
     * 
     */
    @InputImport(name="userManagedDependencies")
      private final @Nullable Input<Boolean> userManagedDependencies;

    public Input<Boolean> getUserManagedDependencies() {
        return this.userManagedDependencies == null ? Input.empty() : this.userManagedDependencies;
    }

    public ModelEnvironmentDefinitionPythonArgs(
        @Nullable Input<String> baseCondaEnvironment,
        @Nullable Input<Object> condaDependencies,
        @Nullable Input<String> interpreterPath,
        @Nullable Input<Boolean> userManagedDependencies) {
        this.baseCondaEnvironment = baseCondaEnvironment;
        this.condaDependencies = condaDependencies;
        this.interpreterPath = interpreterPath;
        this.userManagedDependencies = userManagedDependencies;
    }

    private ModelEnvironmentDefinitionPythonArgs() {
        this.baseCondaEnvironment = Input.empty();
        this.condaDependencies = Input.empty();
        this.interpreterPath = Input.empty();
        this.userManagedDependencies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionPythonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseCondaEnvironment;
        private @Nullable Input<Object> condaDependencies;
        private @Nullable Input<String> interpreterPath;
        private @Nullable Input<Boolean> userManagedDependencies;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionPythonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseCondaEnvironment = defaults.baseCondaEnvironment;
    	      this.condaDependencies = defaults.condaDependencies;
    	      this.interpreterPath = defaults.interpreterPath;
    	      this.userManagedDependencies = defaults.userManagedDependencies;
        }

        public Builder setBaseCondaEnvironment(@Nullable Input<String> baseCondaEnvironment) {
            this.baseCondaEnvironment = baseCondaEnvironment;
            return this;
        }

        public Builder setBaseCondaEnvironment(@Nullable String baseCondaEnvironment) {
            this.baseCondaEnvironment = Input.ofNullable(baseCondaEnvironment);
            return this;
        }

        public Builder setCondaDependencies(@Nullable Input<Object> condaDependencies) {
            this.condaDependencies = condaDependencies;
            return this;
        }

        public Builder setCondaDependencies(@Nullable Object condaDependencies) {
            this.condaDependencies = Input.ofNullable(condaDependencies);
            return this;
        }

        public Builder setInterpreterPath(@Nullable Input<String> interpreterPath) {
            this.interpreterPath = interpreterPath;
            return this;
        }

        public Builder setInterpreterPath(@Nullable String interpreterPath) {
            this.interpreterPath = Input.ofNullable(interpreterPath);
            return this;
        }

        public Builder setUserManagedDependencies(@Nullable Input<Boolean> userManagedDependencies) {
            this.userManagedDependencies = userManagedDependencies;
            return this;
        }

        public Builder setUserManagedDependencies(@Nullable Boolean userManagedDependencies) {
            this.userManagedDependencies = Input.ofNullable(userManagedDependencies);
            return this;
        }
        public ModelEnvironmentDefinitionPythonArgs build() {
            return new ModelEnvironmentDefinitionPythonArgs(baseCondaEnvironment, condaDependencies, interpreterPath, userManagedDependencies);
        }
    }
}
