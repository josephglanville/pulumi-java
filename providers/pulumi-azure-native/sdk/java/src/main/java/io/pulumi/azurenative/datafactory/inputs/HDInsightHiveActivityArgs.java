// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HDInsight Hive activity type.
 * 
 */
public final class HDInsightHiveActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightHiveActivityArgs Empty = new HDInsightHiveActivityArgs();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<List<Object>> arguments;

    public Output<List<Object>> getArguments() {
        return this.arguments == null ? Output.empty() : this.arguments;
    }

    /**
     * Allows user to specify defines for Hive job request.
     * 
     */
    @Import(name="defines")
      private final @Nullable Output<Map<String,Object>> defines;

    public Output<Map<String,Object>> getDefines() {
        return this.defines == null ? Output.empty() : this.defines;
    }

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
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
      private final @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Output<Either<String,HDInsightActivityDebugInfoOption>> getGetDebugInfo() {
        return this.getDebugInfo == null ? Output.empty() : this.getDebugInfo;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Output.empty() : this.linkedServiceName;
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
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * Query timeout value (in minutes).  Effective when the HDInsight cluster is with ESP (Enterprise Security Package)
     * 
     */
    @Import(name="queryTimeout")
      private final @Nullable Output<Integer> queryTimeout;

    public Output<Integer> getQueryTimeout() {
        return this.queryTimeout == null ? Output.empty() : this.queryTimeout;
    }

    /**
     * Script linked service reference.
     * 
     */
    @Import(name="scriptLinkedService")
      private final @Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService;

    public Output<LinkedServiceReferenceArgs> getScriptLinkedService() {
        return this.scriptLinkedService == null ? Output.empty() : this.scriptLinkedService;
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="scriptPath")
      private final @Nullable Output<Object> scriptPath;

    public Output<Object> getScriptPath() {
        return this.scriptPath == null ? Output.empty() : this.scriptPath;
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
      private final @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Output<List<LinkedServiceReferenceArgs>> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? Output.empty() : this.storageLinkedServices;
    }

    /**
     * Type of activity.
     * Expected value is 'HDInsightHive'.
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
     * User specified arguments under hivevar namespace.
     * 
     */
    @Import(name="variables")
      private final @Nullable Output<List<Object>> variables;

    public Output<List<Object>> getVariables() {
        return this.variables == null ? Output.empty() : this.variables;
    }

    public HDInsightHiveActivityArgs(
        @Nullable Output<List<Object>> arguments,
        @Nullable Output<Map<String,Object>> defines,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        Output<String> name,
        @Nullable Output<ActivityPolicyArgs> policy,
        @Nullable Output<Integer> queryTimeout,
        @Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService,
        @Nullable Output<Object> scriptPath,
        @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties,
        @Nullable Output<List<Object>> variables) {
        this.arguments = arguments;
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.queryTimeout = queryTimeout;
        this.scriptLinkedService = scriptLinkedService;
        this.scriptPath = scriptPath;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.variables = variables;
    }

    private HDInsightHiveActivityArgs() {
        this.arguments = Output.empty();
        this.defines = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.getDebugInfo = Output.empty();
        this.linkedServiceName = Output.empty();
        this.name = Output.empty();
        this.policy = Output.empty();
        this.queryTimeout = Output.empty();
        this.scriptLinkedService = Output.empty();
        this.scriptPath = Output.empty();
        this.storageLinkedServices = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
        this.variables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightHiveActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> arguments;
        private @Nullable Output<Map<String,Object>> defines;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private Output<String> name;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private @Nullable Output<Integer> queryTimeout;
        private @Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService;
        private @Nullable Output<Object> scriptPath;
        private @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;
        private @Nullable Output<List<Object>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightHiveActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.variables = defaults.variables;
        }

        public Builder arguments(@Nullable Output<List<Object>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable List<Object> arguments) {
            this.arguments = Output.ofNullable(arguments);
            return this;
        }
        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder defines(@Nullable Output<Map<String,Object>> defines) {
            this.defines = defines;
            return this;
        }
        public Builder defines(@Nullable Map<String,Object> defines) {
            this.defines = Output.ofNullable(defines);
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
        public Builder getDebugInfo(@Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }
        public Builder getDebugInfo(@Nullable Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            this.getDebugInfo = Output.ofNullable(getDebugInfo);
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
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public Builder queryTimeout(@Nullable Output<Integer> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder queryTimeout(@Nullable Integer queryTimeout) {
            this.queryTimeout = Output.ofNullable(queryTimeout);
            return this;
        }
        public Builder scriptLinkedService(@Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService) {
            this.scriptLinkedService = scriptLinkedService;
            return this;
        }
        public Builder scriptLinkedService(@Nullable LinkedServiceReferenceArgs scriptLinkedService) {
            this.scriptLinkedService = Output.ofNullable(scriptLinkedService);
            return this;
        }
        public Builder scriptPath(@Nullable Output<Object> scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        public Builder scriptPath(@Nullable Object scriptPath) {
            this.scriptPath = Output.ofNullable(scriptPath);
            return this;
        }
        public Builder storageLinkedServices(@Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }
        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceArgs> storageLinkedServices) {
            this.storageLinkedServices = Output.ofNullable(storageLinkedServices);
            return this;
        }
        public Builder storageLinkedServices(LinkedServiceReferenceArgs... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
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
        public Builder variables(@Nullable Output<List<Object>> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(@Nullable List<Object> variables) {
            this.variables = Output.ofNullable(variables);
            return this;
        }
        public Builder variables(Object... variables) {
            return variables(List.of(variables));
        }        public HDInsightHiveActivityArgs build() {
            return new HDInsightHiveActivityArgs(arguments, defines, dependsOn, description, getDebugInfo, linkedServiceName, name, policy, queryTimeout, scriptLinkedService, scriptPath, storageLinkedServices, type, userProperties, variables);
        }
    }
}
