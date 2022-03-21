// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderDirection;
import io.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderProtocol;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupHeader extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupHeader Empty = new RuleGroupHeader();

    @Import(name="destination", required=true)
      private final String destination;

    public String getDestination() {
        return this.destination;
    }

    @Import(name="destinationPort", required=true)
      private final String destinationPort;

    public String getDestinationPort() {
        return this.destinationPort;
    }

    @Import(name="direction", required=true)
      private final RuleGroupHeaderDirection direction;

    public RuleGroupHeaderDirection getDirection() {
        return this.direction;
    }

    @Import(name="protocol", required=true)
      private final RuleGroupHeaderProtocol protocol;

    public RuleGroupHeaderProtocol getProtocol() {
        return this.protocol;
    }

    @Import(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    @Import(name="sourcePort", required=true)
      private final String sourcePort;

    public String getSourcePort() {
        return this.sourcePort;
    }

    public RuleGroupHeader(
        String destination,
        String destinationPort,
        RuleGroupHeaderDirection direction,
        RuleGroupHeaderProtocol protocol,
        String source,
        String sourcePort) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.destinationPort = Objects.requireNonNull(destinationPort, "expected parameter 'destinationPort' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourcePort = Objects.requireNonNull(sourcePort, "expected parameter 'sourcePort' to be non-null");
    }

    private RuleGroupHeader() {
        this.destination = null;
        this.destinationPort = null;
        this.direction = null;
        this.protocol = null;
        this.source = null;
        this.sourcePort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String destinationPort;
        private RuleGroupHeaderDirection direction;
        private RuleGroupHeaderProtocol protocol;
        private String source;
        private String sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationPort = defaults.destinationPort;
    	      this.direction = defaults.direction;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destinationPort(String destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }
        public Builder direction(RuleGroupHeaderDirection direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder protocol(RuleGroupHeaderProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }        public RuleGroupHeader build() {
            return new RuleGroupHeader(destination, destinationPort, direction, protocol, source, sourcePort);
        }
    }
}
