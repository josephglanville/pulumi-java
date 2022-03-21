// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.AuthorizerStatus;
import io.pulumi.awsnative.iot.inputs.AuthorizerTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerArgs Empty = new AuthorizerArgs();

    @Import(name="authorizerFunctionArn", required=true)
      private final Output<String> authorizerFunctionArn;

    public Output<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }

    @Import(name="authorizerName")
      private final @Nullable Output<String> authorizerName;

    public Output<String> getAuthorizerName() {
        return this.authorizerName == null ? Output.empty() : this.authorizerName;
    }

    @Import(name="signingDisabled")
      private final @Nullable Output<Boolean> signingDisabled;

    public Output<Boolean> getSigningDisabled() {
        return this.signingDisabled == null ? Output.empty() : this.signingDisabled;
    }

    @Import(name="status")
      private final @Nullable Output<AuthorizerStatus> status;

    public Output<AuthorizerStatus> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    @Import(name="tags")
      private final @Nullable Output<List<AuthorizerTagArgs>> tags;

    public Output<List<AuthorizerTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tokenKeyName")
      private final @Nullable Output<String> tokenKeyName;

    public Output<String> getTokenKeyName() {
        return this.tokenKeyName == null ? Output.empty() : this.tokenKeyName;
    }

    @Import(name="tokenSigningPublicKeys")
      private final @Nullable Output<Object> tokenSigningPublicKeys;

    public Output<Object> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys == null ? Output.empty() : this.tokenSigningPublicKeys;
    }

    public AuthorizerArgs(
        Output<String> authorizerFunctionArn,
        @Nullable Output<String> authorizerName,
        @Nullable Output<Boolean> signingDisabled,
        @Nullable Output<AuthorizerStatus> status,
        @Nullable Output<List<AuthorizerTagArgs>> tags,
        @Nullable Output<String> tokenKeyName,
        @Nullable Output<Object> tokenSigningPublicKeys) {
        this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn, "expected parameter 'authorizerFunctionArn' to be non-null");
        this.authorizerName = authorizerName;
        this.signingDisabled = signingDisabled;
        this.status = status;
        this.tags = tags;
        this.tokenKeyName = tokenKeyName;
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    private AuthorizerArgs() {
        this.authorizerFunctionArn = Output.empty();
        this.authorizerName = Output.empty();
        this.signingDisabled = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.tokenKeyName = Output.empty();
        this.tokenSigningPublicKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizerFunctionArn;
        private @Nullable Output<String> authorizerName;
        private @Nullable Output<Boolean> signingDisabled;
        private @Nullable Output<AuthorizerStatus> status;
        private @Nullable Output<List<AuthorizerTagArgs>> tags;
        private @Nullable Output<String> tokenKeyName;
        private @Nullable Output<Object> tokenSigningPublicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerFunctionArn = defaults.authorizerFunctionArn;
    	      this.authorizerName = defaults.authorizerName;
    	      this.signingDisabled = defaults.signingDisabled;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tokenKeyName = defaults.tokenKeyName;
    	      this.tokenSigningPublicKeys = defaults.tokenSigningPublicKeys;
        }

        public Builder authorizerFunctionArn(Output<String> authorizerFunctionArn) {
            this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn);
            return this;
        }
        public Builder authorizerFunctionArn(String authorizerFunctionArn) {
            this.authorizerFunctionArn = Output.of(Objects.requireNonNull(authorizerFunctionArn));
            return this;
        }
        public Builder authorizerName(@Nullable Output<String> authorizerName) {
            this.authorizerName = authorizerName;
            return this;
        }
        public Builder authorizerName(@Nullable String authorizerName) {
            this.authorizerName = Output.ofNullable(authorizerName);
            return this;
        }
        public Builder signingDisabled(@Nullable Output<Boolean> signingDisabled) {
            this.signingDisabled = signingDisabled;
            return this;
        }
        public Builder signingDisabled(@Nullable Boolean signingDisabled) {
            this.signingDisabled = Output.ofNullable(signingDisabled);
            return this;
        }
        public Builder status(@Nullable Output<AuthorizerStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable AuthorizerStatus status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<List<AuthorizerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<AuthorizerTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(AuthorizerTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder tokenKeyName(@Nullable Output<String> tokenKeyName) {
            this.tokenKeyName = tokenKeyName;
            return this;
        }
        public Builder tokenKeyName(@Nullable String tokenKeyName) {
            this.tokenKeyName = Output.ofNullable(tokenKeyName);
            return this;
        }
        public Builder tokenSigningPublicKeys(@Nullable Output<Object> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = tokenSigningPublicKeys;
            return this;
        }
        public Builder tokenSigningPublicKeys(@Nullable Object tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = Output.ofNullable(tokenSigningPublicKeys);
            return this;
        }        public AuthorizerArgs build() {
            return new AuthorizerArgs(authorizerFunctionArn, authorizerName, signingDisabled, status, tags, tokenKeyName, tokenSigningPublicKeys);
        }
    }
}
