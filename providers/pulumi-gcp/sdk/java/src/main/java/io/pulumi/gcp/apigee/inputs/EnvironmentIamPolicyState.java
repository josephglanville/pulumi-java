// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamPolicyState Empty = new EnvironmentIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="envId")
      private final @Nullable Input<String> envId;

    public Input<String> getEnvId() {
        return this.envId == null ? Input.empty() : this.envId;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="orgId")
      private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
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

    public EnvironmentIamPolicyState(
        @Nullable Input<String> envId,
        @Nullable Input<String> etag,
        @Nullable Input<String> orgId,
        @Nullable Input<String> policyData) {
        this.envId = envId;
        this.etag = etag;
        this.orgId = orgId;
        this.policyData = policyData;
    }

    private EnvironmentIamPolicyState() {
        this.envId = Input.empty();
        this.etag = Input.empty();
        this.orgId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> envId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> orgId;
        private @Nullable Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envId = defaults.envId;
    	      this.etag = defaults.etag;
    	      this.orgId = defaults.orgId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setEnvId(@Nullable Input<String> envId) {
            this.envId = envId;
            return this;
        }

        public Builder setEnvId(@Nullable String envId) {
            this.envId = Input.ofNullable(envId);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
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
        public EnvironmentIamPolicyState build() {
            return new EnvironmentIamPolicyState(envId, etag, orgId, policyData);
        }
    }
}
