// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureMLUpdateResourceActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLUpdateResourceActivityArgs Empty = new AzureMLUpdateResourceActivityArgs();

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

    @InputImport(name="trainedModelFilePath", required=true)
    private final Input<Object> trainedModelFilePath;

    public Input<Object> getTrainedModelFilePath() {
        return this.trainedModelFilePath;
    }

    @InputImport(name="trainedModelLinkedServiceName", required=true)
    private final Input<LinkedServiceReferenceArgs> trainedModelLinkedServiceName;

    public Input<LinkedServiceReferenceArgs> getTrainedModelLinkedServiceName() {
        return this.trainedModelLinkedServiceName;
    }

    @InputImport(name="trainedModelName", required=true)
    private final Input<Object> trainedModelName;

    public Input<Object> getTrainedModelName() {
        return this.trainedModelName;
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

    public AzureMLUpdateResourceActivityArgs(
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        Input<String> name,
        @Nullable Input<ActivityPolicyArgs> policy,
        Input<Object> trainedModelFilePath,
        Input<LinkedServiceReferenceArgs> trainedModelLinkedServiceName,
        Input<Object> trainedModelName,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.trainedModelFilePath = Objects.requireNonNull(trainedModelFilePath, "expected parameter 'trainedModelFilePath' to be non-null");
        this.trainedModelLinkedServiceName = Objects.requireNonNull(trainedModelLinkedServiceName, "expected parameter 'trainedModelLinkedServiceName' to be non-null");
        this.trainedModelName = Objects.requireNonNull(trainedModelName, "expected parameter 'trainedModelName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private AzureMLUpdateResourceActivityArgs() {
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.linkedServiceName = Input.empty();
        this.name = Input.empty();
        this.policy = Input.empty();
        this.trainedModelFilePath = Input.empty();
        this.trainedModelLinkedServiceName = Input.empty();
        this.trainedModelName = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLUpdateResourceActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private Input<String> name;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private Input<Object> trainedModelFilePath;
        private Input<LinkedServiceReferenceArgs> trainedModelLinkedServiceName;
        private Input<Object> trainedModelName;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLUpdateResourceActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.trainedModelFilePath = defaults.trainedModelFilePath;
    	      this.trainedModelLinkedServiceName = defaults.trainedModelLinkedServiceName;
    	      this.trainedModelName = defaults.trainedModelName;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
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

        public Builder setTrainedModelFilePath(Input<Object> trainedModelFilePath) {
            this.trainedModelFilePath = Objects.requireNonNull(trainedModelFilePath);
            return this;
        }

        public Builder setTrainedModelFilePath(Object trainedModelFilePath) {
            this.trainedModelFilePath = Input.of(Objects.requireNonNull(trainedModelFilePath));
            return this;
        }

        public Builder setTrainedModelLinkedServiceName(Input<LinkedServiceReferenceArgs> trainedModelLinkedServiceName) {
            this.trainedModelLinkedServiceName = Objects.requireNonNull(trainedModelLinkedServiceName);
            return this;
        }

        public Builder setTrainedModelLinkedServiceName(LinkedServiceReferenceArgs trainedModelLinkedServiceName) {
            this.trainedModelLinkedServiceName = Input.of(Objects.requireNonNull(trainedModelLinkedServiceName));
            return this;
        }

        public Builder setTrainedModelName(Input<Object> trainedModelName) {
            this.trainedModelName = Objects.requireNonNull(trainedModelName);
            return this;
        }

        public Builder setTrainedModelName(Object trainedModelName) {
            this.trainedModelName = Input.of(Objects.requireNonNull(trainedModelName));
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

        public AzureMLUpdateResourceActivityArgs build() {
            return new AzureMLUpdateResourceActivityArgs(dependsOn, description, linkedServiceName, name, policy, trainedModelFilePath, trainedModelLinkedServiceName, trainedModelName, type, userProperties);
        }
    }
}
