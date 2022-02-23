// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final SecretIamPolicyState Empty = new SecretIamPolicyState();

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="secretId")
      private final @Nullable Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId == null ? Input.empty() : this.secretId;
    }

    public SecretIamPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> secretId) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.secretId = secretId;
    }

    private SecretIamPolicyState() {
        this.etag = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.secretId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.secretId = defaults.secretId;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSecretId(@Nullable Input<String> secretId) {
            this.secretId = secretId;
            return this;
        }

        public Builder setSecretId(@Nullable String secretId) {
            this.secretId = Input.ofNullable(secretId);
            return this;
        }
        public SecretIamPolicyState build() {
            return new SecretIamPolicyState(etag, policyData, project, secretId);
        }
    }
}
