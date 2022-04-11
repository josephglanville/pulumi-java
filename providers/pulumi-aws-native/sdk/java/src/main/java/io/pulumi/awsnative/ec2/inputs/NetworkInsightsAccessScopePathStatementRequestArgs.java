// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopePacketHeaderStatementRequestArgs;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeResourceStatementRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopePathStatementRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopePathStatementRequestArgs Empty = new NetworkInsightsAccessScopePathStatementRequestArgs();

    @Import(name="packetHeaderStatement")
      private final @Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement;

    public Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> getPacketHeaderStatement() {
        return this.packetHeaderStatement == null ? Codegen.empty() : this.packetHeaderStatement;
    }

    @Import(name="resourceStatement")
      private final @Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement;

    public Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> getResourceStatement() {
        return this.resourceStatement == null ? Codegen.empty() : this.resourceStatement;
    }

    public NetworkInsightsAccessScopePathStatementRequestArgs(
        @Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement,
        @Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement) {
        this.packetHeaderStatement = packetHeaderStatement;
        this.resourceStatement = resourceStatement;
    }

    private NetworkInsightsAccessScopePathStatementRequestArgs() {
        this.packetHeaderStatement = Codegen.empty();
        this.resourceStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopePathStatementRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement;
        private @Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopePathStatementRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packetHeaderStatement = defaults.packetHeaderStatement;
    	      this.resourceStatement = defaults.resourceStatement;
        }

        public Builder packetHeaderStatement(@Nullable Output<NetworkInsightsAccessScopePacketHeaderStatementRequestArgs> packetHeaderStatement) {
            this.packetHeaderStatement = packetHeaderStatement;
            return this;
        }
        public Builder packetHeaderStatement(@Nullable NetworkInsightsAccessScopePacketHeaderStatementRequestArgs packetHeaderStatement) {
            this.packetHeaderStatement = Codegen.ofNullable(packetHeaderStatement);
            return this;
        }
        public Builder resourceStatement(@Nullable Output<NetworkInsightsAccessScopeResourceStatementRequestArgs> resourceStatement) {
            this.resourceStatement = resourceStatement;
            return this;
        }
        public Builder resourceStatement(@Nullable NetworkInsightsAccessScopeResourceStatementRequestArgs resourceStatement) {
            this.resourceStatement = Codegen.ofNullable(resourceStatement);
            return this;
        }        public NetworkInsightsAccessScopePathStatementRequestArgs build() {
            return new NetworkInsightsAccessScopePathStatementRequestArgs(packetHeaderStatement, resourceStatement);
        }
    }
}
