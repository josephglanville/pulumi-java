// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolProviderPrincipalTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolProviderPrincipalTagArgs Empty = new IdentityPoolProviderPrincipalTagArgs();

    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     */
    @Import(name="identityPoolId", required=true)
      private final Output<String> identityPoolId;

    public Output<String> getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * The name of the identity provider
     * * `principal_tags`: (Optional: []) - String to string map of variables
     * * `use_defaults`: (Optional: true) use default (username and clientID) attribute mappings.
     * 
     */
    @Import(name="identityProviderName", required=true)
      private final Output<String> identityProviderName;

    public Output<String> getIdentityProviderName() {
        return this.identityProviderName;
    }

    @Import(name="principalTags")
      private final @Nullable Output<Map<String,String>> principalTags;

    public Output<Map<String,String>> getPrincipalTags() {
        return this.principalTags == null ? Output.empty() : this.principalTags;
    }

    @Import(name="useDefaults")
      private final @Nullable Output<Boolean> useDefaults;

    public Output<Boolean> getUseDefaults() {
        return this.useDefaults == null ? Output.empty() : this.useDefaults;
    }

    public IdentityPoolProviderPrincipalTagArgs(
        Output<String> identityPoolId,
        Output<String> identityProviderName,
        @Nullable Output<Map<String,String>> principalTags,
        @Nullable Output<Boolean> useDefaults) {
        this.identityPoolId = Objects.requireNonNull(identityPoolId, "expected parameter 'identityPoolId' to be non-null");
        this.identityProviderName = Objects.requireNonNull(identityProviderName, "expected parameter 'identityProviderName' to be non-null");
        this.principalTags = principalTags;
        this.useDefaults = useDefaults;
    }

    private IdentityPoolProviderPrincipalTagArgs() {
        this.identityPoolId = Output.empty();
        this.identityProviderName = Output.empty();
        this.principalTags = Output.empty();
        this.useDefaults = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolProviderPrincipalTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> identityPoolId;
        private Output<String> identityProviderName;
        private @Nullable Output<Map<String,String>> principalTags;
        private @Nullable Output<Boolean> useDefaults;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolProviderPrincipalTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.identityProviderName = defaults.identityProviderName;
    	      this.principalTags = defaults.principalTags;
    	      this.useDefaults = defaults.useDefaults;
        }

        public Builder identityPoolId(Output<String> identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }
        public Builder identityPoolId(String identityPoolId) {
            this.identityPoolId = Output.of(Objects.requireNonNull(identityPoolId));
            return this;
        }
        public Builder identityProviderName(Output<String> identityProviderName) {
            this.identityProviderName = Objects.requireNonNull(identityProviderName);
            return this;
        }
        public Builder identityProviderName(String identityProviderName) {
            this.identityProviderName = Output.of(Objects.requireNonNull(identityProviderName));
            return this;
        }
        public Builder principalTags(@Nullable Output<Map<String,String>> principalTags) {
            this.principalTags = principalTags;
            return this;
        }
        public Builder principalTags(@Nullable Map<String,String> principalTags) {
            this.principalTags = Output.ofNullable(principalTags);
            return this;
        }
        public Builder useDefaults(@Nullable Output<Boolean> useDefaults) {
            this.useDefaults = useDefaults;
            return this;
        }
        public Builder useDefaults(@Nullable Boolean useDefaults) {
            this.useDefaults = Output.ofNullable(useDefaults);
            return this;
        }        public IdentityPoolProviderPrincipalTagArgs build() {
            return new IdentityPoolProviderPrincipalTagArgs(identityPoolId, identityProviderName, principalTags, useDefaults);
        }
    }
}