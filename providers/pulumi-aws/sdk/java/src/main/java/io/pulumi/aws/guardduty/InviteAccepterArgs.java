// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InviteAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final InviteAccepterArgs Empty = new InviteAccepterArgs();

    /**
     * The detector ID of the member GuardDuty account.
     * 
     */
    @InputImport(name="detectorId", required=true)
      private final Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * AWS account ID for primary account.
     * 
     */
    @InputImport(name="masterAccountId", required=true)
      private final Output<String> masterAccountId;

    public Output<String> getMasterAccountId() {
        return this.masterAccountId;
    }

    public InviteAccepterArgs(
        Output<String> detectorId,
        Output<String> masterAccountId) {
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.masterAccountId = Objects.requireNonNull(masterAccountId, "expected parameter 'masterAccountId' to be non-null");
    }

    private InviteAccepterArgs() {
        this.detectorId = Output.empty();
        this.masterAccountId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InviteAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> detectorId;
        private Output<String> masterAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(InviteAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectorId = defaults.detectorId;
    	      this.masterAccountId = defaults.masterAccountId;
        }

        public Builder detectorId(Output<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder detectorId(String detectorId) {
            this.detectorId = Output.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder masterAccountId(Output<String> masterAccountId) {
            this.masterAccountId = Objects.requireNonNull(masterAccountId);
            return this;
        }

        public Builder masterAccountId(String masterAccountId) {
            this.masterAccountId = Output.of(Objects.requireNonNull(masterAccountId));
            return this;
        }
        public InviteAccepterArgs build() {
            return new InviteAccepterArgs(detectorId, masterAccountId);
        }
    }
}
