// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyAllowArgs;
import io.pulumi.gcp.projects.inputs.OrganizationPolicyListPolicyDenyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyArgs Empty = new OrganizationPolicyListPolicyArgs();

    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<OrganizationPolicyListPolicyAllowArgs> allow;

    public Input<OrganizationPolicyListPolicyAllowArgs> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    @InputImport(name="deny")
      private final @Nullable Input<OrganizationPolicyListPolicyDenyArgs> deny;

    public Input<OrganizationPolicyListPolicyDenyArgs> getDeny() {
        return this.deny == null ? Input.empty() : this.deny;
    }

    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    @InputImport(name="inheritFromParent")
      private final @Nullable Input<Boolean> inheritFromParent;

    public Input<Boolean> getInheritFromParent() {
        return this.inheritFromParent == null ? Input.empty() : this.inheritFromParent;
    }

    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    @InputImport(name="suggestedValue")
      private final @Nullable Input<String> suggestedValue;

    public Input<String> getSuggestedValue() {
        return this.suggestedValue == null ? Input.empty() : this.suggestedValue;
    }

    public OrganizationPolicyListPolicyArgs(
        @Nullable Input<OrganizationPolicyListPolicyAllowArgs> allow,
        @Nullable Input<OrganizationPolicyListPolicyDenyArgs> deny,
        @Nullable Input<Boolean> inheritFromParent,
        @Nullable Input<String> suggestedValue) {
        this.allow = allow;
        this.deny = deny;
        this.inheritFromParent = inheritFromParent;
        this.suggestedValue = suggestedValue;
    }

    private OrganizationPolicyListPolicyArgs() {
        this.allow = Input.empty();
        this.deny = Input.empty();
        this.inheritFromParent = Input.empty();
        this.suggestedValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyListPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OrganizationPolicyListPolicyAllowArgs> allow;
        private @Nullable Input<OrganizationPolicyListPolicyDenyArgs> deny;
        private @Nullable Input<Boolean> inheritFromParent;
        private @Nullable Input<String> suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyListPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder setAllow(@Nullable Input<OrganizationPolicyListPolicyAllowArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable OrganizationPolicyListPolicyAllowArgs allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setDeny(@Nullable Input<OrganizationPolicyListPolicyDenyArgs> deny) {
            this.deny = deny;
            return this;
        }

        public Builder setDeny(@Nullable OrganizationPolicyListPolicyDenyArgs deny) {
            this.deny = Input.ofNullable(deny);
            return this;
        }

        public Builder setInheritFromParent(@Nullable Input<Boolean> inheritFromParent) {
            this.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder setInheritFromParent(@Nullable Boolean inheritFromParent) {
            this.inheritFromParent = Input.ofNullable(inheritFromParent);
            return this;
        }

        public Builder setSuggestedValue(@Nullable Input<String> suggestedValue) {
            this.suggestedValue = suggestedValue;
            return this;
        }

        public Builder setSuggestedValue(@Nullable String suggestedValue) {
            this.suggestedValue = Input.ofNullable(suggestedValue);
            return this;
        }
        public OrganizationPolicyListPolicyArgs build() {
            return new OrganizationPolicyListPolicyArgs(allow, deny, inheritFromParent, suggestedValue);
        }
    }
}
