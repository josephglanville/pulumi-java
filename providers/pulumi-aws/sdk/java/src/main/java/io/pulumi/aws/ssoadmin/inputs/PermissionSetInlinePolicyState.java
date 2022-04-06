// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionSetInlinePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionSetInlinePolicyState Empty = new PermissionSetInlinePolicyState();

    /**
     * The IAM inline policy to attach to a Permission Set.
     * 
     */
    @Import(name="inlinePolicy")
      private final @Nullable Output<String> inlinePolicy;

    public Output<String> getInlinePolicy() {
        return this.inlinePolicy == null ? Output.empty() : this.inlinePolicy;
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn")
      private final @Nullable Output<String> instanceArn;

    public Output<String> getInstanceArn() {
        return this.instanceArn == null ? Output.empty() : this.instanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn")
      private final @Nullable Output<String> permissionSetArn;

    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn == null ? Output.empty() : this.permissionSetArn;
    }

    public PermissionSetInlinePolicyState(
        @Nullable Output<String> inlinePolicy,
        @Nullable Output<String> instanceArn,
        @Nullable Output<String> permissionSetArn) {
        this.inlinePolicy = inlinePolicy;
        this.instanceArn = instanceArn;
        this.permissionSetArn = permissionSetArn;
    }

    private PermissionSetInlinePolicyState() {
        this.inlinePolicy = Output.empty();
        this.instanceArn = Output.empty();
        this.permissionSetArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionSetInlinePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> inlinePolicy;
        private @Nullable Output<String> instanceArn;
        private @Nullable Output<String> permissionSetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionSetInlinePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlinePolicy = defaults.inlinePolicy;
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
        }

        public Builder inlinePolicy(@Nullable Output<String> inlinePolicy) {
            this.inlinePolicy = inlinePolicy;
            return this;
        }
        public Builder inlinePolicy(@Nullable String inlinePolicy) {
            this.inlinePolicy = Output.ofNullable(inlinePolicy);
            return this;
        }
        public Builder instanceArn(@Nullable Output<String> instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }
        public Builder instanceArn(@Nullable String instanceArn) {
            this.instanceArn = Output.ofNullable(instanceArn);
            return this;
        }
        public Builder permissionSetArn(@Nullable Output<String> permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }
        public Builder permissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = Output.ofNullable(permissionSetArn);
            return this;
        }        public PermissionSetInlinePolicyState build() {
            return new PermissionSetInlinePolicyState(inlinePolicy, instanceArn, permissionSetArn);
        }
    }
}