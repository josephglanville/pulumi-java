// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NfsLocationOnPremConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsLocationOnPremConfigArgs Empty = new NfsLocationOnPremConfigArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
     * 
     */
    @Import(name="agentArns", required=true)
      private final Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }

    public NfsLocationOnPremConfigArgs(Output<List<String>> agentArns) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
    }

    private NfsLocationOnPremConfigArgs() {
        this.agentArns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsLocationOnPremConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> agentArns;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsLocationOnPremConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
        }

        public Builder agentArns(Output<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }
        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Output.of(Objects.requireNonNull(agentArns));
            return this;
        }
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }        public NfsLocationOnPremConfigArgs build() {
            return new NfsLocationOnPremConfigArgs(agentArns);
        }
    }
}
