// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamMemberState Empty = new FhirStoreIamMemberState();

    @InputImport(name="condition")
      private final @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition;

    public Output<FhirStoreIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="fhirStoreId")
      private final @Nullable Output<String> fhirStoreId;

    public Output<String> getFhirStoreId() {
        return this.fhirStoreId == null ? Output.empty() : this.fhirStoreId;
    }

    @InputImport(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public FhirStoreIamMemberState(
        @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> fhirStoreId,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.fhirStoreId = fhirStoreId;
        this.member = member;
        this.role = role;
    }

    private FhirStoreIamMemberState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.fhirStoreId = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> fhirStoreId;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<FhirStoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable FhirStoreIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder fhirStoreId(@Nullable Output<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder fhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Output.ofNullable(fhirStoreId);
            return this;
        }

        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
            return this;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public FhirStoreIamMemberState build() {
            return new FhirStoreIamMemberState(condition, etag, fhirStoreId, member, role);
        }
    }
}
