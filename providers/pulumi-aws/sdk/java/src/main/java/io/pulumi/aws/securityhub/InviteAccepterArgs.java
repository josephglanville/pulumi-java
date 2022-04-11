// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class InviteAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final InviteAccepterArgs Empty = new InviteAccepterArgs();

    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * 
     */
    @Import(name="masterId", required=true)
      private final Output<String> masterId;

    public Output<String> getMasterId() {
        return this.masterId;
    }

    public InviteAccepterArgs(Output<String> masterId) {
        this.masterId = Objects.requireNonNull(masterId, "expected parameter 'masterId' to be non-null");
    }

    private InviteAccepterArgs() {
        this.masterId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InviteAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> masterId;

        public Builder() {
    	      // Empty
        }

        public Builder(InviteAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterId = defaults.masterId;
        }

        public Builder masterId(Output<String> masterId) {
            this.masterId = Objects.requireNonNull(masterId);
            return this;
        }
        public Builder masterId(String masterId) {
            this.masterId = Output.of(Objects.requireNonNull(masterId));
            return this;
        }        public InviteAccepterArgs build() {
            return new InviteAccepterArgs(masterId);
        }
    }
}
