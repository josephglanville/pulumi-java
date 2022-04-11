// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 agreement security settings.
 * 
 */
public final class X12SecuritySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12SecuritySettingsArgs Empty = new X12SecuritySettingsArgs();

    /**
     * The authorization qualifier.
     * 
     */
    @Import(name="authorizationQualifier", required=true)
      private final Output<String> authorizationQualifier;

    public Output<String> getAuthorizationQualifier() {
        return this.authorizationQualifier;
    }

    /**
     * The authorization value.
     * 
     */
    @Import(name="authorizationValue")
      private final @Nullable Output<String> authorizationValue;

    public Output<String> getAuthorizationValue() {
        return this.authorizationValue == null ? Codegen.empty() : this.authorizationValue;
    }

    /**
     * The password value.
     * 
     */
    @Import(name="passwordValue")
      private final @Nullable Output<String> passwordValue;

    public Output<String> getPasswordValue() {
        return this.passwordValue == null ? Codegen.empty() : this.passwordValue;
    }

    /**
     * The security qualifier.
     * 
     */
    @Import(name="securityQualifier", required=true)
      private final Output<String> securityQualifier;

    public Output<String> getSecurityQualifier() {
        return this.securityQualifier;
    }

    public X12SecuritySettingsArgs(
        Output<String> authorizationQualifier,
        @Nullable Output<String> authorizationValue,
        @Nullable Output<String> passwordValue,
        Output<String> securityQualifier) {
        this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier, "expected parameter 'authorizationQualifier' to be non-null");
        this.authorizationValue = authorizationValue;
        this.passwordValue = passwordValue;
        this.securityQualifier = Objects.requireNonNull(securityQualifier, "expected parameter 'securityQualifier' to be non-null");
    }

    private X12SecuritySettingsArgs() {
        this.authorizationQualifier = Codegen.empty();
        this.authorizationValue = Codegen.empty();
        this.passwordValue = Codegen.empty();
        this.securityQualifier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizationQualifier;
        private @Nullable Output<String> authorizationValue;
        private @Nullable Output<String> passwordValue;
        private Output<String> securityQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SecuritySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationQualifier = defaults.authorizationQualifier;
    	      this.authorizationValue = defaults.authorizationValue;
    	      this.passwordValue = defaults.passwordValue;
    	      this.securityQualifier = defaults.securityQualifier;
        }

        public Builder authorizationQualifier(Output<String> authorizationQualifier) {
            this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier);
            return this;
        }
        public Builder authorizationQualifier(String authorizationQualifier) {
            this.authorizationQualifier = Output.of(Objects.requireNonNull(authorizationQualifier));
            return this;
        }
        public Builder authorizationValue(@Nullable Output<String> authorizationValue) {
            this.authorizationValue = authorizationValue;
            return this;
        }
        public Builder authorizationValue(@Nullable String authorizationValue) {
            this.authorizationValue = Codegen.ofNullable(authorizationValue);
            return this;
        }
        public Builder passwordValue(@Nullable Output<String> passwordValue) {
            this.passwordValue = passwordValue;
            return this;
        }
        public Builder passwordValue(@Nullable String passwordValue) {
            this.passwordValue = Codegen.ofNullable(passwordValue);
            return this;
        }
        public Builder securityQualifier(Output<String> securityQualifier) {
            this.securityQualifier = Objects.requireNonNull(securityQualifier);
            return this;
        }
        public Builder securityQualifier(String securityQualifier) {
            this.securityQualifier = Output.of(Objects.requireNonNull(securityQualifier));
            return this;
        }        public X12SecuritySettingsArgs build() {
            return new X12SecuritySettingsArgs(authorizationQualifier, authorizationValue, passwordValue, securityQualifier);
        }
    }
}
