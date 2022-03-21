// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConsentStoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreIamPolicyArgs Empty = new ConsentStoreIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataset", required=true)
      private final Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    public ConsentStoreIamPolicyArgs(
        Output<String> consentStoreId,
        Output<String> dataset,
        Output<String> policyData) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private ConsentStoreIamPolicyArgs() {
        this.consentStoreId = Output.empty();
        this.dataset = Output.empty();
        this.policyData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consentStoreId;
        private Output<String> dataset;
        private Output<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataset = defaults.dataset;
    	      this.policyData = defaults.policyData;
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }
        public Builder dataset(Output<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dataset(String dataset) {
            this.dataset = Output.of(Objects.requireNonNull(dataset));
            return this;
        }
        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }        public ConsentStoreIamPolicyArgs build() {
            return new ConsentStoreIamPolicyArgs(consentStoreId, dataset, policyData);
        }
    }
}
