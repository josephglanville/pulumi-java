// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DatabricksNotebook activity.
 * 
 */
public final class DatabricksNotebookActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabricksNotebookActivityArgs Empty = new DatabricksNotebookActivityArgs();

    /**
     * Base parameters to be used for each run of this job.If the notebook takes a parameter that is not specified, the default value from the notebook will be used.
     * 
     */
    @InputImport(name="baseParameters")
      private final @Nullable Output<Map<String,Object>> baseParameters;

    public Output<Map<String,Object>> getBaseParameters() {
        return this.baseParameters == null ? Output.empty() : this.baseParameters;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    @InputImport(name="libraries")
      private final @Nullable Output<List<Map<String,Object>>> libraries;

    public Output<List<Map<String,Object>>> getLibraries() {
        return this.libraries == null ? Output.empty() : this.libraries;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Output.empty() : this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The absolute path of the notebook to be run in the Databricks Workspace. This path must begin with a slash. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="notebookPath", required=true)
      private final Output<Object> notebookPath;

    public Output<Object> getNotebookPath() {
        return this.notebookPath;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * Type of activity.
     * Expected value is 'DatabricksNotebook'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    public DatabricksNotebookActivityArgs(
        @Nullable Output<Map<String,Object>> baseParameters,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<List<Map<String,Object>>> libraries,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        Output<String> name,
        Output<Object> notebookPath,
        @Nullable Output<ActivityPolicyArgs> policy,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.baseParameters = baseParameters;
        this.dependsOn = dependsOn;
        this.description = description;
        this.libraries = libraries;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.notebookPath = Objects.requireNonNull(notebookPath, "expected parameter 'notebookPath' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DatabricksNotebookActivityArgs() {
        this.baseParameters = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.libraries = Output.empty();
        this.linkedServiceName = Output.empty();
        this.name = Output.empty();
        this.notebookPath = Output.empty();
        this.policy = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksNotebookActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> baseParameters;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<Map<String,Object>>> libraries;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private Output<String> name;
        private Output<Object> notebookPath;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksNotebookActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.libraries = defaults.libraries;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.notebookPath = defaults.notebookPath;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder baseParameters(@Nullable Output<Map<String,Object>> baseParameters) {
            this.baseParameters = baseParameters;
            return this;
        }

        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {
            this.baseParameters = Output.ofNullable(baseParameters);
            return this;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder libraries(@Nullable Output<List<Map<String,Object>>> libraries) {
            this.libraries = libraries;
            return this;
        }

        public Builder libraries(@Nullable List<Map<String,Object>> libraries) {
            this.libraries = Output.ofNullable(libraries);
            return this;
        }

        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.ofNullable(linkedServiceName);
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

        public Builder notebookPath(Output<Object> notebookPath) {
            this.notebookPath = Objects.requireNonNull(notebookPath);
            return this;
        }

        public Builder notebookPath(Object notebookPath) {
            this.notebookPath = Output.of(Objects.requireNonNull(notebookPath));
            return this;
        }

        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Output.ofNullable(policy);
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
        public DatabricksNotebookActivityArgs build() {
            return new DatabricksNotebookActivityArgs(baseParameters, dependsOn, description, libraries, linkedServiceName, name, notebookPath, policy, type, userProperties);
        }
    }
}
