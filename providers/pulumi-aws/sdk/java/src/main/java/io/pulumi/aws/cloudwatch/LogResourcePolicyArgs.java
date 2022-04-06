// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LogResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogResourcePolicyArgs Empty = new LogResourcePolicyArgs();

    /**
     * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    @Import(name="policyDocument", required=true)
      private final Output<String> policyDocument;

    public Output<String> getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * Name of the resource policy.
     * 
     */
    @Import(name="policyName", required=true)
      private final Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName;
    }

    public LogResourcePolicyArgs(
        Output<String> policyDocument,
        Output<String> policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private LogResourcePolicyArgs() {
        this.policyDocument = Output.empty();
        this.policyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyDocument;
        private Output<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(LogResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder policyDocument(Output<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = Output.of(Objects.requireNonNull(policyDocument));
            return this;
        }
        public Builder policyName(Output<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Output.of(Objects.requireNonNull(policyName));
            return this;
        }        public LogResourcePolicyArgs build() {
            return new LogResourcePolicyArgs(policyDocument, policyName);
        }
    }
}