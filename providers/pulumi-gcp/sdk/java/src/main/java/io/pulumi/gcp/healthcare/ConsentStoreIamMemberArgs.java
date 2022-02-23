// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreIamMemberArgs Empty = new ConsentStoreIamMemberArgs();

    @InputImport(name="condition")
      private final @Nullable Input<ConsentStoreIamMemberConditionArgs> condition;

    public Input<ConsentStoreIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="consentStoreId", required=true)
      private final Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="dataset", required=true)
      private final Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset;
    }

    @InputImport(name="member", required=true)
      private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ConsentStoreIamMemberArgs(
        @Nullable Input<ConsentStoreIamMemberConditionArgs> condition,
        Input<String> consentStoreId,
        Input<String> dataset,
        Input<String> member,
        Input<String> role) {
        this.condition = condition;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ConsentStoreIamMemberArgs() {
        this.condition = Input.empty();
        this.consentStoreId = Input.empty();
        this.dataset = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConsentStoreIamMemberConditionArgs> condition;
        private Input<String> consentStoreId;
        private Input<String> dataset;
        private Input<String> member;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataset = defaults.dataset;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<ConsentStoreIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ConsentStoreIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setConsentStoreId(Input<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder setConsentStoreId(String consentStoreId) {
            this.consentStoreId = Input.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder setDataset(Input<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDataset(String dataset) {
            this.dataset = Input.of(Objects.requireNonNull(dataset));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public ConsentStoreIamMemberArgs build() {
            return new ConsentStoreIamMemberArgs(condition, consentStoreId, dataset, member, role);
        }
    }
}
