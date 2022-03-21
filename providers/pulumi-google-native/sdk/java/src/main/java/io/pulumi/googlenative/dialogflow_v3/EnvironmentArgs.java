// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="agentId", required=true)
      private final Output<String> agentId;

    public Output<String> getAgentId() {
        return this.agentId;
    }

    /**
     * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The human-readable name of the environment (unique in an agent). Limit of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the environment. Format: `projects//locations//agents//environments/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The test cases config for continuous tests of this environment.
     * 
     */
    @Import(name="testCasesConfig")
      private final @Nullable Output<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig;

    public Output<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> getTestCasesConfig() {
        return this.testCasesConfig == null ? Output.empty() : this.testCasesConfig;
    }

    /**
     * A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
     * 
     */
    @Import(name="versionConfigs", required=true)
      private final Output<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs;

    public Output<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> getVersionConfigs() {
        return this.versionConfigs;
    }

    public EnvironmentArgs(
        Output<String> agentId,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig,
        Output<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.testCasesConfig = testCasesConfig;
        this.versionConfigs = Objects.requireNonNull(versionConfigs, "expected parameter 'versionConfigs' to be non-null");
    }

    private EnvironmentArgs() {
        this.agentId = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.testCasesConfig = Output.empty();
        this.versionConfigs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> agentId;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig;
        private Output<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.testCasesConfig = defaults.testCasesConfig;
    	      this.versionConfigs = defaults.versionConfigs;
        }

        public Builder agentId(Output<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }
        public Builder agentId(String agentId) {
            this.agentId = Output.of(Objects.requireNonNull(agentId));
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
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder testCasesConfig(@Nullable Output<GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs> testCasesConfig) {
            this.testCasesConfig = testCasesConfig;
            return this;
        }
        public Builder testCasesConfig(@Nullable GoogleCloudDialogflowCxV3EnvironmentTestCasesConfigArgs testCasesConfig) {
            this.testCasesConfig = Output.ofNullable(testCasesConfig);
            return this;
        }
        public Builder versionConfigs(Output<List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs>> versionConfigs) {
            this.versionConfigs = Objects.requireNonNull(versionConfigs);
            return this;
        }
        public Builder versionConfigs(List<GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs> versionConfigs) {
            this.versionConfigs = Output.of(Objects.requireNonNull(versionConfigs));
            return this;
        }
        public Builder versionConfigs(GoogleCloudDialogflowCxV3EnvironmentVersionConfigArgs... versionConfigs) {
            return versionConfigs(List.of(versionConfigs));
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(agentId, description, displayName, location, name, project, testCasesConfig, versionConfigs);
        }
    }
}
