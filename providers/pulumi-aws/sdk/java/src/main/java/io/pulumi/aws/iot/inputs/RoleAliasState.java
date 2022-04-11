// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleAliasState extends io.pulumi.resources.ResourceArgs {

    public static final RoleAliasState Empty = new RoleAliasState();

    /**
     * The name of the role alias.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Codegen.empty() : this.alias;
    }

    /**
     * The ARN assigned by AWS to this role alias.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 43200 seconds (12 hours).
     * 
     */
    @Import(name="credentialDuration")
      private final @Nullable Output<Integer> credentialDuration;

    public Output<Integer> getCredentialDuration() {
        return this.credentialDuration == null ? Codegen.empty() : this.credentialDuration;
    }

    /**
     * The identity of the role to which the alias refers.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    public RoleAliasState(
        @Nullable Output<String> alias,
        @Nullable Output<String> arn,
        @Nullable Output<Integer> credentialDuration,
        @Nullable Output<String> roleArn) {
        this.alias = alias;
        this.arn = arn;
        this.credentialDuration = credentialDuration;
        this.roleArn = roleArn;
    }

    private RoleAliasState() {
        this.alias = Codegen.empty();
        this.arn = Codegen.empty();
        this.credentialDuration = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAliasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alias;
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> credentialDuration;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleAliasState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.credentialDuration = defaults.credentialDuration;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Codegen.ofNullable(alias);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder credentialDuration(@Nullable Output<Integer> credentialDuration) {
            this.credentialDuration = credentialDuration;
            return this;
        }
        public Builder credentialDuration(@Nullable Integer credentialDuration) {
            this.credentialDuration = Codegen.ofNullable(credentialDuration);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }        public RoleAliasState build() {
            return new RoleAliasState(alias, arn, credentialDuration, roleArn);
        }
    }
}
