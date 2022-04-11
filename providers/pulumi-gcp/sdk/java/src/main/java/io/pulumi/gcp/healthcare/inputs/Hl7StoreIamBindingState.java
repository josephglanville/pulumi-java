// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamBindingState Empty = new Hl7StoreIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<Hl7StoreIamBindingConditionGetArgs> condition;

    public Output<Hl7StoreIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the HL7v2 store's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="hl7V2StoreId")
      private final @Nullable Output<String> hl7V2StoreId;

    public Output<String> getHl7V2StoreId() {
        return this.hl7V2StoreId == null ? Codegen.empty() : this.hl7V2StoreId;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Codegen.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public Hl7StoreIamBindingState(
        @Nullable Output<Hl7StoreIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> hl7V2StoreId,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.hl7V2StoreId = hl7V2StoreId;
        this.members = members;
        this.role = role;
    }

    private Hl7StoreIamBindingState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.hl7V2StoreId = Codegen.empty();
        this.members = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Hl7StoreIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> hl7V2StoreId;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<Hl7StoreIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable Hl7StoreIamBindingConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder hl7V2StoreId(@Nullable Output<String> hl7V2StoreId) {
            this.hl7V2StoreId = hl7V2StoreId;
            return this;
        }
        public Builder hl7V2StoreId(@Nullable String hl7V2StoreId) {
            this.hl7V2StoreId = Codegen.ofNullable(hl7V2StoreId);
            return this;
        }
        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }
        public Builder members(@Nullable List<String> members) {
            this.members = Codegen.ofNullable(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public Hl7StoreIamBindingState build() {
            return new Hl7StoreIamBindingState(condition, etag, hl7V2StoreId, members, role);
        }
    }
}
