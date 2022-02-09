// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLWebServiceFileArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureMLBatchExecutionActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLBatchExecutionActivityArgs Empty = new AzureMLBatchExecutionActivityArgs();

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

    @InputImport(name="globalParameters")
    private final @Nullable Input<Map<String,Object>> globalParameters;

    public Input<Map<String,Object>> getGlobalParameters() {
        return this.globalParameters == null ? Input.empty() : this.globalParameters;
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

    @InputImport(name="webServiceInputs")
    private final @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs;

    public Input<Map<String,AzureMLWebServiceFileArgs>> getWebServiceInputs() {
        return this.webServiceInputs == null ? Input.empty() : this.webServiceInputs;
    }

    @InputImport(name="webServiceOutputs")
    private final @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs;

    public Input<Map<String,AzureMLWebServiceFileArgs>> getWebServiceOutputs() {
        return this.webServiceOutputs == null ? Input.empty() : this.webServiceOutputs;
    }

    public AzureMLBatchExecutionActivityArgs(
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,Object>> globalParameters,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties,
        @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs,
        @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.globalParameters = globalParameters;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.webServiceInputs = webServiceInputs;
        this.webServiceOutputs = webServiceOutputs;
    }

    private AzureMLBatchExecutionActivityArgs() {
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.globalParameters = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
        this.webServiceInputs = Input.empty();
        this.webServiceOutputs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLBatchExecutionActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,Object>> globalParameters;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;
        private @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs;
        private @Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLBatchExecutionActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.globalParameters = defaults.globalParameters;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.webServiceInputs = defaults.webServiceInputs;
    	      this.webServiceOutputs = defaults.webServiceOutputs;
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

        public Builder setGlobalParameters(@Nullable Input<Map<String,Object>> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }

        public Builder setGlobalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = Input.ofNullable(globalParameters);
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

        public Builder setWebServiceInputs(@Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs) {
            this.webServiceInputs = webServiceInputs;
            return this;
        }

        public Builder setWebServiceInputs(@Nullable Map<String,AzureMLWebServiceFileArgs> webServiceInputs) {
            this.webServiceInputs = Input.ofNullable(webServiceInputs);
            return this;
        }

        public Builder setWebServiceOutputs(@Nullable Input<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs) {
            this.webServiceOutputs = webServiceOutputs;
            return this;
        }

        public Builder setWebServiceOutputs(@Nullable Map<String,AzureMLWebServiceFileArgs> webServiceOutputs) {
            this.webServiceOutputs = Input.ofNullable(webServiceOutputs);
            return this;
        }

        public AzureMLBatchExecutionActivityArgs build() {
            return new AzureMLBatchExecutionActivityArgs(dependsOn, description, globalParameters, linkedServiceName, name, policy, type, userProperties, webServiceInputs, webServiceOutputs);
        }
    }
}
