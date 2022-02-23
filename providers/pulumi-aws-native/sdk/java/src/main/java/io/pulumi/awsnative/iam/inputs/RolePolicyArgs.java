// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The inline policy document that is embedded in the specified IAM role.
 * 
 */
public final class RolePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RolePolicyArgs Empty = new RolePolicyArgs();

    /**
     * The policy document.
     * 
     */
    @InputImport(name="policyDocument", required=true)
      private final Input<String> policyDocument;

    public Input<String> getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * The friendly name (not ARN) identifying the policy.
     * 
     */
    @InputImport(name="policyName", required=true)
      private final Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName;
    }

    public RolePolicyArgs(
        Input<String> policyDocument,
        Input<String> policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private RolePolicyArgs() {
        this.policyDocument = Input.empty();
        this.policyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyDocument;
        private Input<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(RolePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder setPolicyDocument(Input<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }

        public Builder setPolicyDocument(String policyDocument) {
            this.policyDocument = Input.of(Objects.requireNonNull(policyDocument));
            return this;
        }

        public Builder setPolicyName(Input<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Input.of(Objects.requireNonNull(policyName));
            return this;
        }
        public RolePolicyArgs build() {
            return new RolePolicyArgs(policyDocument, policyName);
        }
    }
}
