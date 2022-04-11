// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionState Empty = new PermissionState();

    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     * 
     */
    @Import(name="allowSsh")
      private final @Nullable Output<Boolean> allowSsh;

    public Output<Boolean> getAllowSsh() {
        return this.allowSsh == null ? Codegen.empty() : this.allowSsh;
    }

    /**
     * Whether the user is allowed to use sudo to elevate privileges
     * 
     */
    @Import(name="allowSudo")
      private final @Nullable Output<Boolean> allowSudo;

    public Output<Boolean> getAllowSudo() {
        return this.allowSudo == null ? Codegen.empty() : this.allowSudo;
    }

    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
     * 
     */
    @Import(name="level")
      private final @Nullable Output<String> level;

    public Output<String> getLevel() {
        return this.level == null ? Codegen.empty() : this.level;
    }

    /**
     * The stack to set the permissions for
     * 
     */
    @Import(name="stackId")
      private final @Nullable Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId == null ? Codegen.empty() : this.stackId;
    }

    /**
     * The user's IAM ARN to set permissions for
     * 
     */
    @Import(name="userArn")
      private final @Nullable Output<String> userArn;

    public Output<String> getUserArn() {
        return this.userArn == null ? Codegen.empty() : this.userArn;
    }

    public PermissionState(
        @Nullable Output<Boolean> allowSsh,
        @Nullable Output<Boolean> allowSudo,
        @Nullable Output<String> level,
        @Nullable Output<String> stackId,
        @Nullable Output<String> userArn) {
        this.allowSsh = allowSsh;
        this.allowSudo = allowSudo;
        this.level = level;
        this.stackId = stackId;
        this.userArn = userArn;
    }

    private PermissionState() {
        this.allowSsh = Codegen.empty();
        this.allowSudo = Codegen.empty();
        this.level = Codegen.empty();
        this.stackId = Codegen.empty();
        this.userArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSsh;
        private @Nullable Output<Boolean> allowSudo;
        private @Nullable Output<String> level;
        private @Nullable Output<String> stackId;
        private @Nullable Output<String> userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSsh = defaults.allowSsh;
    	      this.allowSudo = defaults.allowSudo;
    	      this.level = defaults.level;
    	      this.stackId = defaults.stackId;
    	      this.userArn = defaults.userArn;
        }

        public Builder allowSsh(@Nullable Output<Boolean> allowSsh) {
            this.allowSsh = allowSsh;
            return this;
        }
        public Builder allowSsh(@Nullable Boolean allowSsh) {
            this.allowSsh = Codegen.ofNullable(allowSsh);
            return this;
        }
        public Builder allowSudo(@Nullable Output<Boolean> allowSudo) {
            this.allowSudo = allowSudo;
            return this;
        }
        public Builder allowSudo(@Nullable Boolean allowSudo) {
            this.allowSudo = Codegen.ofNullable(allowSudo);
            return this;
        }
        public Builder level(@Nullable Output<String> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable String level) {
            this.level = Codegen.ofNullable(level);
            return this;
        }
        public Builder stackId(@Nullable Output<String> stackId) {
            this.stackId = stackId;
            return this;
        }
        public Builder stackId(@Nullable String stackId) {
            this.stackId = Codegen.ofNullable(stackId);
            return this;
        }
        public Builder userArn(@Nullable Output<String> userArn) {
            this.userArn = userArn;
            return this;
        }
        public Builder userArn(@Nullable String userArn) {
            this.userArn = Codegen.ofNullable(userArn);
            return this;
        }        public PermissionState build() {
            return new PermissionState(allowSsh, allowSudo, level, stackId, userArn);
        }
    }
}
