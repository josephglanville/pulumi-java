// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolRoleAttachmentRoleMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolRoleAttachmentRoleMappingArgs Empty = new IdentityPoolRoleAttachmentRoleMappingArgs();

    /**
     * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    @Import(name="ambiguousRoleResolution")
      private final @Nullable Output<String> ambiguousRoleResolution;

    public Output<String> getAmbiguousRoleResolution() {
        return this.ambiguousRoleResolution == null ? Output.empty() : this.ambiguousRoleResolution;
    }

    /**
     * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    @Import(name="identityProvider", required=true)
      private final Output<String> identityProvider;

    public Output<String> getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    @Import(name="mappingRules")
      private final @Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules;

    public Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> getMappingRules() {
        return this.mappingRules == null ? Output.empty() : this.mappingRules;
    }

    /**
     * The role mapping type.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public IdentityPoolRoleAttachmentRoleMappingArgs(
        @Nullable Output<String> ambiguousRoleResolution,
        Output<String> identityProvider,
        @Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules,
        Output<String> type) {
        this.ambiguousRoleResolution = ambiguousRoleResolution;
        this.identityProvider = Objects.requireNonNull(identityProvider, "expected parameter 'identityProvider' to be non-null");
        this.mappingRules = mappingRules;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityPoolRoleAttachmentRoleMappingArgs() {
        this.ambiguousRoleResolution = Output.empty();
        this.identityProvider = Output.empty();
        this.mappingRules = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ambiguousRoleResolution;
        private Output<String> identityProvider;
        private @Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolRoleAttachmentRoleMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambiguousRoleResolution = defaults.ambiguousRoleResolution;
    	      this.identityProvider = defaults.identityProvider;
    	      this.mappingRules = defaults.mappingRules;
    	      this.type = defaults.type;
        }

        public Builder ambiguousRoleResolution(@Nullable Output<String> ambiguousRoleResolution) {
            this.ambiguousRoleResolution = ambiguousRoleResolution;
            return this;
        }
        public Builder ambiguousRoleResolution(@Nullable String ambiguousRoleResolution) {
            this.ambiguousRoleResolution = Output.ofNullable(ambiguousRoleResolution);
            return this;
        }
        public Builder identityProvider(Output<String> identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }
        public Builder identityProvider(String identityProvider) {
            this.identityProvider = Output.of(Objects.requireNonNull(identityProvider));
            return this;
        }
        public Builder mappingRules(@Nullable Output<List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs>> mappingRules) {
            this.mappingRules = mappingRules;
            return this;
        }
        public Builder mappingRules(@Nullable List<IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs> mappingRules) {
            this.mappingRules = Output.ofNullable(mappingRules);
            return this;
        }
        public Builder mappingRules(IdentityPoolRoleAttachmentRoleMappingMappingRuleArgs... mappingRules) {
            return mappingRules(List.of(mappingRules));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public IdentityPoolRoleAttachmentRoleMappingArgs build() {
            return new IdentityPoolRoleAttachmentRoleMappingArgs(ambiguousRoleResolution, identityProvider, mappingRules, type);
        }
    }
}