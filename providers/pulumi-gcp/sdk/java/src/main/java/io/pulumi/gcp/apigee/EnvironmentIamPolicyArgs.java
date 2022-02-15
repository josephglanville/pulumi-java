// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamPolicyArgs Empty = new EnvironmentIamPolicyArgs();

    @InputImport(name="envId", required=true)
    private final Input<String> envId;

    public Input<String> getEnvId() {
        return this.envId;
    }

    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public EnvironmentIamPolicyArgs(
        Input<String> envId,
        Input<String> orgId,
        Input<String> policyData) {
        this.envId = Objects.requireNonNull(envId, "expected parameter 'envId' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private EnvironmentIamPolicyArgs() {
        this.envId = Input.empty();
        this.orgId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> envId;
        private Input<String> orgId;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envId = defaults.envId;
    	      this.orgId = defaults.orgId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setEnvId(Input<String> envId) {
            this.envId = Objects.requireNonNull(envId);
            return this;
        }

        public Builder setEnvId(String envId) {
            this.envId = Input.of(Objects.requireNonNull(envId));
            return this;
        }

        public Builder setOrgId(Input<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder setOrgId(String orgId) {
            this.orgId = Input.of(Objects.requireNonNull(orgId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public EnvironmentIamPolicyArgs build() {
            return new EnvironmentIamPolicyArgs(envId, orgId, policyData);
        }
    }
}