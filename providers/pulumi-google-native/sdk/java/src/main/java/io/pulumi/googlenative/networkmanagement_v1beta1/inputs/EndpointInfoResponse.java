// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. The specification of the endpoints for the test. EndpointInfo is derived from source and destination Endpoint and validated by the backend data plane model.
 * 
 */
public final class EndpointInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointInfoResponse Empty = new EndpointInfoResponse();

    /**
     * Destination IP address.
     * 
     */
    @Import(name="destinationIp", required=true)
      private final String destinationIp;

    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * URI of the network where this packet is sent to.
     * 
     */
    @Import(name="destinationNetworkUri", required=true)
      private final String destinationNetworkUri;

    public String getDestinationNetworkUri() {
        return this.destinationNetworkUri;
    }

    /**
     * Destination port. Only valid when protocol is TCP or UDP.
     * 
     */
    @Import(name="destinationPort", required=true)
      private final Integer destinationPort;

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * IP protocol in string format, for example: "TCP", "UDP", "ICMP".
     * 
     */
    @Import(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * URI of the source telemetry agent this packet originates from.
     * 
     */
    @Import(name="sourceAgentUri", required=true)
      private final String sourceAgentUri;

    public String getSourceAgentUri() {
        return this.sourceAgentUri;
    }

    /**
     * Source IP address.
     * 
     */
    @Import(name="sourceIp", required=true)
      private final String sourceIp;

    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * URI of the network where this packet originates from.
     * 
     */
    @Import(name="sourceNetworkUri", required=true)
      private final String sourceNetworkUri;

    public String getSourceNetworkUri() {
        return this.sourceNetworkUri;
    }

    /**
     * Source port. Only valid when protocol is TCP or UDP.
     * 
     */
    @Import(name="sourcePort", required=true)
      private final Integer sourcePort;

    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public EndpointInfoResponse(
        String destinationIp,
        String destinationNetworkUri,
        Integer destinationPort,
        String protocol,
        String sourceAgentUri,
        String sourceIp,
        String sourceNetworkUri,
        Integer sourcePort) {
        this.destinationIp = Objects.requireNonNull(destinationIp, "expected parameter 'destinationIp' to be non-null");
        this.destinationNetworkUri = Objects.requireNonNull(destinationNetworkUri, "expected parameter 'destinationNetworkUri' to be non-null");
        this.destinationPort = Objects.requireNonNull(destinationPort, "expected parameter 'destinationPort' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.sourceAgentUri = Objects.requireNonNull(sourceAgentUri, "expected parameter 'sourceAgentUri' to be non-null");
        this.sourceIp = Objects.requireNonNull(sourceIp, "expected parameter 'sourceIp' to be non-null");
        this.sourceNetworkUri = Objects.requireNonNull(sourceNetworkUri, "expected parameter 'sourceNetworkUri' to be non-null");
        this.sourcePort = Objects.requireNonNull(sourcePort, "expected parameter 'sourcePort' to be non-null");
    }

    private EndpointInfoResponse() {
        this.destinationIp = null;
        this.destinationNetworkUri = null;
        this.destinationPort = null;
        this.protocol = null;
        this.sourceAgentUri = null;
        this.sourceIp = null;
        this.sourceNetworkUri = null;
        this.sourcePort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationIp;
        private String destinationNetworkUri;
        private Integer destinationPort;
        private String protocol;
        private String sourceAgentUri;
        private String sourceIp;
        private String sourceNetworkUri;
        private Integer sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationNetworkUri = defaults.destinationNetworkUri;
    	      this.destinationPort = defaults.destinationPort;
    	      this.protocol = defaults.protocol;
    	      this.sourceAgentUri = defaults.sourceAgentUri;
    	      this.sourceIp = defaults.sourceIp;
    	      this.sourceNetworkUri = defaults.sourceNetworkUri;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder destinationIp(String destinationIp) {
            this.destinationIp = Objects.requireNonNull(destinationIp);
            return this;
        }
        public Builder destinationNetworkUri(String destinationNetworkUri) {
            this.destinationNetworkUri = Objects.requireNonNull(destinationNetworkUri);
            return this;
        }
        public Builder destinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sourceAgentUri(String sourceAgentUri) {
            this.sourceAgentUri = Objects.requireNonNull(sourceAgentUri);
            return this;
        }
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = Objects.requireNonNull(sourceIp);
            return this;
        }
        public Builder sourceNetworkUri(String sourceNetworkUri) {
            this.sourceNetworkUri = Objects.requireNonNull(sourceNetworkUri);
            return this;
        }
        public Builder sourcePort(Integer sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }        public EndpointInfoResponse build() {
            return new EndpointInfoResponse(destinationIp, destinationNetworkUri, destinationPort, protocol, sourceAgentUri, sourceIp, sourceNetworkUri, sourcePort);
        }
    }
}
