// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DatabricksSparkPython activity.
 * 
 */
public final class DatabricksSparkPythonActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabricksSparkPythonActivityResponse Empty = new DatabricksSparkPythonActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    @Import(name="libraries")
      private final @Nullable List<Map<String,Object>> libraries;

    public List<Map<String,Object>> getLibraries() {
        return this.libraries == null ? List.of() : this.libraries;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Command line parameters that will be passed to the Python file.
     * 
     */
    @Import(name="parameters")
      private final @Nullable List<Object> parameters;

    public List<Object> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * The URI of the Python file to be executed. DBFS paths are supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="pythonFile", required=true)
      private final Object pythonFile;

    public Object getPythonFile() {
        return this.pythonFile;
    }

    /**
     * Type of activity.
     * Expected value is 'DatabricksSparkPython'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public DatabricksSparkPythonActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable List<Map<String,Object>> libraries,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable List<Object> parameters,
        @Nullable ActivityPolicyResponse policy,
        Object pythonFile,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.libraries = libraries;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.policy = policy;
        this.pythonFile = Objects.requireNonNull(pythonFile, "expected parameter 'pythonFile' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DatabricksSparkPythonActivityResponse() {
        this.dependsOn = List.of();
        this.description = null;
        this.libraries = List.of();
        this.linkedServiceName = null;
        this.name = null;
        this.parameters = List.of();
        this.policy = null;
        this.pythonFile = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksSparkPythonActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable List<Map<String,Object>> libraries;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable List<Object> parameters;
        private @Nullable ActivityPolicyResponse policy;
        private Object pythonFile;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksSparkPythonActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.libraries = defaults.libraries;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.pythonFile = defaults.pythonFile;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder libraries(@Nullable List<Map<String,Object>> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable List<Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(Object... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder pythonFile(Object pythonFile) {
            this.pythonFile = Objects.requireNonNull(pythonFile);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public DatabricksSparkPythonActivityResponse build() {
            return new DatabricksSparkPythonActivityResponse(dependsOn, description, libraries, linkedServiceName, name, parameters, policy, pythonFile, type, userProperties);
        }
    }
}
