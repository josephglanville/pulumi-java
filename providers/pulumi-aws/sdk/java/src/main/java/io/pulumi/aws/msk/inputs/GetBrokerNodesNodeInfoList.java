// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBrokerNodesNodeInfoList extends io.pulumi.resources.InvokeArgs {

    public static final GetBrokerNodesNodeInfoList Empty = new GetBrokerNodesNodeInfoList();

    /**
     * The attached elastic network interface of the broker
     * 
     */
    @Import(name="attachedEniId", required=true)
      private final String attachedEniId;

    public String getAttachedEniId() {
        return this.attachedEniId;
    }

    /**
     * The ID of the broker
     * 
     */
    @Import(name="brokerId", required=true)
      private final Double brokerId;

    public Double getBrokerId() {
        return this.brokerId;
    }

    /**
     * The client subnet to which this broker node belongs
     * 
     */
    @Import(name="clientSubnet", required=true)
      private final String clientSubnet;

    public String getClientSubnet() {
        return this.clientSubnet;
    }

    /**
     * The client virtual private cloud (VPC) IP address
     * 
     */
    @Import(name="clientVpcIpAddress", required=true)
      private final String clientVpcIpAddress;

    public String getClientVpcIpAddress() {
        return this.clientVpcIpAddress;
    }

    /**
     * Set of endpoints for accessing the broker. This does not include ports
     * 
     */
    @Import(name="endpoints", required=true)
      private final List<String> endpoints;

    public List<String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * The Amazon Resource Name (ARN) of the node
     * 
     */
    @Import(name="nodeArn", required=true)
      private final String nodeArn;

    public String getNodeArn() {
        return this.nodeArn;
    }

    public GetBrokerNodesNodeInfoList(
        String attachedEniId,
        Double brokerId,
        String clientSubnet,
        String clientVpcIpAddress,
        List<String> endpoints,
        String nodeArn) {
        this.attachedEniId = Objects.requireNonNull(attachedEniId, "expected parameter 'attachedEniId' to be non-null");
        this.brokerId = Objects.requireNonNull(brokerId, "expected parameter 'brokerId' to be non-null");
        this.clientSubnet = Objects.requireNonNull(clientSubnet, "expected parameter 'clientSubnet' to be non-null");
        this.clientVpcIpAddress = Objects.requireNonNull(clientVpcIpAddress, "expected parameter 'clientVpcIpAddress' to be non-null");
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.nodeArn = Objects.requireNonNull(nodeArn, "expected parameter 'nodeArn' to be non-null");
    }

    private GetBrokerNodesNodeInfoList() {
        this.attachedEniId = null;
        this.brokerId = null;
        this.clientSubnet = null;
        this.clientVpcIpAddress = null;
        this.endpoints = List.of();
        this.nodeArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerNodesNodeInfoList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachedEniId;
        private Double brokerId;
        private String clientSubnet;
        private String clientVpcIpAddress;
        private List<String> endpoints;
        private String nodeArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerNodesNodeInfoList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedEniId = defaults.attachedEniId;
    	      this.brokerId = defaults.brokerId;
    	      this.clientSubnet = defaults.clientSubnet;
    	      this.clientVpcIpAddress = defaults.clientVpcIpAddress;
    	      this.endpoints = defaults.endpoints;
    	      this.nodeArn = defaults.nodeArn;
        }

        public Builder attachedEniId(String attachedEniId) {
            this.attachedEniId = Objects.requireNonNull(attachedEniId);
            return this;
        }
        public Builder brokerId(Double brokerId) {
            this.brokerId = Objects.requireNonNull(brokerId);
            return this;
        }
        public Builder clientSubnet(String clientSubnet) {
            this.clientSubnet = Objects.requireNonNull(clientSubnet);
            return this;
        }
        public Builder clientVpcIpAddress(String clientVpcIpAddress) {
            this.clientVpcIpAddress = Objects.requireNonNull(clientVpcIpAddress);
            return this;
        }
        public Builder endpoints(List<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder nodeArn(String nodeArn) {
            this.nodeArn = Objects.requireNonNull(nodeArn);
            return this;
        }        public GetBrokerNodesNodeInfoList build() {
            return new GetBrokerNodesNodeInfoList(attachedEniId, brokerId, clientSubnet, clientVpcIpAddress, endpoints, nodeArn);
        }
    }
}