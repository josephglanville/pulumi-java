// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopePacketHeaderStatementRequest;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeResourceStatementRequest;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAccessScopePathStatementRequest {
    private final @Nullable NetworkInsightsAccessScopePacketHeaderStatementRequest packetHeaderStatement;
    private final @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement;

    @CustomType.Constructor
    private NetworkInsightsAccessScopePathStatementRequest(
        @CustomType.Parameter("packetHeaderStatement") @Nullable NetworkInsightsAccessScopePacketHeaderStatementRequest packetHeaderStatement,
        @CustomType.Parameter("resourceStatement") @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement) {
        this.packetHeaderStatement = packetHeaderStatement;
        this.resourceStatement = resourceStatement;
    }

    public Optional<NetworkInsightsAccessScopePacketHeaderStatementRequest> getPacketHeaderStatement() {
        return Optional.ofNullable(this.packetHeaderStatement);
    }
    public Optional<NetworkInsightsAccessScopeResourceStatementRequest> getResourceStatement() {
        return Optional.ofNullable(this.resourceStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopePathStatementRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAccessScopePacketHeaderStatementRequest packetHeaderStatement;
        private @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopePathStatementRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packetHeaderStatement = defaults.packetHeaderStatement;
    	      this.resourceStatement = defaults.resourceStatement;
        }

        public Builder packetHeaderStatement(@Nullable NetworkInsightsAccessScopePacketHeaderStatementRequest packetHeaderStatement) {
            this.packetHeaderStatement = packetHeaderStatement;
            return this;
        }
        public Builder resourceStatement(@Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement) {
            this.resourceStatement = resourceStatement;
            return this;
        }        public NetworkInsightsAccessScopePathStatementRequest build() {
            return new NetworkInsightsAccessScopePathStatementRequest(packetHeaderStatement, resourceStatement);
        }
    }
}
