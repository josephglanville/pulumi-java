// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HDInsightMapReduceActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final HDInsightMapReduceActivityArgs Empty = new HDInsightMapReduceActivityArgs();

    @InputImport(name="arguments")
    private final @Nullable Input<List<Object>> arguments;

    public Input<List<Object>> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    @InputImport(name="className", required=true)
    private final Input<Object> className;

    public Input<Object> getClassName() {
        return this.className;
    }

    @InputImport(name="defines")
    private final @Nullable Input<Map<String,Object>> defines;

    public Input<Map<String,Object>> getDefines() {
        return this.defines == null ? Input.empty() : this.defines;
    }

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

    @InputImport(name="getDebugInfo")
    private final @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Input<Either<String,HDInsightActivityDebugInfoOption>> getGetDebugInfo() {
        return this.getDebugInfo == null ? Input.empty() : this.getDebugInfo;
    }

    @InputImport(name="jarFilePath", required=true)
    private final Input<Object> jarFilePath;

    public Input<Object> getJarFilePath() {
        return this.jarFilePath;
    }

    @InputImport(name="jarLibs")
    private final @Nullable Input<List<Object>> jarLibs;

    public Input<List<Object>> getJarLibs() {
        return this.jarLibs == null ? Input.empty() : this.jarLibs;
    }

    @InputImport(name="jarLinkedService")
    private final @Nullable Input<LinkedServiceReferenceArgs> jarLinkedService;

    public Input<LinkedServiceReferenceArgs> getJarLinkedService() {
        return this.jarLinkedService == null ? Input.empty() : this.jarLinkedService;
    }

    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="policy")
    private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    @InputImport(name="storageLinkedServices")
    private final @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Input<List<LinkedServiceReferenceArgs>> getStorageLinkedServices() {
        return this.storageLinkedServices == null ? Input.empty() : this.storageLinkedServices;
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

    public HDInsightMapReduceActivityArgs(
        @Nullable Input<List<Object>> arguments,
        Input<Object> className,
        @Nullable Input<Map<String,Object>> defines,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo,
        Input<Object> jarFilePath,
        @Nullable Input<List<Object>> jarLibs,
        @Nullable Input<LinkedServiceReferenceArgs> jarLinkedService,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.arguments = arguments;
        this.className = Objects.requireNonNull(className, "expected parameter 'className' to be non-null");
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.jarFilePath = Objects.requireNonNull(jarFilePath, "expected parameter 'jarFilePath' to be non-null");
        this.jarLibs = jarLibs;
        this.jarLinkedService = jarLinkedService;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private HDInsightMapReduceActivityArgs() {
        this.arguments = Input.empty();
        this.className = Input.empty();
        this.defines = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.getDebugInfo = Input.empty();
        this.jarFilePath = Input.empty();
        this.jarLibs = Input.empty();
        this.jarLinkedService = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.storageLinkedServices = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightMapReduceActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> arguments;
        private Input<Object> className;
        private @Nullable Input<Map<String,Object>> defines;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;
        private Input<Object> jarFilePath;
        private @Nullable Input<List<Object>> jarLibs;
        private @Nullable Input<LinkedServiceReferenceArgs> jarLinkedService;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightMapReduceActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.className = defaults.className;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.jarFilePath = defaults.jarFilePath;
    	      this.jarLibs = defaults.jarLibs;
    	      this.jarLinkedService = defaults.jarLinkedService;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setArguments(@Nullable Input<List<Object>> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable List<Object> arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setClassName(Input<Object> className) {
            this.className = Objects.requireNonNull(className);
            return this;
        }

        public Builder setClassName(Object className) {
            this.className = Input.of(Objects.requireNonNull(className));
            return this;
        }

        public Builder setDefines(@Nullable Input<Map<String,Object>> defines) {
            this.defines = defines;
            return this;
        }

        public Builder setDefines(@Nullable Map<String,Object> defines) {
            this.defines = Input.ofNullable(defines);
            return this;
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

        public Builder setGetDebugInfo(@Nullable Input<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder setGetDebugInfo(@Nullable Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            this.getDebugInfo = Input.ofNullable(getDebugInfo);
            return this;
        }

        public Builder setJarFilePath(Input<Object> jarFilePath) {
            this.jarFilePath = Objects.requireNonNull(jarFilePath);
            return this;
        }

        public Builder setJarFilePath(Object jarFilePath) {
            this.jarFilePath = Input.of(Objects.requireNonNull(jarFilePath));
            return this;
        }

        public Builder setJarLibs(@Nullable Input<List<Object>> jarLibs) {
            this.jarLibs = jarLibs;
            return this;
        }

        public Builder setJarLibs(@Nullable List<Object> jarLibs) {
            this.jarLibs = Input.ofNullable(jarLibs);
            return this;
        }

        public Builder setJarLinkedService(@Nullable Input<LinkedServiceReferenceArgs> jarLinkedService) {
            this.jarLinkedService = jarLinkedService;
            return this;
        }

        public Builder setJarLinkedService(@Nullable LinkedServiceReferenceArgs jarLinkedService) {
            this.jarLinkedService = Input.ofNullable(jarLinkedService);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
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

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setStorageLinkedServices(@Nullable Input<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }

        public Builder setStorageLinkedServices(@Nullable List<LinkedServiceReferenceArgs> storageLinkedServices) {
            this.storageLinkedServices = Input.ofNullable(storageLinkedServices);
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

        public HDInsightMapReduceActivityArgs build() {
            return new HDInsightMapReduceActivityArgs(arguments, className, defines, dependsOn, description, getDebugInfo, jarFilePath, jarLibs, jarLinkedService, linkedServiceName, name, policy, storageLinkedServices, type, userProperties);
        }
    }
}
