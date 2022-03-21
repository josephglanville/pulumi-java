// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs Empty = new WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs();

    /**
     * An identifier for an application client. You must create the app client ID using Amazon Cognito.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }

    /**
     * An identifier for a user group.
     * 
     */
    @Import(name="userGroup", required=true)
      private final Output<String> userGroup;

    public Output<String> getUserGroup() {
        return this.userGroup;
    }

    /**
     * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
     * 
     */
    @Import(name="userPool", required=true)
      private final Output<String> userPool;

    public Output<String> getUserPool() {
        return this.userPool;
    }

    public WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs(
        Output<String> clientId,
        Output<String> userGroup,
        Output<String> userPool) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.userGroup = Objects.requireNonNull(userGroup, "expected parameter 'userGroup' to be non-null");
        this.userPool = Objects.requireNonNull(userPool, "expected parameter 'userPool' to be non-null");
    }

    private WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs() {
        this.clientId = Output.empty();
        this.userGroup = Output.empty();
        this.userPool = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clientId;
        private Output<String> userGroup;
        private Output<String> userPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userGroup = defaults.userGroup;
    	      this.userPool = defaults.userPool;
        }

        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder userGroup(Output<String> userGroup) {
            this.userGroup = Objects.requireNonNull(userGroup);
            return this;
        }
        public Builder userGroup(String userGroup) {
            this.userGroup = Output.of(Objects.requireNonNull(userGroup));
            return this;
        }
        public Builder userPool(Output<String> userPool) {
            this.userPool = Objects.requireNonNull(userPool);
            return this;
        }
        public Builder userPool(String userPool) {
            this.userPool = Output.of(Objects.requireNonNull(userPool));
            return this;
        }        public WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs build() {
            return new WorkteamMemberDefinitionCognitoMemberDefinitionGetArgs(clientId, userGroup, userPool);
        }
    }
}
