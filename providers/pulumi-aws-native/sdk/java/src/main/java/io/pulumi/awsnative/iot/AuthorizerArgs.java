// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.AuthorizerStatus;
import io.pulumi.awsnative.iot.inputs.AuthorizerTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerArgs Empty = new AuthorizerArgs();

    @InputImport(name="authorizerFunctionArn", required=true)
      private final Input<String> authorizerFunctionArn;

    public Input<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }

    @InputImport(name="authorizerName")
      private final @Nullable Input<String> authorizerName;

    public Input<String> getAuthorizerName() {
        return this.authorizerName == null ? Input.empty() : this.authorizerName;
    }

    @InputImport(name="signingDisabled")
      private final @Nullable Input<Boolean> signingDisabled;

    public Input<Boolean> getSigningDisabled() {
        return this.signingDisabled == null ? Input.empty() : this.signingDisabled;
    }

    @InputImport(name="status")
      private final @Nullable Input<AuthorizerStatus> status;

    public Input<AuthorizerStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<AuthorizerTagArgs>> tags;

    public Input<List<AuthorizerTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tokenKeyName")
      private final @Nullable Input<String> tokenKeyName;

    public Input<String> getTokenKeyName() {
        return this.tokenKeyName == null ? Input.empty() : this.tokenKeyName;
    }

    @InputImport(name="tokenSigningPublicKeys")
      private final @Nullable Input<Object> tokenSigningPublicKeys;

    public Input<Object> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys == null ? Input.empty() : this.tokenSigningPublicKeys;
    }

    public AuthorizerArgs(
        Input<String> authorizerFunctionArn,
        @Nullable Input<String> authorizerName,
        @Nullable Input<Boolean> signingDisabled,
        @Nullable Input<AuthorizerStatus> status,
        @Nullable Input<List<AuthorizerTagArgs>> tags,
        @Nullable Input<String> tokenKeyName,
        @Nullable Input<Object> tokenSigningPublicKeys) {
        this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn, "expected parameter 'authorizerFunctionArn' to be non-null");
        this.authorizerName = authorizerName;
        this.signingDisabled = signingDisabled;
        this.status = status;
        this.tags = tags;
        this.tokenKeyName = tokenKeyName;
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    private AuthorizerArgs() {
        this.authorizerFunctionArn = Input.empty();
        this.authorizerName = Input.empty();
        this.signingDisabled = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tokenKeyName = Input.empty();
        this.tokenSigningPublicKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizerFunctionArn;
        private @Nullable Input<String> authorizerName;
        private @Nullable Input<Boolean> signingDisabled;
        private @Nullable Input<AuthorizerStatus> status;
        private @Nullable Input<List<AuthorizerTagArgs>> tags;
        private @Nullable Input<String> tokenKeyName;
        private @Nullable Input<Object> tokenSigningPublicKeys;

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

        public Builder setAuthorizerFunctionArn(Input<String> authorizerFunctionArn) {
            this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn);
            return this;
        }

        public Builder setAuthorizerFunctionArn(String authorizerFunctionArn) {
            this.authorizerFunctionArn = Input.of(Objects.requireNonNull(authorizerFunctionArn));
            return this;
        }

        public Builder setAuthorizerName(@Nullable Input<String> authorizerName) {
            this.authorizerName = authorizerName;
            return this;
        }

        public Builder setAuthorizerName(@Nullable String authorizerName) {
            this.authorizerName = Input.ofNullable(authorizerName);
            return this;
        }

        public Builder setSigningDisabled(@Nullable Input<Boolean> signingDisabled) {
            this.signingDisabled = signingDisabled;
            return this;
        }

        public Builder setSigningDisabled(@Nullable Boolean signingDisabled) {
            this.signingDisabled = Input.ofNullable(signingDisabled);
            return this;
        }

        public Builder setStatus(@Nullable Input<AuthorizerStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable AuthorizerStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<List<AuthorizerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AuthorizerTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTokenKeyName(@Nullable Input<String> tokenKeyName) {
            this.tokenKeyName = tokenKeyName;
            return this;
        }

        public Builder setTokenKeyName(@Nullable String tokenKeyName) {
            this.tokenKeyName = Input.ofNullable(tokenKeyName);
            return this;
        }

        public Builder setTokenSigningPublicKeys(@Nullable Input<Object> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = tokenSigningPublicKeys;
            return this;
        }

        public Builder setTokenSigningPublicKeys(@Nullable Object tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = Input.ofNullable(tokenSigningPublicKeys);
            return this;
        }
        public AuthorizerArgs build() {
            return new AuthorizerArgs(authorizerFunctionArn, authorizerName, signingDisabled, status, tags, tokenKeyName, tokenSigningPublicKeys);
        }
    }
}
