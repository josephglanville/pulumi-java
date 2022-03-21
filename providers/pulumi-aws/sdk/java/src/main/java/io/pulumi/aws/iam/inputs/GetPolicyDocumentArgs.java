// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.aws.iam.inputs.GetPolicyDocumentStatement;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyDocumentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyDocumentArgs Empty = new GetPolicyDocumentArgs();

    /**
     * IAM policy document whose statements with non-blank `sid`s will override statements with the same `sid` from documents assigned to the `source_json`, `source_policy_documents`, and `override_policy_documents` arguments. Non-overriding statements will be added to the exported document.
     * 
     */
    @Import(name="overrideJson")
      private final @Nullable String overrideJson;

    public Optional<String> getOverrideJson() {
        return this.overrideJson == null ? Optional.empty() : Optional.ofNullable(this.overrideJson);
    }

    /**
     * List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from documents provided in the `source_json` and `source_policy_documents` arguments.  Non-overriding statements will be added to the exported document.
     * 
     */
    @Import(name="overridePolicyDocuments")
      private final @Nullable List<String> overridePolicyDocuments;

    public List<String> getOverridePolicyDocuments() {
        return this.overridePolicyDocuments == null ? List.of() : this.overridePolicyDocuments;
    }

    /**
     * ID for the policy document.
     * 
     */
    @Import(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * IAM policy document used as a base for the exported policy document. Statements with the same `sid` from documents assigned to the `override_json` and `override_policy_documents` arguments will override source statements.
     * 
     */
    @Import(name="sourceJson")
      private final @Nullable String sourceJson;

    public Optional<String> getSourceJson() {
        return this.sourceJson == null ? Optional.empty() : Optional.ofNullable(this.sourceJson);
    }

    /**
     * List of IAM policy documents that are merged together into the exported document. Statements defined in `source_policy_documents` or `source_json` must have unique `sid`s. Statements with the same `sid` from documents assigned to the `override_json` and `override_policy_documents` arguments will override source statements.
     * 
     */
    @Import(name="sourcePolicyDocuments")
      private final @Nullable List<String> sourcePolicyDocuments;

    public List<String> getSourcePolicyDocuments() {
        return this.sourcePolicyDocuments == null ? List.of() : this.sourcePolicyDocuments;
    }

    /**
     * Configuration block for a policy statement. Detailed below.
     * 
     */
    @Import(name="statements")
      private final @Nullable List<GetPolicyDocumentStatement> statements;

    public List<GetPolicyDocumentStatement> getStatements() {
        return this.statements == null ? List.of() : this.statements;
    }

    /**
     * IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetPolicyDocumentArgs(
        @Nullable String overrideJson,
        @Nullable List<String> overridePolicyDocuments,
        @Nullable String policyId,
        @Nullable String sourceJson,
        @Nullable List<String> sourcePolicyDocuments,
        @Nullable List<GetPolicyDocumentStatement> statements,
        @Nullable String version) {
        this.overrideJson = overrideJson;
        this.overridePolicyDocuments = overridePolicyDocuments;
        this.policyId = policyId;
        this.sourceJson = sourceJson;
        this.sourcePolicyDocuments = sourcePolicyDocuments;
        this.statements = statements;
        this.version = version;
    }

    private GetPolicyDocumentArgs() {
        this.overrideJson = null;
        this.overridePolicyDocuments = List.of();
        this.policyId = null;
        this.sourceJson = null;
        this.sourcePolicyDocuments = List.of();
        this.statements = List.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String overrideJson;
        private @Nullable List<String> overridePolicyDocuments;
        private @Nullable String policyId;
        private @Nullable String sourceJson;
        private @Nullable List<String> sourcePolicyDocuments;
        private @Nullable List<GetPolicyDocumentStatement> statements;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideJson = defaults.overrideJson;
    	      this.overridePolicyDocuments = defaults.overridePolicyDocuments;
    	      this.policyId = defaults.policyId;
    	      this.sourceJson = defaults.sourceJson;
    	      this.sourcePolicyDocuments = defaults.sourcePolicyDocuments;
    	      this.statements = defaults.statements;
    	      this.version = defaults.version;
        }

        public Builder overrideJson(@Nullable String overrideJson) {
            this.overrideJson = overrideJson;
            return this;
        }
        public Builder overridePolicyDocuments(@Nullable List<String> overridePolicyDocuments) {
            this.overridePolicyDocuments = overridePolicyDocuments;
            return this;
        }
        public Builder overridePolicyDocuments(String... overridePolicyDocuments) {
            return overridePolicyDocuments(List.of(overridePolicyDocuments));
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder sourceJson(@Nullable String sourceJson) {
            this.sourceJson = sourceJson;
            return this;
        }
        public Builder sourcePolicyDocuments(@Nullable List<String> sourcePolicyDocuments) {
            this.sourcePolicyDocuments = sourcePolicyDocuments;
            return this;
        }
        public Builder sourcePolicyDocuments(String... sourcePolicyDocuments) {
            return sourcePolicyDocuments(List.of(sourcePolicyDocuments));
        }
        public Builder statements(@Nullable List<GetPolicyDocumentStatement> statements) {
            this.statements = statements;
            return this;
        }
        public Builder statements(GetPolicyDocumentStatement... statements) {
            return statements(List.of(statements));
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetPolicyDocumentArgs build() {
            return new GetPolicyDocumentArgs(overrideJson, overridePolicyDocuments, policyId, sourceJson, sourcePolicyDocuments, statements, version);
        }
    }
}
