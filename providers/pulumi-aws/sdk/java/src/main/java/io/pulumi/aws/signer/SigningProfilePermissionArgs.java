// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfilePermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfilePermissionArgs Empty = new SigningProfilePermissionArgs();

    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, or `signer:RevokeSignature`.
     * 
     */
    @Import(name="action", required=true)
      private final Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }

    /**
     * The AWS principal to be granted a cross-account permission.
     * 
     */
    @Import(name="principal", required=true)
      private final Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal;
    }

    /**
     * Name of the signing profile to add the cross-account permissions.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }

    /**
     * The signing profile version that a permission applies to.
     * 
     */
    @Import(name="profileVersion")
      private final @Nullable Output<String> profileVersion;

    public Output<String> getProfileVersion() {
        return this.profileVersion == null ? Output.empty() : this.profileVersion;
    }

    /**
     * A unique statement identifier. By default generated by the provider.
     * 
     */
    @Import(name="statementId")
      private final @Nullable Output<String> statementId;

    public Output<String> getStatementId() {
        return this.statementId == null ? Output.empty() : this.statementId;
    }

    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Import(name="statementIdPrefix")
      private final @Nullable Output<String> statementIdPrefix;

    public Output<String> getStatementIdPrefix() {
        return this.statementIdPrefix == null ? Output.empty() : this.statementIdPrefix;
    }

    public SigningProfilePermissionArgs(
        Output<String> action,
        Output<String> principal,
        Output<String> profileName,
        @Nullable Output<String> profileVersion,
        @Nullable Output<String> statementId,
        @Nullable Output<String> statementIdPrefix) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.profileVersion = profileVersion;
        this.statementId = statementId;
        this.statementIdPrefix = statementIdPrefix;
    }

    private SigningProfilePermissionArgs() {
        this.action = Output.empty();
        this.principal = Output.empty();
        this.profileName = Output.empty();
        this.profileVersion = Output.empty();
        this.statementId = Output.empty();
        this.statementIdPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfilePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> action;
        private Output<String> principal;
        private Output<String> profileName;
        private @Nullable Output<String> profileVersion;
        private @Nullable Output<String> statementId;
        private @Nullable Output<String> statementIdPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfilePermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.principal = defaults.principal;
    	      this.profileName = defaults.profileName;
    	      this.profileVersion = defaults.profileVersion;
    	      this.statementId = defaults.statementId;
    	      this.statementIdPrefix = defaults.statementIdPrefix;
        }

        public Builder action(Output<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(String action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder principal(Output<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Output.of(Objects.requireNonNull(principal));
            return this;
        }
        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
            return this;
        }
        public Builder profileVersion(@Nullable Output<String> profileVersion) {
            this.profileVersion = profileVersion;
            return this;
        }
        public Builder profileVersion(@Nullable String profileVersion) {
            this.profileVersion = Output.ofNullable(profileVersion);
            return this;
        }
        public Builder statementId(@Nullable Output<String> statementId) {
            this.statementId = statementId;
            return this;
        }
        public Builder statementId(@Nullable String statementId) {
            this.statementId = Output.ofNullable(statementId);
            return this;
        }
        public Builder statementIdPrefix(@Nullable Output<String> statementIdPrefix) {
            this.statementIdPrefix = statementIdPrefix;
            return this;
        }
        public Builder statementIdPrefix(@Nullable String statementIdPrefix) {
            this.statementIdPrefix = Output.ofNullable(statementIdPrefix);
            return this;
        }        public SigningProfilePermissionArgs build() {
            return new SigningProfilePermissionArgs(action, principal, profileName, profileVersion, statementId, statementIdPrefix);
        }
    }
}