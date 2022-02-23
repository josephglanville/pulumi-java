// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamMemberArgs Empty = new Hl7StoreIamMemberArgs();

    @InputImport(name="condition")
      private final @Nullable Input<Hl7StoreIamMemberConditionArgs> condition;

    public Input<Hl7StoreIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="hl7V2StoreId", required=true)
      private final Input<String> hl7V2StoreId;

    public Input<String> getHl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    @InputImport(name="member", required=true)
      private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public Hl7StoreIamMemberArgs(
        @Nullable Input<Hl7StoreIamMemberConditionArgs> condition,
        Input<String> hl7V2StoreId,
        Input<String> member,
        Input<String> role) {
        this.condition = condition;
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private Hl7StoreIamMemberArgs() {
        this.condition = Input.empty();
        this.hl7V2StoreId = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Hl7StoreIamMemberConditionArgs> condition;
        private Input<String> hl7V2StoreId;
        private Input<String> member;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<Hl7StoreIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable Hl7StoreIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setHl7V2StoreId(Input<String> hl7V2StoreId) {
            this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId);
            return this;
        }

        public Builder setHl7V2StoreId(String hl7V2StoreId) {
            this.hl7V2StoreId = Input.of(Objects.requireNonNull(hl7V2StoreId));
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
        public Hl7StoreIamMemberArgs build() {
            return new Hl7StoreIamMemberArgs(condition, hl7V2StoreId, member, role);
        }
    }
}
